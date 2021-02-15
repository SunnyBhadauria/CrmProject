package com.coforge.CrmBeanClass;

public class Employee {
	
	
	private int 	  employeeId;
	private String    employeeName;
	
	private  Customer  customer;	
	private  Product product;	
	private  Bill bill;	
	private  Payment payment;	 
	private Card  card;
	
	public Employee(int employeeId, String employeeName, Customer customer, Product product, Bill bill, Payment payment,
			Card card) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.customer = customer;
		this.product = product;
		this.bill = bill;
		this.payment = payment;
		this.card = card;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
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
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
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
		Employee other = (Employee) obj;
		if (employeeId != other.employeeId)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", customer=" + customer
				+ ", product=" + product + ", bill=" + bill + ", payment=" + payment + ", card=" + card + "]";
	}
	
	
}
