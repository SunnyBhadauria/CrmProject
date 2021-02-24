package com.coforge.CrmDaoClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.Set;

import com.coforge.CrmBeanClass.Customer;
import com.coforge.CrmDaoInterface.BranchDao;
import com.coforge.CrmDaoInterface.BranchInfoDao;
import com.coforge.javaCrmDbConnect.DbConnect;
import com.coforge.javaCrmException.MyException;
import com.coforge.javaCrmServiceInterface.BranchService;

public class BranchInfoDaoImp  implements BranchInfoDao{

	
	static Connection con=null;
	static	PreparedStatement pst=null;
	static	Statement st=null;
	static ResultSet rs=null;
	
	Scanner sc=new Scanner(System.in);

	public void addBranchInfo(BranchService b) throws SQLException
	{

		
  try {
		con=DbConnect.dbConnect();
	    con.setAutoCommit(false);
	    String str="insert into Customer values (?,?,?,?)";
		pst=con.prepareStatement(str);
		Scanner sc=new Scanner(System.in);
				
		int id,flag=1,count;
		System.out.println("Enter customer id name contact and address");
          do
           {
	           try 
	           {
	                	id=	sc.nextInt();		
				     		if(CustomerDaoImp.length(id)>6)
				     		{
				     			throw new MyException("Id limit exceed 6 length");
				     		}
				     			else
				     			{	
				     			pst.setInt(1, id);
				     			pst.setString(2, sc.next());
				     			pst.setString(3, sc.next());
				     			pst.setString(4, sc.next());
				     			count = pst.executeUpdate();
				     			System.out.println("the no of row effected is "+count);
				     			flag=0;
				     			}
			   }
		       catch(MyException e)
			   {
			System.out.println("Exception "+e.getMessage());
			System.out.println("Renter coorect id length please");
			flag=1;
			   }
          }while(flag!=0);

	  }	
    catch(Exception e)
	{
		e.printStackTrace();
		con.rollback();
	 }
  finally 
  {
		try {
			con.commit();
			pst.close();
			con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
							
   }
		
		
	}

	public void updateBranchInfo(BranchService b) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void deleteBranchInfo() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void displayBranchInfo() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	


	
	
	
	

}