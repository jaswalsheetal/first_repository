package phase1;
import java.util.Scanner;

public class leap_first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a year");
		int year = obj.nextInt();
		boolean leap=true;
		if(year % 4==0)
		{
			if(year % 100==0)
			{
				if(year % 400==0)
				leap = true;
				else
					leap=false;
			}
			else
				leap = true;
		}
		leap=false;
		if(leap)
		{
			System.out.println("leap year");
		}
			else
			{
				System.out.println("not leap");
				
			}}
		

	}


