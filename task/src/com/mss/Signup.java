package com.mss;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Signup extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 response.setContentType("text/html;charset=UTF-8");
		try
		{
			PrintWriter out=response.getWriter();
	       
	        Class.forName("com.mysql.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://172.17.12.143:3306/test","root","root");
	       // out.println("connected successfully");
	        String s=request.getParameter("USERNAME");
	        String s1=request.getParameter("PASSWORD");
	        PreparedStatement ps=con.prepareStatement("insert into YESWANTH(USERNAME,PASSWORD,FIRST_NAME,LAST_NAME,CONTACT_NUMBER,EMAIL) values(?,?,?,?,?,?)");
	        ps.setString(1, request.getParameter("USERNAME"));
	        ps.setString(2, request.getParameter("PASSWORD"));
	        ps.setString(3, request.getParameter("FIRST_NAME"));
	        ps.setString(4, request.getParameter("LAST_NAME"));
	        ps.setString(5, request.getParameter("CONTACT_NUMBER"));
	        ps.setString(6, request.getParameter("EMAIL"));
	        ps.executeUpdate();
	        out.println("data inserted successfully");   
	        
	        
		}

		catch(Exception e)
		{
			System.out.println(e);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
