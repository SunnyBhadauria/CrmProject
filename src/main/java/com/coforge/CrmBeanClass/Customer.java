package com.coforge.CrmBeanClass;

public class Customer {

	private int  custID;
	private String  custName;
	private double giftVoucher;
	
	private int  BillId;
	private int	     paymentId;
	
	private Bill bill;
	private Payment payment;
	
	
	
	public Customer(int custID, String custName, double giftVoucher, int billId, int paymentId) {
		super();
		this.custID = custID;
		this.custName = custName;
		this.giftVoucher = giftVoucher;
		BillId = billId;
		this.paymentId = paymentId;
	}
	public Customer(int custID, String custName, double giftVoucher, Bill bill, Payment payment) {
		super();
		this.custID = custID;
		this.custName = custName;
		this.giftVoucher = giftVoucher;
		this.bill = bill;
		this.payment = payment;
	}
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getGiftVoucher() {
		return giftVoucher;
	}
	public void setGiftVoucher(double giftVoucher) {
		this.giftVoucher = giftVoucher;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + custID;
		result = prime * result + ((custName == null) ? 0 : custName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(giftVoucher);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Customer other = (Customer) obj;
		if (custID != other.custID)
			return false;
		if (custName == null) {
			if (other.custName != null)
				return false;
		} else if (!custName.equals(other.custName))
			return false;
		if (Double.doubleToLongBits(giftVoucher) != Double.doubleToLongBits(other.giftVoucher))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", custName=" + custName + ", giftVoucher=" + giftVoucher + ", bill="
				+ bill + ", payment=" + payment + "]";
	}
	
	
	
	
}
