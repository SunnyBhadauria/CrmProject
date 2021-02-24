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
import com.coforge.CrmBeanClass.Product;
import com.coforge.CrmDaoInterface.ProductDao;
import com.coforge.javaCrmDbConnect.DbConnect;
import com.coforge.javaCrmException.MyException;

public class ProductDaoImp implements ProductDao{

	
	static Connection con=null;
	static	PreparedStatement pst=null;
	static	Statement st=null;
	static ResultSet rs=null;
	
	Scanner sc=new Scanner(System.in);
private static Set<Product> setProduct;

private static Product product;
	

	public static Product getProduct() {
	return product;
     }
	
   public static void setProduct(Product product) {
	ProductDaoImp.product = product;
    }
   
	public	ProductDaoImp()
	{
		product=new Product();
		setProduct=new TreeSet<Product>();
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
	
	
	
	public static Set<Product> getSetProduct() {
		return setProduct;
	}
	public static void setSetProduct(Set<Product> setProduct) {
		ProductDaoImp.setProduct = setProduct;
	}
	public void addProduct() throws SQLException
	{
		
		try {
			con=DbConnect.dbConnect();
		    con.setAutoCommit(false);
		    String str="insert into Product values (?,?,?,?)";
			pst=con.prepareStatement(str);
			Scanner sc=new Scanner(System.in);
					
			int id,flag=1,count;
			System.out.println("Enter product id, producttype,productQuantity,productMRP");
	          do
	           {
		           try 
		           {
		                	id=	sc.nextInt();		
					     		if(ProductDaoImp.length(id)>6)
					     		{
					     			throw new MyException("Id limit exceed 6 length");
					     		}
					     			else
					     			{	
					     			product.setProductID(id);
					     			product.setProducttype(sc.next());
					     			product.setProductQuantity(sc.nextInt());
					     			product.setProductMRP(sc.nextDouble());
					     			
					     			pst.setInt(1,product.getProductID());
					     			pst.setString(2, product.getProducttype());
					     			pst.setInt(3,product.getProductQuantity());
                                    pst.setDouble(4,product.getProductMRP() );
				     		
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

	public void updateProduct() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void deleteProduct() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void displayProduct() throws SQLException {
		try {
			con=DbConnect.dbConnect();
		    con.setAutoCommit(false);
		    st=con.createStatement();
	
	       String query="select * from Product";
    
          rs=st.executeQuery(query);
    
    System.out.println("Retrieved data is ");
    
	    while(rs.next())
	    {
	  	  System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getInt(3)+" : "+rs.getDouble(4));
	 
		  
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
