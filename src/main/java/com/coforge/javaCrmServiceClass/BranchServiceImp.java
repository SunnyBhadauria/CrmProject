package com.coforge.javaCrmServiceClass;

import java.sql.SQLException;

import com.coforge.CrmDaoClass.BranchDaoImp;
import com.coforge.CrmDaoInterface.BranchDao;
import com.coforge.javaCrmServiceInterface.BranchService;

public class BranchServiceImp implements BranchService {

	BranchDao branchDao =null;
	
	
	 
	public BranchServiceImp() {
		branchDao=new BranchDaoImp();
	}

	public void addBranch() throws SQLException {
		branchDao.addBranch();
		
	}

	public void updateBranch() throws SQLException {
		branchDao.updateBranch();		
	}

	public void deleteBranch() throws SQLException {
		branchDao.deleteBranch();		
	}

	public void displayBranch() throws SQLException {
		branchDao.displayBranch();		
	}

}
