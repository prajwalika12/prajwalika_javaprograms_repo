package Pkg2;

public class doubleloopEx3 
{
	public static void main(String[] args) 
	{
		
		for(int i=1;i<=5;i++)
		{
			int p=1;
		    for(int j=1;j<=i;j++)
			{ 
				
		     System.out.print(p++);
				
			}
			System.out.println();
			
		}
		
	}

}
