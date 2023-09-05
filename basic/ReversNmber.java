

public class ReversNmber
{
    public static void main(String[] args)
    {
       int num=12345678,r;
       while(num!=0) 
       {
    	   r=num%10;
    	   System.out.print(r);
    	   num=num/10;
       }
   }

}
