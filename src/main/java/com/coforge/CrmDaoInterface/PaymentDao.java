package com.coforge.CrmDaoInterface;

import java.sql.SQLException;

public interface PaymentDao {



	public void addPayment() throws SQLException;
	public void updatePayment() throws SQLException;
	public void deletePayment() throws SQLException;
	public void displayPayment()throws SQLException;
	
	
}
