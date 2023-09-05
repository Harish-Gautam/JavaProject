
public class SumDigits {

	public static void main(String[] args)
	{
		int num=1237,sum=0,r;
		while(num!=0) 
		{
			r=num%10;
			sum=sum+r;
			num=num/10;
		}
		System.out.println("sum are digits of = "+sum);
	}

}
