package Pkg2;

public class static2 
{
	 static int tanu;    //making global variable static
	public static void method()   // making method static
	{
		tanu=tanu+1;
	}
	public static void main(String[] args) 
	{
		System.out.println("****first object****");
		static2.method();         //calling method using classname.methodname
		System.out.println(static2.tanu);   //calling variable using classname
		System.out.println("*****second object*****");
		static2.method();
		System.out.println(static2.tanu);
		System.out.println("****third object****");
		static2.method();
		System.out.println(static2.tanu);
	}
	

}
