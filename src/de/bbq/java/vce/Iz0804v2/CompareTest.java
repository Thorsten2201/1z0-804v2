package de.bbq.java.vce.Iz0804v2;

import java.util.*;

public class CompareTest {

	public static void main(String[] args) {

		TreeSet<String> set1 = new TreeSet<String>(

				new Comparator<String>() {
//Original Line: 		public boolean compare(String s1, String s2) {
						public int compare(String s1, String s2) {
//Original Line: 		return (s1.length() > s2.length();
						return s2.length() - s1.length();
					}

				});

		set1.add("peach");

		set1.add("orange");

		set1.add("apple");

		for (String n : set1) {

			System.out.println(n);

		}

	}

}