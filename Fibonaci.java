
public class Fibonaci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=1 ,b=2,sum=0,total=0;
		
		while (true )
		{
			sum= a+b;
			a=b;
			b=sum;
			if ( sum > 4000000 )
				break;
			
			if (sum % 2 == 0)
			{
				total+=sum;
			}
		}
		System.out.println(total);
	}

}
