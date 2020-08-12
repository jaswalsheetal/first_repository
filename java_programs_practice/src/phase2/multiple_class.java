package phase2;
class first
{
	int a,b,c;
	void getdata(int x,int y)
	{
		a=x;
		b=y;
	}
	void add()
	{
		c=a* b;
		System.out.println(c);
	}
}
public class multiple_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first obj = new first();
		obj.getdata(10, 20);
		obj.add();

	}

}
