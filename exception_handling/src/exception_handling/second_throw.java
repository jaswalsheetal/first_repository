package exception_handling;

public class second_throw {
	static void age_demo(int age) throws ArrayIndexOutOfBoundsException
	{
		if(age>18)
		{
			System.out.println("not valid");
		}
			else
			{
				System.out.println("not execption");
				
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		age_demo(19);
		System.out.println("valid");

	}

}
