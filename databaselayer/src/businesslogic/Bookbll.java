package businesslogic;
import java.sql.*;
import java.util.*;

import dto.Book;
public interface Bookbll {
	public void listAllBooks() throws SQLException;
	//public Book getBook(int id);
	public void deleteBook(int id) throws SQLException;
	public void updateBook(String str,int id)throws SQLException;
	public void addBook(Book book,Connection con) throws SQLException;
}
