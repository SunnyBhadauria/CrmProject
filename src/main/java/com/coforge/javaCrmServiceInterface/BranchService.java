package com.coforge.javaCrmServiceInterface;

import java.sql.SQLException;

public interface BranchService {

	public void addBranch() throws SQLException;
	public void updateBranch() throws SQLException;
	public void deleteBranch() throws SQLException;
	public void displayBranch()throws SQLException;
}
