package com.coforge.javaCrmServiceClass;

import java.sql.SQLException;

import com.coforge.CrmDaoClass.BillDaoImp;
import com.coforge.CrmDaoInterface.BillDao;
import com.coforge.javaCrmServiceInterface.BillService;

public class BillServiceImp implements BillService {

	BillDao billDao=null;
	
	
	
	public BillServiceImp() {
		billDao=new BillDaoImp();
	}

	public void addBill() throws SQLException {
		billDao.addBill();		
	}

	public void updateBill() throws SQLException {
		billDao.updateBill();		
	}

	public void deleteBill() throws SQLException {
		billDao.deleteBill();		
	}

	public void displayBill() throws SQLException {
		billDao.displayBill();		
	}

}
