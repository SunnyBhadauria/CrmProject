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
	
	private static Customer customer;
	
	
	public static Customer getCustomer() {
		return customer;
	}
	public static void setCustomer(Customer customer) {
		CustomerDaoImp.customer = customer;
	}
	public	CustomerDaoImp()
	{

	setCustomer=new TreeSet<Customer>();
	customer=new Customer();
	
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
			System.out.println("Enter customer id, name,Gift voucher " );
	          do
	           {
		           try 
		           {
		                	id=	sc.nextInt();
		                	customer.setCustID(id);
					     		if(CustomerDaoImp.length(id)>6)
					     		{
					     			throw new MyException("Id limit exceed 6 length");
					     		}
					     			else
					     			{	
					     			customer.setCustName(sc.next());
					     			customer.setGiftVoucher(sc.nextInt());
					     			
					     			pst.setInt(1, id);
					     			pst.setString(2, customer.getCustName());
					     			pst.setInt(3,customer.getGiftVoucher());
					     			
					     			 customer.setBill(BillDaoImp.getBill());
						     			pst.setInt(4, customer.getBill().getBillId());
					     			
					     			 customer.setPayment(PaymentDaoImp.getPay());
				     	             pst.setInt(5, customer.getPayment().getPaymentId());
				     	             
				     	             
				     	             //setCustomer.add(customer);
				     	             
				     	             
					     			count = pst.executeUpdate();
					     			
					     		//	setCustomer.add(customer);
					     			
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

	public void displayCustomer() throws SQLException 
	{
		try {
			con=DbConnect.dbConnect();
		    con.setAutoCommit(false);
		    st=con.createStatement();
		    
//		    String str="insert into Customer values (?,?)";
//		 			pst=con.prepareStatement(str);
//		    
//		    customer.setBill(BillDaoImp.getBill());
// 			pst.setInt(4, customer.getBill().getBillId());
//			
//			 customer.setPayment(PaymentDaoImp.getPay());
//          pst.setInt(5, customer.getPayment().getPaymentId());
//			
//		    setCustomer.add(customer);
//	
	       String query="select * from Customer";
    
          rs=st.executeQuery(query);
    
    System.out.println("Retrieved data is ");
    
	    while(rs.next())
	    {
	  	  System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getInt(3)+" : "+rs.getInt(4)+" : "+rs.getInt(5));
	  
		  
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
