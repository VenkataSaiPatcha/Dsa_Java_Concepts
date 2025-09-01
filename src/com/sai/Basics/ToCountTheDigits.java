package com.sai.Basics;

import java.util.Scanner;

public class ToCountTheDigits 
{
	public static void main(String[] args) 
	{
		int count = 0,r=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int m = num;
		while(m>0)
		{
			r = r + m%10;
			m = m/10;
			count++;
		}
		System.out.println(num+" is "+count+" digit number");
	}

}
