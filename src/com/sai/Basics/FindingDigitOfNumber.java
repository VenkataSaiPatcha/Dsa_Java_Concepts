package com.sai.Basics;

import java.util.Scanner;
import static java.lang.Math.log10;
public class FindingDigitOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		System.out.println(FindingDigitOfNumber.count(num)+" digit number");
	}
	
	public static int count(int num)
	{
		int round =(int)(log10(num)+1);
		return round;
	}
}
