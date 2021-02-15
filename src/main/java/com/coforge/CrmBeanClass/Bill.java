package com.coforge.CrmBeanClass;

public class Bill {

	private int  BillId;

	private Product product;

	public Bill(int billId, Product product) {
		super();
		BillId = billId;
		this.product = product;
	}

	public int getBillId() {
		return BillId;
	}

	public void setBillId(int billId) {
		BillId = billId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + BillId;
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
		Bill other = (Bill) obj;
		if (BillId != other.BillId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bill [BillId=" + BillId + ", product=" + product + "]";
	}
	
	
}
