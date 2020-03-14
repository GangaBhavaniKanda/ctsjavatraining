package dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
import dto.Book;
public interface BookDao {
	public Connection getConnection() throws SQLException;
	public void closeConnections();
	public void insetBookDao(Book book,Connection con) throws SQLException;
	public List<Book> showAllBookDao() throws SQLException;
	public void deleteBookDao(int id) throws SQLException;
	public void updateBookDao(String str,int id) throws SQLException;

}
