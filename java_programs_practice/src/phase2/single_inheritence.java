package phase2;

class firsttt
{
	int a,b;
	void getdata(int x,int y)
	{
		a=x;
		b=y;
	}
	int add()
	{
	return(a+b);
	}
}
class second extends firsttt
{
	int mul()
	{
	return(a*b);
	}
}
public class single_inheritence
{
	public static void main(String arg[])
	{
		second obj = new second();
		obj.getdata(10, 20);
		int add=obj.add();
		int mul=obj.mul();
		System.out.println(add);
		System.out.println(mul);
		
	}
}

