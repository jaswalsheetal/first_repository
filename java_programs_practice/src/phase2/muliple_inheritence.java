package phase2;

class Auy
{
	int m1,m2;
	void getdata(int x,int y)
	{
		m1=x;
		m2=y;
		
	}
	void dispmarks()
	{
		System.out.println("marks is:"+m1+m2);
	}
}
interface Bmn
{
	int sp=23;
	void dispsp();
}
class Cvbv extends Auy implements Bmn
{
void dispc()
{
	dispmarks();
	
}
	@Override
	public void dispsp() {
		// TODO Auto-generated method stub
		System.out.println(sp);
		
	}
	
}
public class muliple_inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cvbv obj = new Cvbv();
		obj.getdata(100, 200);
		obj.dispmarks();
		obj.dispc();
		obj.dispsp();

	}

}
