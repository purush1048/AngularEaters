import { Component,  OnInit } from '@angular/core';
import { AddCartComponent } from '../Addcart/addcart.component';
import { PaymentService } from '../Services/payments.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-paymentone',
  templateUrl: './paymentone.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentoneComponent implements OnInit {
 
  public total;
  public savecard = false;
  public deletecard = false;  
  public name;
  public cardnum;
  public exp;
  public seccode;
  public addcartobj;
  public try: any[] = [];
  public postalcode;
  public carddet : Object;
  public ordercredit : Object;
  public existingcard;
  public sid;
  public decision = 'none';
  public option = 1;
  public userstatus;
  public router;
  orderid;
  
  constructor(public pay: PaymentService, public routes: Router) {
    this.router = routes;
  }
  ngOnInit()  {
   this.sid = localStorage.getItem("sid");
   this.userstatus = localStorage.getItem("userstatus");
   
   this.existingcard = "************"+JSON.stringify(localStorage.getItem("existingcard")).substring(13, 17);  
  if(localStorage.getItem("lunchchef")!==undefined && localStorage.getItem("lunchchef")!== null ){
    this.total = JSON.parse(localStorage.getItem("amount"));    
    this.try.push(JSON.parse(localStorage.getItem("lunchchef")));
    this.addcartobj = this.try;
    }
    else{
      this.total = localStorage.getItem("total");  
          this.try.push(JSON.parse(sessionStorage.getItem("addcartarr")));
      console.log("hello"+sessionStorage.getItem("addcartarr"));
      this.addcartobj = JSON.parse(sessionStorage.getItem("addcartarr"));
      console.log("paymentssssssss"+this.addcartobj);

    }
}
  fetch() {
  //  console.log(this.deletecard);
    if((this.savecard === true) && (this.userstatus === 'HasData')){
      this.decision = "update";
    }
    if((this.savecard === true) && (this.userstatus === 'NoData')){
      this.decision = "insert";
    }
    if(this.deletecard === true){
      this.decision = "delete";
    }


    this.carddet = {
      "nameOnCard" :this.name,
      "cardNum" :this.cardnum,
      "exp" :this.exp,
      "cvc" :this.seccode,
      "zipCode": this.postalcode,
      "decision": this.decision
    };
    
    this.ordercredit = {
      "order": this.addcartobj,      
      "creditCard": this.carddet,
      "amount": this.total,
      "sid" : this.sid
    };
    this.pay.paynow(this.ordercredit).subscribe((resp) => {
        console.log(resp.json());
        localStorage.setItem("orderid",resp.json());
    });
 }
 
}




