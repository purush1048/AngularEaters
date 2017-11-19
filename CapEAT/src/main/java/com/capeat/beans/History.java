
	package com.capeat.beans;

	import java.sql.Date;

	public class History {
		
		private String description;
		private String imageUrl;
		private int orderCount;
		private double price;
		private String productCode;
		private int productId;
		private String productName;
		private int orderamount;
		private int spice;
		private String location;
		private Date orderdt;
		private int orderId;
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getImageUrl() {
			return imageUrl;
		}
		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}
		public int getOrderCount() {
			return orderCount;
		}
		public void setOrderCount(int orderCount) {
			this.orderCount = orderCount;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getProductCode() {
			return productCode;
		}
		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}
		public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public int getOrderamount() {
			return orderamount;
		}
		public void setOrderamount(int orderamount) {
			this.orderamount = orderamount;
		}
		public int getSpice() {
			return spice;
		}
		public void setSpice(int spice) {
			this.spice = spice;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public Date getOrderdt() {
			return orderdt;
		}
		public void setOrderdt(Date orderdt) {
			this.orderdt = orderdt;
		}
		public int getOrderId() {
			return orderId;
		}
		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}
		public History() {
			super();
			// TODO Auto-generated constructor stub
		}
		public History(String description, String imageUrl, int orderCount, double price, String productCode,
				int productId, String productName, int orderamount, int spice, String location, Date orderdt,
				int orderId) {
			super();
			this.description = description;
			this.imageUrl = imageUrl;
			this.orderCount = orderCount;
			this.price = price;
			this.productCode = productCode;
			this.productId = productId;
			this.productName = productName;
			this.orderamount = orderamount;
			this.spice = spice;
			this.location = location;
			this.orderdt = orderdt;
			this.orderId = orderId;
		}
		@Override
		public String toString() {
			return "History [description=" + description + ", imageUrl=" + imageUrl + ", orderCount=" + orderCount
					+ ", price=" + price + ", productCode=" + productCode + ", productId=" + productId
					+ ", productName=" + productName + ", orderamount=" + orderamount + ", spice=" + spice
					+ ", location=" + location + ", orderdt=" + orderdt + ", orderId=" + orderId + "]";
		}
		
	
	}

