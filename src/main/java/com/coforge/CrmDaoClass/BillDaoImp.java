package com.coforge.CrmDaoClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.coforge.CrmBeanClass.Bill;
import com.coforge.CrmDaoInterface.BillDao;
import com.coforge.javaCrmDbConnect.DbConnect;
import com.coforge.javaCrmException.MyException;

public class BillDaoImp implements BillDao {

	
	
	static Connection con=null;
	static	PreparedStatement pst=null;
	static	Statement st=null;
	static ResultSet rs=null;
	
	Scanner sc=new Scanner(System.in);
	
	private static Bill bill;
	private static Set<Bill> setBill;
	
	
	public static Bill getBill() {
		return bill;
	}

	public static void setBill(Bill bill) {
		BillDaoImp.bill = bill;
	}

	public static Set<Bill> getSetBill() {
		return setBill;
	}

	public static void setSetBill(Set<Bill> setBill) {
		BillDaoImp.setBill = setBill;
	}

	public BillDaoImp() {
		bill=new Bill();
		setBill=new TreeSet<Bill>();
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
	
	public void addBill() throws SQLException
	{
		
		try {
			con=DbConnect.dbConnect();
		    con.setAutoCommit(false);
		    String str="insert into Billing values (?,?)";
			pst=con.prepareStatement(str);
			Scanner sc=new Scanner(System.in);
					
			int id,flag=1,count;
			System.out.println("Enter Bill id");
	          do
	           {
		           try 
		           {
		                	id=	sc.nextInt();		
					     		if(BillDaoImp.length(id)>6)
					     		{
					     			throw new MyException("Id limit exceed 6 length");
					     		}
					     			else
					     			{	
					     		bill.setBillId(id);
					     		bill.setProduct(ProductDaoImp.getProduct());
					     			
					     			pst.setInt(1,bill.getBillId());
					     		
					     			pst.setInt(2,bill.getProduct().getProductID());
                                   
				     		
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

	public void updateBill() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void deleteBill() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void displayBill() throws SQLException {
		try {
			con=DbConnect.dbConnect();
		    con.setAutoCommit(false);
		    st=con.createStatement();
	
	       String query="select * from Billing";
    
          rs=st.executeQuery(query);
    
    System.out.println("Retrieved data is ");
    
	    while(rs.next())
	    {
	  	  System.out.println(rs.getInt(1)+" : "+rs.getInt(2));
	 
		  
	    }
    } catch(Exception e)
	{
		e.printStackTrace();
		con.rollback();
	 }
  finally 
  {
		try {
			con.commit();
			st.close();
			con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
							
   }		
	}

	
	
	
}
