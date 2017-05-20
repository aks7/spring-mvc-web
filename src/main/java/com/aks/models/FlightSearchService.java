package com.aks.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.aks.jdbc.ConnectMSSQLServer;
@Service
public class FlightSearchService {
	List<Flight> flt1=new ArrayList<>();
	
	public List<Flight> getFlights(String source, String destination)
	{
	ConnectMSSQLServer connServer = new ConnectMSSQLServer();
	flt1=connServer.getFlights(source, destination);
	return flt1;
	}
	

}
