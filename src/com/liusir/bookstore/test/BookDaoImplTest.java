package com.liusir.bookstore.test;


import java.util.List;


import com.liusir.bookstore.dao.BookDao;
import com.liusir.bookstore.daoImpl.BookDaoImpl;
import com.liusir.bookstore.domain.Book;
import com.liusir.bookstore.web.CriteriaBook;
import com.liusir.bookstore.web.Page;

class BookDaoImplTest {

	
	private BookDao bookdao=new BookDaoImpl();

	void testGetBook() {
		System.out.println("nihao");
		CriteriaBook  cb = new CriteriaBook(50, 60,2);
		long totalBookNumber = bookdao.getTotalBookNumber(cb);
		System.out.println(totalBookNumber);


	}

	void testGetPage() {
		CriteriaBook  cb = new CriteriaBook(50, 60,2);
	    
		List<Book> pageList = bookdao.getPageList(cb, 3);
	    
	    System.out.println(pageList);
	    
	}

	void testGetTotalBookNumber() {
		
		
	}
	void testGetPageList() {

		CriteriaBook  cb = new CriteriaBook(50, 60, 90);
	    List<Book> pageList = bookdao.getPageList(cb, 3);
	    System.out.println(pageList);
	}

	void testGetStoreNumber() {
  
		int storeNumber = bookdao.getStoreNumber(2);
		System.out.println(storeNumber);
	
	}

	void testBatchUpdateStoreNumberAndSalesAmount() {
	}

}
