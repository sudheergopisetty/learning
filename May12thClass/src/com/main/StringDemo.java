package com.main;

public class StringDemo {

	public static void main(String[] args) {
		String str1= "Mohan Murali Rao";
		System.out.println("Length of Str1: "+ str1.length());
		
		String str2= new String("Mohan Murali Rao");
		System.out.println("Length of Str1: "+ str2.length());
		
		String reversedStr1="";
		for (int i = str1.length()-1; i >= 0; i--) {
			char temp = str1.charAt(i);
			reversedStr1= reversedStr1+ temp;
		}
		System.out.println(reversedStr1);	
	}

}
