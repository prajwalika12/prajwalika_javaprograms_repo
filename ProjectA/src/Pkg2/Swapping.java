package Pkg2;

import java.util.Scanner;

public class Swapping 
{


 public static void main(String[] args)
 { 
	 int a,b,c;
	 System.out.println("Enter two numbers");
	 Scanner In=new Scanner(System.in);
	 a=In.nextInt();
	 b=In.nextInt();
	 System.out.println("Before swapping: "+a+ " "+b);
	 c=a;
	 a=b;
	 b=c;
	 System.out.println("After swapping: "+a+ " "+b);
}
}
