package com.nishant.test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

//public class Alerts implements Comparator<String>{
	public class Alerts {

	String alertId =null;
	public String getAlertId() { 
		return alertId;
	}
	public Alerts(String alertId, String alertSeverity) {
		super();
		this.alertId = alertId;
		this.alertSeverity = alertSeverity;
	}
	public void setAlertId(String alertId) {
		this.alertId = alertId;
	}
	public String getAlertSeverity() {
		return alertSeverity;
	}
	public void setAlertSeverity(String alertSeverity) {
		this.alertSeverity = alertSeverity;
	}
	String alertSeverity = null;
	@Override
	public String toString() {
		return "Alerts [alertId=" + alertId + ", alertSeverity=" + alertSeverity + "]";
	}
	
	/*
	 * public Alerts(String alertId, String getAlertSeverity) { this.alertId =
	 * alertId; this.alertSeverity = alertSeverity;
	 * 
	 * }
	 */
	
	
	/*
	 * @Override public int compare(String o1, String o2) { // TODO Auto-generated
	 * method stub
	 * 
	 * 
	 * return o1.compareTo(o2); }
	 */
	
	
	
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * 
	 * 
	 * Map<String, String> alertMap = new HashMap<>();
	 * 
	 * }
	 */
	
	
	

}
