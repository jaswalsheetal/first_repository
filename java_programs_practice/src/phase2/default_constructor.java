package phase2;

class TEST
{
	int a,b;
	TEST()
	{
		a=10;b=20;
	}
	void add()
	{
		System.out.println("addition is:"+(a*b));
	}
}
public class default_constructor {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TEST obj = new TEST();
		obj.add();

	}

}
