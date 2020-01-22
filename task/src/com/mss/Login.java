package com.mss;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		try
		{
			
		 Class.forName("com.mysql.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://172.17.12.143:3306/test","root","root");
	        String s=request.getParameter("USERNAME");
	        String s1=request.getParameter("PASSWORD");
	        System.out.println(s);
	        PreparedStatement ps1=con.prepareStatement("select * from YESWANTH");
	        ResultSet r=ps1.executeQuery();
	        System.out.println(r);
	        while(r.next())
	        {
	        	if((request.getParameter("USERNAME")).equals(r.getString("USERNAME")) && (request.getParameter("PASSWORD")).equals(r.getString("PASSWORD")))
	        	{
		        	out.println("logged in successfully and ur details are: <b><b>");
		        	out.println(r.getString("USERNAME")+" "+ r.getString("PASSWORD")+" "+r.getString("FIRST_NAME")
		        		+" "+r.getString("LAST_NAME")+" "+r.getString("CONTACT_NUMBER")+" "+r.getString("EMAIL")+" ");
	        	}
	        	
	        	
   		}	
	        
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}