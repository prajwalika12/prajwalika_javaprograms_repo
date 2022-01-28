package Pkg1;

public class Arithmetic2 
{
	public int div(int a,int b)
	{
		int c;
		c=a/b;
		System.out.println("Division Result is "+c);
		return c;
	}
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println("Subtraction Result is "+z);
		return z;
	}
	public int sum(int a1,int a2)
	{
		int a3;
		a3=a1+a2;
		System.out.println("Sum Result is "+a3);
		return a3;
	}
	public int multi(int x1,int x2)
	{
		int x3;
		x3=x1*x2;
		System.out.println("Final Result is "+x3);
		return x3;
	}
	public static void main(String[] args)
	{
		Arithmetic2 obj= new Arithmetic2();
		int DivResult=obj.div(10, 2);
		int SubResult=obj.sub(DivResult, 2);
		int SumResult=obj.sum(SubResult, 2);
		int SubResult1=obj.sub(SumResult, 2);
		obj.multi(SubResult1, 2);
		
	}

}
