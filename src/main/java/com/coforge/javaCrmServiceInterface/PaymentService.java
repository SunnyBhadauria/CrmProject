package com.coforge.javaCrmServiceInterface;

import java.sql.SQLException;

public interface PaymentService {

	
	
	public void addPayment() throws SQLException;
	public void updatePayment() throws SQLException;
	public void deletePayment() throws SQLException;
	public void displayPayment()throws SQLException;
}
