package com.practice;
import java.util.*;

public class ListPractice {
	
	
	
	
	public static void main(String[] args) {
		List<String> li=new LinkedList();
		li.add("vignesh");
		li.add("vickY");
		li.add("rammy");
		
		List<String> li1=new LinkedList();
		li1.add("vignesh1");
		li1.add("vickY1");
		li1.add("rammy1");
		
		List<List<String>> li2=new ArrayList();
		li2.add(li);
		li2.add(li1);
		System.out.println(li2);
		System.out.println(li2.get(1).get(2));
		for (int i = 0; i < 2; i++) {
			List<String> list = li2.get(i);
			System.out.println(list);
			for (int j = 0; j < 3; j++) {
				System.out.println(list.get(j));
			}
		}
	
	}

}
