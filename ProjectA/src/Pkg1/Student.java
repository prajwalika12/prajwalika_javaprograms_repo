package Pkg1;

public class Student 
{
	int Rollno;
	int Age;
	public void Display1()
	{
		System.out.println("Welcome to all of you");
	}
	public void Display2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {
		Student S=new Student();
		S.Display1();
		S.Display2();
		S.Age=21;
		S.Rollno=5223;
		System.out.println("Age="+S.Age);
		System.out.println("Rollno="+S.Rollno);
	}


}
