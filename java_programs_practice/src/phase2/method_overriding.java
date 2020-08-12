package phase2;

class sub
{
	int a=10;
void disp()
{
	
	
}
}
class superr extends sub
{
	int b=19;
	void disp()
	{
		System.out.println("a is:"+a);
		System.out.println("b is:"+b);
	}
}
public class method_overriding
{
	public static void main(String arg[])
	{
		superr obj = new superr();
		obj.disp();
		
	}
}