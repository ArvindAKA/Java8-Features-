package com.learn.java.streams;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsVsStreams {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("adam");
		names.add("aadam");
		names.add("jim");
		names.add("kelly");
		names.add("ruby");
		

		//names.remove(0);
		System.out.println(names);
		
		for (String string : names) {
			System.out.println("string :" + string);
		}
		
		System.out.println("*********Sorting**********");
		names.stream().sorted().forEach(System.out::println);
		
		Collections.reverse(names);
		System.out.println("Names -->" + names);
	}

}
