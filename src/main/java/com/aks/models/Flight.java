package com.aks.models;

import java.sql.Time;
import java.util.Date;

public class Flight {

	String flightNo;
	String airline;
	String dep_city;
	String arr_city;
	Date arr_date;
	Date dep_date;
	Time arr_time;
	Time dep_time;
	Float total_fare;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flightNo == null) ? 0 : flightNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		if (flightNo == null) {
			if (other.flightNo != null)
				return false;
		} else if (!flightNo.equals(other.flightNo))
			return false;
		return true;
	}
	
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getDep_city() {
		return dep_city;
	}
	public void setDep_city(String dep_city) {
		this.dep_city = dep_city;
	}
	public String getArr_city() {
		return arr_city;
	}
	public void setArr_city(String arr_city) {
		this.arr_city = arr_city;
	}
	public Date getArr_date() {
		return arr_date;
	}
	public void setArr_date(Date arr_date) {
		this.arr_date = arr_date;
	}
	public Date getDep_date() {
		return dep_date;
	}
	public void setDep_date(Date dep_date) {
		this.dep_date = dep_date;
	}
	public Time getArr_time() {
		return arr_time;
	}
	public void setArr_time(Time arr_time) {
		this.arr_time = arr_time;
	}
	public Time getDep_time() {
		return dep_time;
	}
	public void setDep_time(Time dep_time) {
		this.dep_time = dep_time;
	}
	public Float getTotal_fare() {
		return total_fare;
	}
	public void setTotal_fare(Float total_fare) {
		this.total_fare = total_fare;
	}
	@Override
	public String toString() {
		return String.format(
				"FlightSearchResult [flightNo=%s, airline=%s, dep_city=%s, arr_city=%s, arr_date=%s, dep_date=%s, arr_time=%s, dep_time=%s, total_fare=%s]",
				flightNo, airline, dep_city, arr_city, arr_date, dep_date, arr_time, dep_time, total_fare);
	}
	
	
}
