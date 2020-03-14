package dto;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import businesslogic.Bookbll;
import dao.BookDaoimpl;

public class BookImpl implements Bookbll{
	BookDaoimpl bookdao=new BookDaoimpl();

	@Override
	public void listAllBooks() throws SQLException {
		List<Book>list= bookdao.showAllBookDao();
		for(Book b:list)
			System.out.println(b);
	}
		



	@Override
	public void deleteBook(int id) throws SQLException {
		bookdao.deleteBookDao(id);
		
	}

	@Override
	public void updateBook(String str,int id) throws SQLException {
		bookdao.updateBookDao(str,id);
		
	}

	@Override
	public void addBook(Book book,Connection con) throws SQLException {
		
		bookdao.insetBookDao(book,con);
	}

}
