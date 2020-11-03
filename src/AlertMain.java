package com.nishant.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AlertMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Alerts> alertList = new ArrayList<>();
		List<Alerts> filteredAlertList = new ArrayList<>();
		Alerts al1 = new Alerts("Green", "Low");
		// al1.setAlertId(alertId);
		Alerts al2 = new Alerts("Green", "Low");
		Alerts al3 = new Alerts("Red", "High");

		// al1.setAlertId("");

		alertList.add(al1);
		alertList.add(al2);
		alertList.add(al3);
		// alertList.add(e);

		/*
		 * Collections.sort(alertList, new Comparator<Alerts>() {
		 * 
		 * //@Override
		 * 
		 * public int compare(String o1, String o2) { // TODO Auto-generated method stub
		 * return 0; }
		 * 
		 * 
		 * @Override public int compare(Alerts o1, Alerts o2) { // TODO Auto-generated
		 * method stub
		 * 
		 * return o1.getAlertId().compareTo(o2.getAlertId()); }
		 * 
		 * 
		 * });
		 */

		List<Alerts> greenList = alertList.stream().filter(x -> x.getAlertId().equals("Green"))
				.collect(Collectors.toList());

		greenList.forEach(System.out::println);
		System.out.println(greenList);

		for (Alerts l : greenList) {
			System.out.println(l);
			//System.out.println(l.getAlertId());
			//System.out.println(l.getAlertSeverity());
		}

	}

}
