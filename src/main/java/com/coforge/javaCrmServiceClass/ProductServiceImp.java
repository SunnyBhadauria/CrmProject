package com.coforge.javaCrmServiceClass;

import java.sql.SQLException;

import com.coforge.CrmDaoClass.ProductDaoImp;
import com.coforge.CrmDaoInterface.ProductDao;
import com.coforge.javaCrmServiceInterface.ProductService;

public class ProductServiceImp  implements ProductService{

	
	ProductDao productDao=null;
	
	public ProductServiceImp() {
		productDao=new ProductDaoImp();
	}

	public void addProduct() throws SQLException {
		productDao.addProduct();		
	}

	public void updateProduct() throws SQLException {
		productDao.updateProduct();		
	}

	public void deleteProduct() throws SQLException {
		productDao.deleteProduct();
		
	}

	public void displayProduct() throws SQLException {
		productDao.displayProduct();
		
	}

}
