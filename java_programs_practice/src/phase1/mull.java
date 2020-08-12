package phase1;

 class abc {
	int a,b,c;
	void getdata(int x,int y)
	{
		a=x;
		b=y;
		
	}
	void add()
	{
		c=a+b;
		System.out.println(c);
	}
}
public class mull
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc obj = new abc();
		obj.getdata(10, 20);
		obj.add();
		
}}