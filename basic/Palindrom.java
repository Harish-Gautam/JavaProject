
public class Palindrom 
{

	public static void main(String[] args)
	{
       int r,sum=0,temp;
       int n=2662;
       temp=n;
         while(n>0) 
         {
           r=n%10;
           sum=(sum*10)+r;
           n=n/10;
         }
       if(sum==temp) 
       {
       	System.out.println("Given number is palindrom");
       }
       else 
       {
       	System.out.println("Given number is not palindrom");
       }
	}

}
