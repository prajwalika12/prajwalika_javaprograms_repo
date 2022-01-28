package Pkg2;

public class ArithmeticOp //Example of static polymorphism
{
	public void multiply(int a,int b) 
	{
		int c=a*b;
		System.out.println("Result is "+c);
	}
	public void multiply(int a,int b,int c) 
	{
		 int d=a*b*c;
		System.out.println("Result is "+d);
	}
	public static void main(String[] args)
	{
		ArithmeticOp obj=new ArithmeticOp();
		obj.multiply(11,6,56);    
		obj.multiply(34, 78);   
		
	}

}
