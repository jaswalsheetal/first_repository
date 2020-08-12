package array_practice;

public class twod_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[3][4];
		arr[0][2]=5;
		arr[1][2]=5;
		arr[2][2]=5;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
