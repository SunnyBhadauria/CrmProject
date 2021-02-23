package com.coforge.javaCrmServiceClass;

import java.sql.SQLException;

import com.coforge.CrmDaoClass.CustomerDaoImp;
import com.coforge.CrmDaoInterface.CustomerDao;
import com.coforge.javaCrmServiceInterface.CustomerService;

public class CustomerServiceImp implements CustomerService {

	
CustomerDao customerDao=null;
	
	public CustomerServiceImp()
	{
		customerDao=new CustomerDaoImp();
		
	}
	
	
	
	
	public void addCustomer() throws SQLException {
		customerDao.addCustomer();		
	}

	public void updateCustomer() throws SQLException {
		customerDao.updateCustomer();		
	}

	public void deleteCustomer() throws SQLException {
		customerDao.deleteCustomer();		
	}

	public void displayCustomer() throws SQLException {
		customerDao.displayCustomer();		
	}

}
