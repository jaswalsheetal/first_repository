package array_practice;

public class miniumum_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={3,4,5,6,8,8,1,0};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
System.out.println(min);
	}

}
