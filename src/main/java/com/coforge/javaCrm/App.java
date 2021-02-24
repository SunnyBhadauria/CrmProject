package com.coforge.javaCrm;

import java.sql.SQLException;
import java.util.Scanner;

import com.coforge.javaCrmServiceClass.BillServiceImp;
import com.coforge.javaCrmServiceClass.BranchInfoServiceImp;
import com.coforge.javaCrmServiceClass.BranchServiceImp;
import com.coforge.javaCrmServiceClass.CustomerServiceImp;
import com.coforge.javaCrmServiceClass.PaymentServiceImp;
import com.coforge.javaCrmServiceClass.ProductServiceImp;
import com.coforge.javaCrmServiceInterface.BillService;
import com.coforge.javaCrmServiceInterface.BranchInfoService;
import com.coforge.javaCrmServiceInterface.BranchService;
import com.coforge.javaCrmServiceInterface.CustomerService;
import com.coforge.javaCrmServiceInterface.PaymentService;
import com.coforge.javaCrmServiceInterface.ProductService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
       
//    	BranchService b=new BranchServiceImp();
//    	b.addBranch();
//    	
//    	
//    	BranchInfoService bi=new BranchInfoServiceImp();
//    	bi.addBranchInfo(b);
//    
    	CustomerService c=new CustomerServiceImp();
    	BillService b=new BillServiceImp();
    	ProductService p=new ProductServiceImp();
    	PaymentService pt=new PaymentServiceImp();
    	
    	
    	int choice;
    Scanner sc=new Scanner(System.in);
    do {
  	  
  	  System.out.println("press 1 for customer addition");
  	  System.out.println("press 2 for bill addition");
  	  System.out.println("press 3 for product addition");
  	  System.out.println("press 4 for payment addition");
  	  
  	  System.out.println("press 5 for customer display");
  	  System.out.println("press 6 for bill display");
  	  System.out.println("press 7 for product display");
  	  System.out.println("press 8 for payment display");
  	   
  	  System.out.println("press 9 for Exit");
  	
	  choice =sc.nextInt();
	  switch(choice)
	  {
	  case 1:
		  c.addCustomer();
		  break;
	  case 2:
		  b.addBill();
		  break;
	  case 3:
		  p.addProduct();
		  break;
	  case 4: 
		  pt.addPayment();
		  break;
	  case 5: 
		 c.displayCustomer();
		  break;
	  case 6: 
		  b.displayBill();
		  break;
	  case 7:  
		 p.displayProduct();
		  break;
	  case 8:
		pt.displayPayment();
		  break;
		 default:
			 System.out.println("Wrong input");
	  }
  }while(choice!=9);
  

    	
    	
    	
    	
    	
    }
}
