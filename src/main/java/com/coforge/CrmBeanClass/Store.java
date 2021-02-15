package com.coforge.CrmBeanClass;

public class Store {

	 private int storeID;            
	  private String storeName;
	  
	public Store(int storeID, String storeName) {
		super();
		this.storeID = storeID;
		this.storeName = storeName;
	}
	public int getStoreID() {
		return storeID;
	}
	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	@Override
	public String toString() {
		return "Store [storeID=" + storeID + ", storeName=" + storeName + "]";
	}
	  
}
