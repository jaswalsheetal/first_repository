package exception_handling;

public class first_try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int dat=100/2;
			System.out.println(dat);
			int data=50/0;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
			int data=50/1;
			System.out.println(data);
			
		}

	}

}
