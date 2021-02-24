package com.coforge.CrmBeanClass;

public class Product {

	private int     productID;
	private String     producttype;
	private int     productQuantity;
	private double     productMRP;
	
	
	
	public Product() {
		super();
	}
	public Product(int productID, String producttype, int productQuantity, double productMRP) {
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
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public double getProductMRP() {
		return productMRP;
	}
	public void setProductMRP(double productMRP) {
		this.productMRP = productMRP;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + productID;
		long temp;
		temp = Double.doubleToLongBits(productMRP);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + productQuantity;
		result = prime * result + ((producttype == null) ? 0 : producttype.hashCode());
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
		Product other = (Product) obj;
		if (productID != other.productID)
			return false;
		if (Double.doubleToLongBits(productMRP) != Double.doubleToLongBits(other.productMRP))
			return false;
		if (productQuantity != other.productQuantity)
			return false;
		if (producttype == null) {
			if (other.producttype != null)
				return false;
		} else if (!producttype.equals(other.producttype))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", producttype=" + producttype + ", productQuantity="
				+ productQuantity + ", productMRP=" + productMRP + "]";
	}
	
	
	  
}
