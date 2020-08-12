package phase1;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,fact=1;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the number to find out the factorial");
		n=obj.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			System.out.print(fact+"\t");
		}
		System.out.println();
		System.out.println(fact);
	}

}
