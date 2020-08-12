package phase1;
import java.util.Scanner;
public class leap_Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a year");
		int year = obj.nextInt();
		
		if (((year % 4==0) && (year % 100!=0))||(year%400==0))
		
		
			System.out.println("leap");
		
		else
		
			System.out.println("not leap");
		
	}

}
