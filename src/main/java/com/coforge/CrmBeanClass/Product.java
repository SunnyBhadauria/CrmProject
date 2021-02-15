package com.coforge.CrmBeanClass;

public class Product {

	private int     productID;
	private String     producttype;
	private String     productQuantity;
	private double     productMRP;
	
	public Product(int productID, String producttype, String productQuantity, double productMRP) {
		super();
		this.productID = productID;
		this.producttype = producttype;
		this.productQuantity = productQuantity;
		this.productMRP = productMRP;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProducttype() {
		return producttype;
	}
	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}
	public String getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}
	public double getProductMRP() {
		return productMRP;
	}
	public void setProductMRP(double productMRP) {
		this.productMRP = productMRP;
	}
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", producttype=" + producttype + ", productQuantity="
				+ productQuantity + ", productMRP=" + productMRP + "]";
	}
	  
}
