package com.coforge.javaCrmServiceClass;

import java.sql.SQLException;

import com.coforge.CrmDaoClass.PaymentDaoImp;
import com.coforge.CrmDaoInterface.PaymentDao;
import com.coforge.javaCrmServiceInterface.PaymentService;

public class PaymentServiceImp implements PaymentService  {

	
	PaymentDao paymentDao =null;
	
	
	
	public PaymentServiceImp() {
		paymentDao =new PaymentDaoImp();
	}

	public void addPayment() throws SQLException {
		paymentDao.addPayment();		
	}

	public void updatePayment() throws SQLException {
		paymentDao.updatePayment();		
	}

	public void deletePayment() throws SQLException {
		paymentDao.deletePayment();		
	}

	public void displayPayment() throws SQLException {
		paymentDao.displayPayment();		
	}

}
