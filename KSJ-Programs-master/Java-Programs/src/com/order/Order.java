package com.order;
 
public class Order implements Comparable<Order> {

	  private String orderId;
	  private String orderState;
	  private String date;
	
	    public Order(String orderId, String orderState, String date) {
		super();
		this.orderId = orderId;
		this.orderState = orderState;
		this.date = date;
	}

		public String getOrderId() {
			return orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getOrderState() {
			return orderState;
		}

		public void setOrderState(String orderState) {
			this.orderState = orderState;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		@Override
		public int compareTo(Order o) {
			return getOrderState().compareTo(o.getOrderState());
		}

		@Override
		public String toString() {
			return "Order [orderId=" + orderId + ", orderState=" + orderState + ", date=" + date + "]";
		}
	  
	   
	 
}
