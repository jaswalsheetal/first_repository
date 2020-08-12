package phase1;

public class prime100 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int counter;
		for(int i=2;i<=100;i++)
		{
			counter=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					counter++;
				}
			}
			if(counter==2)
			{
				System.out.print(i+"  ");
			}
		}

	}

}
