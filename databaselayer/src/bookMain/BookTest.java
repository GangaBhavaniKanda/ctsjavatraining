package bookMain;
import java.util.*;
import java.sql.Connection;
import java.sql.SQLException;

import dao.BookDaoimpl;
import dto.Book;
import dto.BookImpl;

public class BookTest {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		BookDaoimpl daoimpl=new BookDaoimpl();
		Connection con=daoimpl.getConnection();
	
		BookImpl bookimpl=new BookImpl();
		//bookimpl.addBook(book,con);
		//bookimpl.listAllBooks();
		while(true) {
			System.out.println("***********Book CRUD operations*********************");
			System.out.println("1.Insert record");
			System.out.println("2.delete record");
			System.out.println("3.update record");
			System.out.println("4.show all record in book");
			System.out.println("5.exit");
			System.out.println("Enter your choice:");
			int c=sc.nextInt();
			switch(c) {
			case 1:
				System.out.println("enter id, bookname and author_name for insertion");
				Book book=new Book(sc.nextInt(),sc.next(),sc.next());
				bookimpl.addBook(book,con);
				break;
			case 2:
				System.out.println("enter book_id you want to delete");
				bookimpl.deleteBook(sc.nextInt());
				break;
			case 3:
				System.out.println("enter update value and id ");
				bookimpl.updateBook(sc.next(),sc.nextInt());
				break;
			case 4:
				bookimpl.listAllBooks();
				break;
			case 5:
				  System.exit(0);
			default:
				System.out.println("your choices is not in the menu");
				break;
			}
		}
	}

}
