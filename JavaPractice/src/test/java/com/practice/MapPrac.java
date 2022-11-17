package com.practice;

import java.util.*;
import java.util.Map.Entry;

public class MapPrac {
	
	public static void main(String[] args) {
	
	Map m=new LinkedHashMap();
	m.put("name", "vignesh");
	m.put("degree", "engineering");
	m.put("year", 2022);
	m.put("course", "electrical");
	
	System.out.println(m);
	
	Set<Entry> entry=m.entrySet();
	
	for (Entry entry2 : entry) {
		System.out.println(entry2);
	}
	
	
	
	List li=new LinkedList();
	 li.add(m);
	 li.add("vicky");
	 System.out.println(li);

}}
