package array_practice;

public class copy_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={1,2,3,4,5};
		int arr2[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
		}
		System.out.println("print the origianal");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+"\t");
		}
System.out.println("print the second array");
for(int i=0;i<arr1.length;i++)
{
	System.out.print(arr2[i]+"\t");
}
	}

}
