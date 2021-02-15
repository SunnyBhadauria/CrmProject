package com.coforge.CrmBeanClass;

public class CumulativePoint {

	private int cumulativePointsID;
	   
	private   Product product;
	private	   Bill bill;
	private	   Payment payment;
	private   Customer customer;
	
	public CumulativePoint(int cumulativePointsID, Product product, Bill bill, Payment payment, Customer customer) {
		super();
		this.cumulativePointsID = cumulativePointsID;
		this.product = product;
		this.bill = bill;
		this.payment = payment;
		this.customer = customer;
	}
	public int getCumulativePointsID() {
		return cumulativePointsID;
	}
	public void setCumulativePointsID(int cumulativePointsID) {
		this.cumulativePointsID = cumulativePointsID;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cumulativePointsID;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CumulativePoint other = (CumulativePoint) obj;
		if (cumulativePointsID != other.cumulativePointsID)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CumulativePoint [cumulativePointsID=" + cumulativePointsID + ", product=" + product + ", bill=" + bill
				+ ", payment=" + payment + ", customer=" + customer + "]";
	}
	
	
	
}
