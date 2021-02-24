package com.coforge.CrmDaoInterface;

import java.sql.SQLException;

public interface BranchDao {

	public void addBranch() throws SQLException;
	public void updateBranch() throws SQLException;
	public void deleteBranch() throws SQLException;
	public void displayBranch()throws SQLException;
	
}
