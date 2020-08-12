package phase1;

import java.util.Scanner;

public class multiple_class {

public static void main(String arg[])
{
	Scanner obj = new Scanner(System.in);
	int num;
	System.out.println("enter a number");
	num=obj.nextInt();
	boolean isprime=true;
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
	isprime=false;
		}
	}
	if(isprime)
	{
		System.out.println("prime number");
	}
	else
	{
		System.out.println("no prime");
	}
}
}
