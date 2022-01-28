package Pkg1;

public class Assignment1 {
	public Assignment1() 
	{
		this(11,67,23);
		System.out.println("Default Constructor");
		
	}
	public Assignment1(int a)
	{
		this(11,22,33,44);
		System.out.println("One Parameterized Constructor");
	}
	public Assignment1(int a,int b)
	{
		this(11);
		System.out.println("Two Parameterized Constructor");
	}
	public Assignment1(int a,int b,int c)
	{
		System.out.println("Three Parameterized Constructor");
	}
	public Assignment1(int a,int b,int c,int d)
	{
		this();
		System.out.println("Four Parameterized Constructor");
	}
	public static void main(String[] args) 
	{
		Assignment1 Tanu=new Assignment1(11,22);
		 
		 
	}
	
	
	
	

}
