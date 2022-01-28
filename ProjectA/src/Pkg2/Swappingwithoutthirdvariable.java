package Pkg2;

import java.util.Scanner;

public class Swappingwithoutthirdvariable
{
	
	public static void main(String[] args) 
	{
		int a,b;
		System.out.println("Enter two numbers");
		Scanner In=new Scanner(System.in);
		a=In.nextInt();
		b=In.nextInt();
		System.out.println("Before swapping:"+a+ " "+ b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping:"+a+" "+b);
	}
}

	