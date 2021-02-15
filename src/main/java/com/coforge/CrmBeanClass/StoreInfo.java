package com.coforge.CrmBeanClass;

public class StoreInfo {
      private int storeInfoId;
	 private String  storeCountary;
	  private String  storeCity;
	  private String  StorePinCode;
	  private Store store;
	  
	public StoreInfo(int storeInfoId, String storeCountary, String storeCity, String storePinCode, Store store) {
		super();
		this.storeInfoId = storeInfoId;
		this.storeCountary = storeCountary;
		this.storeCity = storeCity;
		StorePinCode = storePinCode;
		this.store = store;
	}
	public int getStoreInfoId() {
		return storeInfoId;
	}
	public void setStoreInfoId(int storeInfoId) {
		this.storeInfoId = storeInfoId;
	}
	public String getStoreCountary() {
		return storeCountary;
	}
	public void setStoreCountary(String storeCountary) {
		this.storeCountary = storeCountary;
	}
	public String getStoreCity() {
		return storeCity;
	}
	public void setStoreCity(String storeCity) {
		this.storeCity = storeCity;
	}
	public String getStorePinCode() {
		return StorePinCode;
	}
	public void setStorePinCode(String storePinCode) {
		StorePinCode = storePinCode;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	@Override
	public String toString() {
		return "StoreInfo [storeInfoId=" + storeInfoId + ", storeCountary=" + storeCountary + ", storeCity=" + storeCity
				+ ", StorePinCode=" + StorePinCode + ", store=" + store + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((StorePinCode == null) ? 0 : StorePinCode.hashCode());
		result = prime * result + ((storeCity == null) ? 0 : storeCity.hashCode());
		result = prime * result + ((storeCountary == null) ? 0 : storeCountary.hashCode());
		result = prime * result + storeInfoId;
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
		StoreInfo other = (StoreInfo) obj;
		if (StorePinCode == null) {
			if (other.StorePinCode != null)
				return false;
		} else if (!StorePinCode.equals(other.StorePinCode))
			return false;
		if (storeCity == null) {
			if (other.storeCity != null)
				return false;
		} else if (!storeCity.equals(other.storeCity))
			return false;
		if (storeCountary == null) {
			if (other.storeCountary != null)
				return false;
		} else if (!storeCountary.equals(other.storeCountary))
			return false;
		if (storeInfoId != other.storeInfoId)
			return false;
		return true;
	}
	  
	
	
	
}
