package com.coforge.CrmDaoInterface;

import java.sql.SQLException;

public interface BillDao {

	public void addBill() throws SQLException;
	public void updateBill() throws SQLException;
	public void deleteBill() throws SQLException;
	public void displayBill()throws SQLException;
}
