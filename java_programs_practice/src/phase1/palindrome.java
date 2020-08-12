package phase1;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1216,rev=0,rem;
		int temp=num;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println("plaindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
