package com.coforge.CrmBeanClass;

public class Payment {


	private int	     paymentId;
	private double	  amount;
	private String	  modeOfPay;	
	private double   discount;
	
	public Payment(int paymentId, double amount, String modeOfPay, double discount) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.modeOfPay = modeOfPay;
		this.discount = discount;
	}
	
	public Payment() {
		super();
	}

	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getModeOfPay() {
		return modeOfPay;
	}
	public void setModeOfPay(String modeOfPay) {
		this.modeOfPay = modeOfPay;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(discount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((modeOfPay == null) ? 0 : modeOfPay.hashCode());
		result = prime * result + paymentId;
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
		Payment other = (Payment) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (Double.doubleToLongBits(discount) != Double.doubleToLongBits(other.discount))
			return false;
		if (modeOfPay == null) {
			if (other.modeOfPay != null)
				return false;
		} else if (!modeOfPay.equals(other.modeOfPay))
			return false;
		if (paymentId != other.paymentId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", amount=" + amount + ", modeOfPay=" + modeOfPay + ", discount="
				+ discount + "]";
	}
	
	
}
