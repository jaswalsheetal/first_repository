package phase2;

public class method_overloading {
	int a,b;
	void calc(int x)
	{
	a=x;
	System.out.println(a+a);
	}
void calc(int x, int y)
{
	a=x;
	b=y;
	System.out.println(a+b);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method_overloading obj = new method_overloading();
		obj.calc(5);
		obj.calc(10, 20);
		

	}

}
