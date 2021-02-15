package com.coforge.CrmBeanClass;

public class BranchInfo {
	
	private int branchInfoId;
	 private String  branchCountary;
	 private String  branchStoreCity;
	 private int  branchPinCode;
    private Branch branch;
    
	public BranchInfo(int branchInfoId, String branchCountary, String branchStoreCity, int branchPinCode,
			Branch branch) {
		super();
		this.branchInfoId = branchInfoId;
		this.branchCountary = branchCountary;
		this.branchStoreCity = branchStoreCity;
		this.branchPinCode = branchPinCode;
		this.branch = branch;
	}
	public int getBranchInfoId() {
		return branchInfoId;
	}
	public void setBranchInfoId(int branchInfoId) {
		this.branchInfoId = branchInfoId;
	}
	public String getBranchCountary() {
		return branchCountary;
	}
	public void setBranchCountary(String branchCountary) {
		this.branchCountary = branchCountary;
	}
	public String getBranchStoreCity() {
		return branchStoreCity;
	}
	public void setBranchStoreCity(String branchStoreCity) {
		this.branchStoreCity = branchStoreCity;
	}
	public int getBranchPinCode() {
		return branchPinCode;
	}
	public void setBranchPinCode(int branchPinCode) {
		this.branchPinCode = branchPinCode;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((branchCountary == null) ? 0 : branchCountary.hashCode());
		result = prime * result + branchInfoId;
		result = prime * result + branchPinCode;
		result = prime * result + ((branchStoreCity == null) ? 0 : branchStoreCity.hashCode());
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
		BranchInfo other = (BranchInfo) obj;
		if (branchCountary == null) {
			if (other.branchCountary != null)
				return false;
		} else if (!branchCountary.equals(other.branchCountary))
			return false;
		if (branchInfoId != other.branchInfoId)
			return false;
		if (branchPinCode != other.branchPinCode)
			return false;
		if (branchStoreCity == null) {
			if (other.branchStoreCity != null)
				return false;
		} else if (!branchStoreCity.equals(other.branchStoreCity))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BranchInfo [branchInfoId=" + branchInfoId + ", branchCountary=" + branchCountary + ", branchStoreCity="
				+ branchStoreCity + ", branchPinCode=" + branchPinCode + ", branch=" + branch + "]";
	}
    
	 
}
