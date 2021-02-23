package com.coforge.javaCrmServiceInterface;

import java.sql.SQLException;

public interface CustomerService {

	

	public void addCustomer() throws SQLException;
	public void updateCustomer() throws SQLException;
	public void deleteCustomer() throws SQLException;
	public void displayCustomer()throws SQLException;
	
}
