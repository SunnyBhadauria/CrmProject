package com.coforge.javaCrmServiceClass;

import java.sql.SQLException;

import com.coforge.CrmDaoClass.BranchInfoDaoImp;
import com.coforge.CrmDaoInterface.BranchInfoDao;
import com.coforge.javaCrmServiceInterface.BranchInfoService;
import com.coforge.javaCrmServiceInterface.BranchService;

public class BranchInfoServiceImp implements BranchInfoService{

	
	BranchInfoDao branchInfoDao =null;
	
	
	
	public BranchInfoServiceImp() {
		branchInfoDao=new BranchInfoDaoImp();
	}



	public void addBranchInfo(BranchService b) throws SQLException {
		branchInfoDao.addBranchInfo(b);		
	}



	public void updateBranchInfo(BranchService b) throws SQLException {
		branchInfoDao.updateBranchInfo(b);		
	}



	public void deleteBranchInfo() throws SQLException {
		branchInfoDao.deleteBranchInfo();		
	}



	public void displayBranchInfo() throws SQLException {
		branchInfoDao.displayBranchInfo();		
	}




	
}
