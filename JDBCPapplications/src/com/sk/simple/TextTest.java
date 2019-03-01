package com.sk.simple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.ResultSet;




public class TextTest {

	public static void main(String[] args) {
		
		try {
			 Class.forName("com.hxtt.sql.text.TextDriver");
			
		}// try
		catch(ClassNotFoundException cnf) 
		
		{
             cnf.printStackTrace();
			
		}// catch
		
		try(Connection con=DriverManager.getConnection("jdbc:text:///G:/spring")){
			try(Statement st=con.createStatement()){
				if(con!=null)
			 try(java.sql.ResultSet rs=st.executeQuery("SELECT SNO,SNAME,SADD FROM book1"))
					 {
				 if(rs!=null)
				 while(rs.next()) { 
					 
					 System.out.println(rs.getInt(1)+"      "+rs.getString(2)+"    "+rs.getString(3));
					 
					 
				 }//while
			 }	//try
			
		}//try 
		}//TRY
		catch(SQLException se) {
			
			se.printStackTrace();
			}
		catch(Exception e) {
			
		e.printStackTrace();
		}
	} // main
} //class
