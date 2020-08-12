package phase2;
class ROLL
{
	int a;
	void getdata(int x)
	{
		a=x;
	
	}
	void putroll()
	{
		System.out.println("roll no:"+a);
	}
}
class marks extends ROLL
{
	int m1,m2;
	void getmarks(int x,int y)
	{
		m1=x;
		m2=y;
	}
	void putmarks()
	{
		System.out.println("first marks:"+m1);
		System.out.println("secons marks:"+m2);
	}
}
class total extends marks
{
	int total;
	void disp()
	{
		putroll();
		putmarks();
		total=m1+m2;
		System.out.println("total is:"+total);
	}
}
public class multilevel_inheritence {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		total obj = new total();
		obj.getdata(20);
		obj.getmarks(100, 200);
obj.disp();
	}

}
