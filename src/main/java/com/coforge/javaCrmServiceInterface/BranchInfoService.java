package com.coforge.javaCrmServiceInterface;

import java.sql.SQLException;

public interface BranchInfoService {

	

	public void addBranchInfo(BranchService b) throws SQLException;
	public void updateBranchInfo(BranchService b) throws SQLException;
	public void deleteBranchInfo() throws SQLException;
	public void displayBranchInfo()throws SQLException;
	
}
