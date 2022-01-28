package Pkg2;

public class DebuggingExample
{
	int a=10;
	public void me1()
	{
		System.out.println("first method");
	}
	public void me2()
	{
		System.out.println("second method");
	}
	public static void main(String[] args) 
	{
	
		DebuggingExample obj=new DebuggingExample();
		obj.a=122;
		System.out.println(obj.a);
		System.out.println("first line of main method");
		System.out.println("second line of main method");
		obj.me1();
		System.out.println(" main method");
		obj.me2();
		System.out.println("Final line of main method");
		
	}

}
