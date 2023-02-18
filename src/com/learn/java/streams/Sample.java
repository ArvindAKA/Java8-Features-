package com.learn.java.streams;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		populate(list);
		System.out.println(list);
	}

	private static void populate(List<Object> list) {
		if(null==list) {
			list = new ArrayList<>();
		}
		for(int i=0;i<5;i++) {
			list.add(i);
		}
	}
	

}
