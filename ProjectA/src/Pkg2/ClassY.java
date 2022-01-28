package Pkg2;

public class ClassY extends ClassX
{
  public void arithmetic(int a,int b)
  {
	  int c=a/b;
	  System.out.println("Result is "+c);
	  super.arithmetic(4, 3);
  }
  public static void main(String[] args)
  {
	ClassY obj=new ClassY();
	obj.arithmetic(36,12);    //child class override the parent class at runtime environment
	
	
}
}

