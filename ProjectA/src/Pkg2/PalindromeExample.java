package Pkg2;

import java.util.Scanner;

public class PalindromeExample
{
	public static void main(String[] args) 
	{  
		int n,c,rem,s=0;
		System.out.println("Enter any number");
		Scanner In=new Scanner(System.in);
		n=In.nextInt();
		c=n;
		while (n>0)
		{
			rem=n%10;
			s=(s*10)+rem;
			n=n/10;
		}if (c==s)
		{
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
			
		}
		
		
	}
	

}
