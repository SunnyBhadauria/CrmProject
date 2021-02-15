package com.coforge.CrmBeanClass;

public class CustomerInfo {

	private int	 custInfoId;
	private String  custMob;
	private String  custDOB;
	private String  custCountary;
	private String  custcity;
	private int     custpincode;
	
	private Customer customer;

	public CustomerInfo(int custInfoId, String custMob, String custDOB, String custCountary, String custcity,
			int custpincode, Customer customer) {
		super();
		this.custInfoId = custInfoId;
		this.custMob = custMob;
		this.custDOB = custDOB;
		this.custCountary = custCountary;
		this.custcity = custcity;
		this.custpincode = custpincode;
		this.customer = customer;
	}

	public int getCustInfoId() {
		return custInfoId;
	}

	public void setCustInfoId(int custInfoId) {
		this.custInfoId = custInfoId;
	}

	public String getCustMob() {
		return custMob;
	}

	public void setCustMob(String custMob) {
		this.custMob = custMob;
	}

	public String getCustDOB() {
		return custDOB;
	}

	public void setCustDOB(String custDOB) {
		this.custDOB = custDOB;
	}

	public String getCustCountary() {
		return custCountary;
	}

	public void setCustCountary(String custCountary) {
		this.custCountary = custCountary;
	}

	public String getCustcity() {
		return custcity;
	}

	public void setCustcity(String custcity) {
		this.custcity = custcity;
	}

	public int getCustpincode() {
		return custpincode;
	}

	public void setCustpincode(int custpincode) {
		this.custpincode = custpincode;
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
		result = prime * result + ((custCountary == null) ? 0 : custCountary.hashCode());
		result = prime * result + ((custDOB == null) ? 0 : custDOB.hashCode());
		result = prime * result + custInfoId;
		result = prime * result + ((custMob == null) ? 0 : custMob.hashCode());
		result = prime * result + ((custcity == null) ? 0 : custcity.hashCode());
		result = prime * result + custpincode;
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
		CustomerInfo other = (CustomerInfo) obj;
		if (custCountary == null) {
			if (other.custCountary != null)
				return false;
		} else if (!custCountary.equals(other.custCountary))
			return false;
		if (custDOB == null) {
			if (other.custDOB != null)
				return false;
		} else if (!custDOB.equals(other.custDOB))
			return false;
		if (custInfoId != other.custInfoId)
			return false;
		if (custMob == null) {
			if (other.custMob != null)
				return false;
		} else if (!custMob.equals(other.custMob))
			return false;
		if (custcity == null) {
			if (other.custcity != null)
				return false;
		} else if (!custcity.equals(other.custcity))
			return false;
		if (custpincode != other.custpincode)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CustomerInfo [custInfoId=" + custInfoId + ", custMob=" + custMob + ", custDOB=" + custDOB
				+ ", custCountary=" + custCountary + ", custcity=" + custcity + ", custpincode=" + custpincode
				+ ", customer=" + customer + "]";
	}
	
	
	
	
}
