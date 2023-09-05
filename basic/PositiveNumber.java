import java.util.Scanner;

public class PositiveNumber
{
    public static void main(String [] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter your number");
    	int num=sc.nextInt();
    	if(num>0) 
    	{
    		System.out.println("Given number is positive value : "+num);
    	}
    	else if(num==0) 
    	{
    		System.out.println("Given number is 0");
    	}
    	else 
    	{
    		System.out.println("Given number is nigative value : "+num);
    	}
    	
    }
}
