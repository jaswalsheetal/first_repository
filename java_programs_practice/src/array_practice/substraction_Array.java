package array_practice;

public class substraction_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{3,2,1},{4,4,4},{6,6,6}};
		int b[][]={{1,1,9,},{2,2,2},{3,3,3}};
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				
			
				c[i][j]=a[i][j]-b[i][j];
			System.out.print(c[i][j]+"\t");
		}
		System.out.println();

	}

}}