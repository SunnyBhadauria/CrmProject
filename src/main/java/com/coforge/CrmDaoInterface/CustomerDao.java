package com.coforge.CrmDaoInterface;

import java.sql.SQLException;

public interface CustomerDao {


	public void addCustomer() throws SQLException;
	public void updateCustomer() throws SQLException;
	public void deleteCustomer() throws SQLException;
	public void displayCustomer()throws SQLException;
	
	
}
