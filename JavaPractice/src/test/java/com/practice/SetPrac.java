package com.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPrac {
	
	public static void main(String[] args) {
		
	Set<Character> s=new TreeSet<>();
	
	s.add('s');
	s.add('s');
	s.add('g');
	s.add('s');
	
	System.out.println(s);
	
	for (char object : s) {
		
		System.out.println(object);
		
	}
	
	}
}
