package array_practice;

public class reverse_order_forward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,6,7,8,9,0};
		System.out.println("countinuous order");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println("reverse order");
for(int j=arr.length-1;j>=0;j--)
{
	System.out.print(arr[j]+"\t");
	
}
	}

}
