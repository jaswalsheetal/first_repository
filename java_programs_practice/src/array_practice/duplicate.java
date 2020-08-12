package array_practice;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,2,3,4,5,5,6,7,7,7,8,9,6,7,8,9,9};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]==arr[i])
				{
					System.out.println(arr[i]);
				}
			}
		}

	}

}
