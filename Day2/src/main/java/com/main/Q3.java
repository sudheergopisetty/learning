package com.main;

import java.util.Scanner;
public class Q3 {
   public static void main(String args[]){
      int count = 0;
      System.out.println("Enter a sentence :");
      try (Scanner sc = new Scanner(System.in)) {
		String sentence = sc.nextLine();
		sentence= sentence.toLowerCase();
		  for (int i=0 ; i<sentence.length(); i++){
		     char ch = sentence.charAt(i);
		     //System.out.println(ch);
		     if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
		        count ++;
		     }
		  }
	}
      System.out.println("Number of vowels in the given sentence is "+count);
   }
}