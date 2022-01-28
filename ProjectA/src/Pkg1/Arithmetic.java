package Pkg1;

public class Arithmetic 
{
	public int multiply(int a,int b)
	{
	     int c;
	     c=a*b;
	     System.out.println("multiplication result is"+c);
	     return c;
	}
	public int sum(int x,int y)
	{
		int z;
		z=x+y;
		System.out.println("sum result is"+z);
		return z;
	}
	public int sub(int a1,int a2)
	{
		int a3;
		a3=a1-a2;
		System.out.println("subtraction result is"+a3);
		return a3;
	}
	public void div(int x1,int y1)
	{
		int z1;
		z1=x1/y1;
		System.out.println("final result is"+z1);
	}
	public static void main(String[] args) 
	{
		Arithmetic obj=new Arithmetic ();
		int multiResult=obj.multiply(10, 2);
		int sumResult=obj.sum(multiResult, 2);
		int sumResult1=obj.sum(sumResult, 2);
		int subResult=obj.sub(sumResult1, 2);
		obj.div(subResult, 2);
	
	
		
		
		
		
	}
	

}
