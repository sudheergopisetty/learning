package com.main;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int a = sc.nextInt();
        for (int i = 1; i < a; i++) {
              if(i%3==0) {
                    System.out.println(i+" : Fizz");
                    if (i%3==0 && i%5==0) {
                          System.out.println(i+" : FizzBuzz");
              }
              }else if(i%5==0) {
                    System.out.println(i+" : Buzz");
                    
              }
              
        }
        sc.close();
  }


}

