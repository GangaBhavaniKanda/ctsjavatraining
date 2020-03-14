package dao;

import java.sql.*;

import java.util.List;
import java.util.*;
import dto.Book;

public class BookDaoimpl implements BookDao{

	Connection con=null;
	@Override
	public Connection getConnection() throws SQLException {
		DriverManager.deregisterDriver(new com.mysql.cj.jdbc.Driver());
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		 return con;
	
	}

	@Override
	public void closeConnections() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insetBookDao(Book book,Connection con) throws SQLException {
		if(con==null)
			System.out.println("connection not established...");
		else
			System.out.println("connection established....");
		String query="insert into book values (?,?,?)";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1, book.getId());
		pst.setString(2, book.getTitle());
		pst.setString(3, book.getAuthor());
		pst.executeUpdate();
		System.out.println("record inserted");
	
		
	}

	@Override
	public List<Book> showAllBookDao() throws SQLException {
		ArrayList<Book>list=new ArrayList<Book>();
		  String sql = "SELECT * FROM book";
		  Statement st=getConnection().createStatement();
		  ResultSet rs=st.executeQuery(sql);
		  while(rs.next()) {
			  Book b=new Book(rs.getInt(1),rs.getString(2),rs.getString(3));
			  list.add(b);
		  }
		return list;
	}

	@Override
	public void deleteBookDao(int id) throws SQLException {
		String sql = "DELETE FROM book where id = ?";
		PreparedStatement pst=getConnection().prepareStatement(sql);
		pst.setInt(1, id);
		int c=pst.executeUpdate();
		System.out.println(c+"record(s) deleted...");
	}

	@Override
	public void updateBookDao(String str,int id) throws SQLException {
		String sql = "update book set title=? where id=?";
		PreparedStatement pst=getConnection().prepareStatement(sql);
		pst.setString(1, str);
		pst.setInt(2, id);
		int c=pst.executeUpdate();
		System.out.println(c+" record(s) updated....");
		
	}

	

}
