package com.practice;

public class ArrayPractice {
	
	public static void main(String[] args) {
		
		String[][] s= {{"fafa","safaf","adfsaf"},
				{"fafa","safaf","adfsaf"} };
		
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 3; j++) {
			
			System.out.println(s[i][j]);
			
		}
	}
	int[][] i=new int[02][10];
	int k=45;
for (int j = 0; j <2; j++) {
	for (int j2 = 0; j2 < 10; j2++) {
		
		i[j][j2]=k;
		k++;
		System.out.println(i[j][j2]);
	}
	k=45;
	System.out.println(k);
	

	
}

}
	
	}

