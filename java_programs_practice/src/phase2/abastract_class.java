package phase2;
abstract class FIRST_DEMO
{
	abstract void disp();
	void display()
	{
		System.out.println("method of first_demo");
	}
}
class subbb extends FIRST_DEMO
{
	void disp()
	{
		System.out.println("extracted from first method");
	}
}

public class abastract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subbb obj = new subbb();
		obj.disp();
		obj.display();
		

	}

}
