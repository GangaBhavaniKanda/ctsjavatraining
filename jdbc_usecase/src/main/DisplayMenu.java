package main;
import java.sql.SQLException;
import java.util.*;

import dao.AccountDAO;
import dao.UserDAo;
import dto.Account;
import dto.Users;
public class DisplayMenu {
	private static final String String = null;
	Scanner sc=new Scanner(System.in);
	public static void showMenu() throws SQLException {
		System.out.println("*********BANK APPLICATION************");
		System.out.println("1.NEW USER....");
		System.out.println("2.EXSITING USER....");
		System.out.println("enter your choice");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			  newUser();
			  break;
		case 2:
			int status=existingUser();
			AccountDAO acdao=new AccountDAO("jdbc:mysql://localhost:3306/cts","root","root");
			if(status==1) {
				System.out.println("1.Deposit");
				System.out.println("2.Withdraw");
				System.out.println("3.Balance Enquery");
				System.out.println("enter choice");
				int ch1=sc.nextInt();
				switch(ch1) {
					case 1:
						System.out.println("enter amount");
						float amount=sc.nextFloat();
						System.out.println("ennter account_number");
						String accno=sc.next();
						acdao.deposit(accno, amount);
						break;
					case 2:
						System.out.println("enter amount");
						float amo=sc.nextFloat();
						System.out.println("ennter account_number");
						String accnoo=sc.next();
						acdao.withdraw(accnoo,amo);
						break;
					case 3:
						System.out.println("enter account_number");
						String acc=sc.next();
						acdao.getBalance(acc);
						break;
					default:
						System.out.println("wrong choice");
				}
			}
			break;
		default:System.out.println("Wrong Choice...");
		
		}
	}
	public static void newUser() throws SQLException {
		UserDAo userdao = new UserDAo("jdbc:mysql://localhost:3306/cts","root","root");
		Scanner sc = new Scanner(System.in);
		System.out.println("you have to register first...");
		System.out.println("Enter username");
		String uname = sc.next();
		System.out.println("Enter password");
		String pwd = sc.next();
		Users user = new Users(uname,pwd);
		System.out.println("Enter AccountNumber");
		String acctNumber = sc.next();
		System.out.println("Enter AccountType");
		String acctType = sc.next();
		System.out.println("Enter Customer Name");
		String custName = sc.next();
		System.out.println("Enter the amount");
		float balance = sc.nextFloat();
		Account accounts = new Account(acctNumber,acctType,custName,balance);
		UserDAo.createCustomer(accounts, user);
		
	}
	public static int existingUser() throws SQLException {
		UserDAo userdao=new UserDAo("jdbc:mysql://localhost:3306/cts","root","root");
		UserDAo.connect();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user name");
		String uname=sc.next();
		System.out.println("enter password");
		String pswd=sc.next();
		Users  user=new Users(uname,pswd);
		int status=userdao.checkUser(user);
		return status;	
	}



}
