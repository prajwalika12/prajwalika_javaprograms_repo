package Pkg2;

import java.util.Scanner;

public class Factorial 
{ public static void main(String[] args) 
{
	int num,i,fact=1;
	System.out.println("Enter any number");
	Scanner In=new Scanner(System.in);
	num=In.nextInt();
	
	for(i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	System.out.println("factorial of the given number="+fact);
	
}

}
