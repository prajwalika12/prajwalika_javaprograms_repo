package Pkg2;

public class child extends parent
{
	public void method1()
	{
		System.out.println("child default method");
	}
	public void method2(int a)
	{
		super.m4(45, 67, 56);
		super.m1();
		super.m2(34);
		super.m3(23, 67);
		super.m5(90, 36, 32, 0);
		this.method4(0, 7, 54);
		this.method3(45, 32);
		this.method1();
		this.method5(11, 77, 88, 55);
	System.out.println("child one parameterized method");
		
	}
	public void method3(int a,int b)
	{
		System.out.println("child two parameterized method");
	}
	public void method4(int a,int b,int c)
	{
		System.out.println("child three parameterized method");
	}
	public void method5(int a,int b,int c,int d)
	{
		System.out.println("child four parameterized method");
	}
	public static void main(String[] args)
	{
		child tanu=new child();
		tanu.method2(11);
		
	}

}
