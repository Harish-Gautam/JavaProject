
public class Swap2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num1=30;
		int num2=20;
		System.out.println("Befor swaping");
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);                       //without third variable swapping
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After swaping");
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);

	}

}
