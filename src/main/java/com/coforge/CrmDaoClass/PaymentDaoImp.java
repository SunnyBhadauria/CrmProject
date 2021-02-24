package com.coforge.CrmDaoClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.coforge.CrmBeanClass.Payment;
import com.coforge.CrmBeanClass.Product;
import com.coforge.CrmDaoInterface.PaymentDao;
import com.coforge.javaCrmDbConnect.DbConnect;
import com.coforge.javaCrmException.MyException;

public class PaymentDaoImp implements PaymentDao {

	static Connection con=null;
	static	PreparedStatement pst=null;
	static	Statement st=null;
	static ResultSet rs=null;
	
	Scanner sc=new Scanner(System.in);
private static Set<Payment> setPayment;

 private static Payment pay;
	
 
public static Payment getPay() {
	return pay;
}
public static void setPay(Payment pay) {
	PaymentDaoImp.pay = pay;
}


	public	PaymentDaoImp()
	{
        pay=new Payment();
		setPayment=new TreeSet<Payment>();
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
	
	
	public void addPayment() throws SQLException
	{

		try {
			con=DbConnect.dbConnect();
		    con.setAutoCommit(false);
		    String str="insert into Payment values (?,?,?,?)";
			pst=con.prepareStatement(str);
			Scanner sc=new Scanner(System.in);
					
			int id,flag=1,count;
			System.out.println("Enter payment id, paymentAmount,paymentMode,discount");
	          do
	           {
		           try 
		           {
		                	id=	sc.nextInt();
		                	pay.setPaymentId(id);
					     		if(PaymentDaoImp.length(id)>6)
					     		{
					     			throw new MyException("Id limit exceed 6 length");
					     		}
					     			else
					     			{	
					     				
					     				pay.setAmount(sc.nextDouble());
					     				pay.setModeOfPay(sc.next());
					     				pay.setDiscount(sc.nextDouble());
					     				
					     			pst.setInt(1, pay.getPaymentId());	
					     			pst.setDouble(2,pay.getAmount() );
					     			pst.setString(3, pay.getModeOfPay());
                                    pst.setDouble(4, pay.getDiscount());
                                    
				     		
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

	public void updatePayment() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void deletePayment() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void displayPayment() throws SQLException {
		try {
			con=DbConnect.dbConnect();
		    con.setAutoCommit(false);
		    st=con.createStatement();
	
	       String query="select * from Payment";
    
          rs=st.executeQuery(query);
    
    System.out.println("Retrieved data is ");
    
	    while(rs.next())
	    {
	  	  System.out.println(rs.getInt(1)+" : "+rs.getDouble(2)+" : "+rs.getString(3)+" : "+rs.getDouble(4));
	 
		  
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
