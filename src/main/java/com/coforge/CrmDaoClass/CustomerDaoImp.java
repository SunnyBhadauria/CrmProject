package com.coforge.CrmDaoClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.coforge.CrmBeanClass.Customer;
import com.coforge.CrmDaoInterface.CustomerDao;
import com.coforge.javaCrmDbConnect.DbConnect;
import com.coforge.javaCrmException.MyException;

public class CustomerDaoImp implements CustomerDao {

	
	static Connection con=null;
	static	PreparedStatement pst=null;
	static	Statement st=null;
	static ResultSet rs=null;
	
	Scanner sc=new Scanner(System.in);
	
	private static Set<Customer>setCustomer;
	
	public	CustomerDaoImp()
	{

	setCustomer=new TreeSet<Customer>();
	}
	public static int length(int num)
	{
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;		
		}			
		return count;			
	}
	
	
	public static Set<Customer> getSetCustomer() {
		return setCustomer;
	}
	public static void setSetCustomer(Set<Customer> setCustomer) {
		CustomerDaoImp.setCustomer = setCustomer;
	}
	public void addCustomer() throws SQLException 
	{
		try {
			con=DbConnect.dbConnect();
		    con.setAutoCommit(false);
		    String str="insert into Customer values (?,?,?,?,?)";
			pst=con.prepareStatement(str);
			Scanner sc=new Scanner(System.in);
					
			int id,flag=1,count;
			System.out.println("Enter customer id name Gift voucher BillId,PaymentId");
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
					     			pst.setInt(3, sc.nextInt());
					     			
					     			pst.setInt(4, sc.nextInt());
					     			pst.setInt(5, sc.nextInt());

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

	public void updateCustomer() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void deleteCustomer() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void displayCustomer() throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
