package com.coforge.CrmDaoInterface;

import java.sql.SQLException;

public interface ProductDao {

	public void addProduct() throws SQLException;
	public void updateProduct() throws SQLException;
	public void deleteProduct() throws SQLException;
	public void displayProduct()throws SQLException;
	
}
