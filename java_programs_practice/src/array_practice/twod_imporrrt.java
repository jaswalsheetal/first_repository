package array_practice;
import java.util.Scanner;
public class twod_imporrrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the memeory");
		m=obj.nextInt();
		n=obj.nextInt();
		int arr[][]=new int[m][n];
		System.out.println("array is");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=obj.nextInt();
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{System.out.print(arr[i][j]+"\t");
	}
System.out.println();
}}}
