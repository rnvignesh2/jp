package com.inheritance;

import java.util.Scanner;

public class HybridInterface {
	
	

public void room() {
	this.room("vicku", 1);
System.out.println("rank");
	
}
public void room(String rank,int number) {
System.out.println("name is "+ rank +"rank is "+ number);
}
public static void main(String[] args) {
	HybridInterface h=new HybridInterface();
	h.room();
}
}