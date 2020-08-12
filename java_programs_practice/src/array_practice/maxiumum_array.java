package array_practice;

public class maxiumum_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,3,4,5,6,64,4,3,2,3,9};
	int	max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			
				max=arr[i];
		}
			System.out.println(max);
		}

	}

