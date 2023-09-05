import java.util.Arrays;

public class Anaggram
{
   public static void main(String [] args) 
   {
	   //Given Two String value
	   String a="harish";
	   String b="Harish";
	   
	   //change to LowerCase
	   a=a.toLowerCase();
	   b=b.toLowerCase();
	   
	   //match to the Length Strings 
	   if(a.length()==b.length()) 
	   {
		   char [] x=a.toCharArray();
		   char [] y=b.toCharArray();
		   //sorting Strings  
		   Arrays.sort(x);
		   Arrays.sort(y);
	  
		 boolean result=Arrays.equals(x, y);
		 if(result==true) 
		 
		 {
			 System.out.println("Given String is a anagram");
		 }
		 else 
		 {
			 System.out.println("Given String is not anagram");
		 }
         }
	 else 
	 {
		 System.out.println("Given String is not anagramLength");
	 }
   }
}
