package phase2;
interface A
{
	int roll=121;
	void disp();
	
}
interface B
{
	int A=1213;
	void dispb();
}
class  CVB implements A,B
{

	@Override
	public void dispb() {
		// TODO Auto-generated method stub
		System.out.println("a is:"+A);
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("roll is:"+roll);
		
	}
	
	
}
public class interface_first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CVB obj = new CVB();
		obj.disp();
		obj.dispb();

	}}

