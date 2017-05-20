package com.aks.jee;

import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.stereotype.Service;

import com.aks.jdbc.ConnectMSSQLServer;

@Service
public class LoginService {

	public boolean isValidUser(String username, String password)
	{
		
		ConnectMSSQLServer connServer = new ConnectMSSQLServer();
	      return(connServer.validateUser(username,password));
	      
//	      try
//	      {
//	    	  Statement statement = conn.createStatement();
//	          String queryString = "select * from emp";
//	          ResultSet rs = statement.executeQuery(queryString);
//	          while (rs.next()) {
//	             System.out.println(rs.getString(1));
//	          }
//	      }
//	      catch(Exception e)
//	      {
//	    	  e.printStackTrace();
//	      }
		
		
//		if(username.equals("amit") && password.equals("amit"))
//		{
//			return true;
//			
//		}
//		else
//		{
//			return false;
//		}
	}
}
