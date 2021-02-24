package com.coforge.CrmDaoInterface;

import java.sql.SQLException;

import com.coforge.javaCrmServiceInterface.BranchService;

public interface BranchInfoDao {



	public void addBranchInfo(BranchService b) throws SQLException;
	public void updateBranchInfo(BranchService b) throws SQLException;
	public void deleteBranchInfo() throws SQLException;
	public void displayBranchInfo()throws SQLException;
}
