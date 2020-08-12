package phase2;
public class paramater_constructor

{
	int a,b;

	paramater_constructor(int x,int y)
{

a=x;
b=y;
}
void add()
{
	System.out.println(a+b);
}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paramater_constructor obj = new paramater_constructor(10,20);
		obj.add();
		

	}

}
