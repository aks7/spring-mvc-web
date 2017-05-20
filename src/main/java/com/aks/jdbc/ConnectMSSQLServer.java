package com.aks.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import com.aks.models.Flight;

public class ConnectMSSQLServer
{
	public Connection connectDatabase(String db_connect_string)
	{
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(db_connect_string,
					"root", "sinha");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			return conn;
		}
	}
	
	public boolean validateUser(String user, String password)
	{
		Boolean result=false;
		Connection conn= connectDatabase("jdbc:mysql://localhost:3306/air");
		System.out.println("connected");
		try{
			Statement statement = conn.createStatement();
			String queryString = "select * from userbase where users='"+user+"' and password='"+password+"'";
			System.out.println(queryString);
			ResultSet rs = statement.executeQuery(queryString);
			result= rs.first();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			return result;
		}
		
	}
	
	public List<Flight> getFlights(String source, String destination)
	{
		List<Flight> flt= new ArrayList<>();
		Flight f1=new Flight();
		Connection conn= connectDatabase("jdbc:mysql://localhost:3306/air");
		try{
			Statement statement = conn.createStatement();
			String queryString = "select * from flightinfo where dep_city='"+source+"' and arv_city='"+destination+"'";
			System.out.println(queryString);
			ResultSet rs = statement.executeQuery(queryString);
			while(rs.next())
			{
				f1.setFlightNo(rs.getString(1));
				f1.setAirline(rs.getString(2));
				f1.setDep_city(rs.getString(3));
				f1.setArr_city(rs.getString(4));
				f1.setDep_date(rs.getDate(5));
				f1.setArr_date(rs.getDate(6));
				f1.setDep_time(new Time(2));
				f1.setArr_time(new Time(2));
				f1.setTotal_fare(rs.getFloat(12));
				flt.add(f1);
				System.out.println(flt);
				System.out.println("No error...............");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("retrning flt....,");
			return flt;
		
		}
		
		
	}


}