package Pkg2;

public class XYZ extends ABC
{
	public XYZ()
	{
		this(764,12);
		System.out.println("Child Default Constructor");
	}
	public XYZ(int a)
	{
		this(11,345,93);
		System.out.println("Child one parameterized constructor");
	}
	public XYZ(int a,int b)
	{
		
		super(132,67);
		System.out.println("Child two parameterized constuctor");
	}
	public XYZ(int a,int b,int c)
	{
	    this();
		System.out.println("Child three parameterized constructor");
	}
	public static void main(String[] args) 
	{
		XYZ tanu=new XYZ(11);
	
	}

}
