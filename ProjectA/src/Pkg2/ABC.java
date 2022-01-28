package Pkg2;

public class ABC 
{
	public ABC()
	{
		this(33,66,98);
		System.out.println("Parent Default Constuctor");
	}
	public ABC(int a)
	{
		this();
		System.out.println("Parent one parameterized constructor");
	}
	public ABC(int a,int b)
	{
	    this(11);
		System.out.println("Parent two parameterized constructor");
	}
	public ABC(int a,int b,int c)
	{
		System.out.println("Parent three parameterized constructor");
	}

}
