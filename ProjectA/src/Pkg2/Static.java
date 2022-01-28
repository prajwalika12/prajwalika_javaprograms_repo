package Pkg2;

public class Static 
{
	static int tanu;
	public void method()
	{
		tanu=tanu+1;
	}
public static void main(String[] args)
{
	System.out.println("*******first object*******");
	Static obj=new Static();
	obj.method();
	System.out.println(obj.tanu);
	System.out.println("***********second object********");
	Static ob=new Static();
	ob.method();
	System.out.println(ob.tanu);
	System.out.println("******third object******");
	Static st=new Static();
	st.method();
	System.out.println(st.tanu);
	
}
}
