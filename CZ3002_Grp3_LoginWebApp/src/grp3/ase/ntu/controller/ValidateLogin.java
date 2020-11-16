package grp3.ase.ntu.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ValidateLogin {

	//validate login credentials with mySQL
	//testing
	public static String u1;
	public static String p1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test2","root","Ase123");
			Statement myStmt=myConn.createStatement();
			ResultSet myRs=myStmt.executeQuery("select * from userinfo");
			while (myRs.next()) {
				//System.out.println(myRs.getString("username"));
				//System.out.println(myRs.getString("password"));
				u1= myRs.getString("username");
				p1= myRs.getString("password");
				//System.out.println(u1);
				//System.out.println(p1);
			}
		}
		catch (SQLException exc) {
			System.out.println(exc.getMessage());
		}
	}
	
	public static int verify(String username,String password) {
		
		if(u1.equals(username)&&p1.equals(password)) {
			return 1;
		}
		return 0;
	}
}