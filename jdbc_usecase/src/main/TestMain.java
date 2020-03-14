package main;

import java.sql.SQLException;

import dao.UserDAo;

public class TestMain { 

	public static void main(String[] args) throws SQLException {
		DisplayMenu dm=new DisplayMenu();
		dm.showMenu();

	}

}
