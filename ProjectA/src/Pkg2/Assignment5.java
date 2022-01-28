package Pkg2;

import java.util.Scanner;

public class Assignment5 
{
public int multi(int a,int b)
{
	int c;
	c=a*b;
	System.out.println("Value of multiplication= "+c);
	return c;
}
public int sum(int c,int d)
{
	int e;
	e=c+d;
	System.out.println("Value of addition= "+e);
	return e;
}
public int sub(int e,int f)
{
	int g;
	g=e-f;
	System.out.println("Value of subtraction= "+g);
	return g;
}
public void div(int g,int h)
{
	int i;
	i=g/h;
	System.out.println("Value of division= "+i);
	
}
public static void main(String[] args) 
{
	Scanner INPUT=new Scanner(System.in);
	Assignment5 tanu=new Assignment5();
	System.out.println("Enter the value of x1");
	int x1=INPUT.nextInt();
	System.out.println("Enter the value of x2");
	int x2=INPUT.nextInt();
	int multi=tanu.multi(x1,x2);
	
	System.out.println("Enter the value of x3");
	int x3=INPUT.nextInt();
	int sum=tanu.sum(multi, x3);

	System.out.println("Enter the value of x4");
	int x4=INPUT.nextInt();
	int sum1=tanu.sum(sum, x4);
	
	System.out.println("Enter the value of x5");
	int x5=INPUT.nextInt();
	int sub=tanu.sub(sum1, x5);
	
	System.out.println("Enter the value of x6");
	int x6=INPUT.nextInt();
	tanu.div(sub, x6);
	
	
	
}
}

