package Pkg2;

import java.util.Scanner;

public class Arithmetic 
{
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		return c;
		
	}
	public int sub(int a,int b)
	{
		int c;
		c=a-b;
		return c;
	}
	public int multi(int a,int b)
	{
		int c;
		c=a*b;
		return c;
	}
	public void div(int a,int b)
	{
		int c;
		c=a/b;
		System.out.println("final result is"+c);
	}
	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter first value");
		int x1=s.nextInt();
		System.out.println("value of x1="+ x1);
		System.out.println("please enter second value");
		int x2=s.nextInt();
		System.out.println("value of x2="+x2);
		
		Arithmetic tanu=new Arithmetic();
		int sum=tanu.sum(x1, x2);
		System.out.println("sum result is "+ sum);
		
		System.out.println("please enter third value");
		
		int x3=s.nextInt();
		System.out.println("value of x3 ="+x3);
		int sub=tanu.sub(sum, x3);
		System.out.println("sub result is "+ sub);
		
		System.out.println("please enter fourth value");
		int x4=s.nextInt();
		System.out.println("value of x4="+x4);
		int subresult=tanu.sub(sub, x3);
		System.out.println("sub1 result is "+ subresult);
		
		System.out.println("please enter fifth value");
		int x5=s.nextInt();
		System.out.println("value of x5= "+x5);
		int multi=tanu.multi(subresult,x5);
		System.out.println("multi result is "+multi);
		
		System.out.println("please enter sixth value");
		int x6=s.nextInt();
		System.out.println("value of x6="+x6);
	    tanu.div(multi, x6);
		
	
		
		
		
		
	}

}
