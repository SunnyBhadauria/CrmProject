package com.coforge.CrmDaoClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.coforge.CrmBeanClass.Card;
import com.coforge.CrmDaoInterface.CardDao;
import com.coforge.javaCrmDbConnect.DbConnect;
import com.coforge.javaCrmException.MyException;
public class CardDaoImp implements CardDao{

	static Connection con=null;
	static	PreparedStatement pst=null;
	static	Statement st=null;
	static ResultSet rs=null;
	
	Scanner sc=new Scanner(System.in);
private static Set<Card> setCard;
	
	private static Card card;
	
	
	public static Card getCard() {
		return card;
	}
	public static void setCard(Card card) {
		CardDaoImp.card = card;
	}
	public	CardDaoImp()
	{

	setCard=new TreeSet<Card>();
	card=new Card();
	
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
	
	
	public static Set<Card> getSetCard() {
		return setCard;
	}
	public static void setSetCard(Set<Card> setCard) {
		CardDaoImp.setCard = setCard;
	}
	public void addCardDao()  {
		/*try {
			con=DbConnect.dbConnect();
		    con.setAutoCommit(false);
		    String str="insert into Card values (?,?,?,?,?)";
			pst=con.prepareStatement(str);
			Scanner sc=new Scanner(System.in);
			int no,flag=1,count;
			System.out.println("Enter card no,card validity, silvercard , goldcard " );
			//do
	           {
		           try 
		           {
		                	no=	sc.nextInt();
		                	sc.nextLine();
		                	card.setCardNo(no);
					     		if(CardDaoImp.length(no)>6)
					     		{
					     			throw new MyException("Id limit exceed 6 length");
					     		}
					     			else
					     			{	
					     			card.setCardValidity(sc.next());
					     			card.setSilverCardCumulativeTotal(sc.nextDouble());
					     			sc.nextLine();
					     			card.setGoldCardCumulativeTotal(sc.nextDouble());
					     			sc.nextLine();
					     			pst.setInt(1, no);
					     			pst.setDate(2, card.getCardValidity());
					     			pst.setDouble(3,customer.getSilverCardCumulativeTotal());
					     			pst.setDouble(4,customer.getSilverCardCumulativeTotal());
					     			 
					     			
					     			 customer.setPayment(CumulativePointDaoImp.getCumulativePoint());
				     	             pst.setInt(5, card.getCumulativePoint().getCumulativePointsID());
				     	             
				     	             
				     	           
					     			count = pst.executeUpdate();
					     			
					     	
					     			
					     			System.out.println("the no of row effected is "+count);
					     			flag=0;
					     			}
				   }
			       catch(MyException e)
				   {
				System.out.println("Exception "+e.getMessage());
				System.out.println("Renter correct id length please");
				flag=1;
				   }
	          }while(flag!=0);//
	         
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
										
			   }*/
	}

	public void displayCardDao() {
		/*try {
			con=DbConnect.dbConnect();
		    con.setAutoCommit(false);
		    st=con.createStatement();
		      String query="select * from Card";
    
          rs=st.executeQuery(query);
    
    System.out.println("Retrieved data is ");
    
	    while(rs.next())
	    {
	  	  System.out.println(rs.getInt(1)+" : "+rs.getDate(2)+" : "+rs.getDouble(3)+" : "+rs.getDouble(4)+" : "+rs.getInt(5));
	  
		  
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
 */
		
	}
	
}
