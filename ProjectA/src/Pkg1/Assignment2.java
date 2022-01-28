package Pkg1;

public class Assignment2 {
	public void m()
	{
		System.out.println("Default method");
		
	}
	public void m1(int a)
	{
		System.out.println("one parameterised method");
	}
	public void m2(int a,int b)
	{
		this.m3(5, 9, 8);
		this.m4(3, 45, 66, 2);
		this.m();
		this.m1(5);
		System.out.println("two parameterized method");
	}
	public void m3(int a,int b,int c)
	{
		System.out.println("three parameterized method");
	}
	public void m4(int a,int b,int c,int d)
	{
		System.out.println("four parameterized method");
	}
	public static void main(String[] args) 
	{
		Assignment2 tanu=new Assignment2();
		tanu.m2(11, 24);
		
		
		
	}

}
