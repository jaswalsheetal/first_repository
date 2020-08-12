 package phase2;
class printt
{
	int a;int b;
	
	void getdata(int x,int y)
	{
		a=x;
		b=y;
	}
	void no()
	{
		System.out.println("two number are");
		System.out.println(a);
		System.out.println(b);
	}
}
class addition extends printt
{
	void add()
	{
		System.out.println(a+b);
	}
}
class multiply extends addition
{
	void mul()
	{
		System.out.println(a*b);
	}
}
public class hirerichal_inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition obj = new addition();
		multiply obj1=new multiply();
		obj1.getdata(5, 5);
		obj.getdata(10, 20);
		obj.no();
		obj.add();
		obj1.mul();

	}

}
