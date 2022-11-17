package com.practice;

public class literalString {

	private void golf() {
Integer i=new Integer(34);
String s=new String("vicky");
String s1=new String("vicky");
String a="vicky";
String b="vicky";

int id = System.identityHashCode(s);
int id1= System.identityHashCode(s1);
int id2= System.identityHashCode(a);
int id3 = System.identityHashCode(b);

System.out.println(id);
System.out.println(id1);
System.out.println(id2);
System.out.println(id3);

//(immuttable String)
String concat = a.concat(b);
System.out.println(concat);
int id4 = System.identityHashCode(concat);
System.out.println(id4);

//StringBuffer(muttable String)
StringBuffer sb=new StringBuffer("surabhi");
StringBuffer sb1=new StringBuffer("surabhi");
int id5 = System.identityHashCode(sb);
int id6 = System.identityHashCode(sb1);
System.out.println(id5);
System.out.println(id6);


StringBuffer sb2=new StringBuffer("surabhi");
StringBuffer sb3=new StringBuffer("vignesh");
int id7 = System.identityHashCode(sb2);
int id8 = System.identityHashCode(sb3);
System.out.println(id7);
System.out.println(id8);
StringBuffer append = sb3.append(sb2);
System.out.println(append);
int id9 = System.identityHashCode(append);
System.out.println(id9);
	}
	public static void main(String[] args) {
		literalString l=new literalString();
		l.golf();
	}
}
