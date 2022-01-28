package Pkg2;

import java.util.Scanner;

public class MultiplicationTable
{
	public static void main(String[] args) 
	{
		int num,i;
		System.out.println("Enter any number");
		Scanner In=new Scanner(System.in);
		num=In.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+num*i);
		}
	}

}
