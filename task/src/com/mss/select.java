package com.mss;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class select {
	public static void main(String args[]) throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://172.17.12.143:3306/test","root","root");
		
		//PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement("insert into SRILEKHA (USERNAME,PASSWORD,FIRST_NAME,LAST_NAME,CONTACT_NUMBER,EMAIL) values('sri','lekha','sri','lekha','9177397196','sri@gmail.com')");
		Statement ps=(Statement) con.createStatement();  
		ResultSet rs=ps.executeQuery("select *from YESWANTH");  
		  
		
		while(rs.next()) 
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3) +""+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+""+rs.getString(7));  
		   

	      // execute the preparedstatement)
	     // int result=preparedStmt.executeUpdate();
			//	System.out.println(+result);
					
}
}
