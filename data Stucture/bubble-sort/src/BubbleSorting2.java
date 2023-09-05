public class BubbleSorting2 
{
	public static void main(String[] args) 
	{
		String []name= {"Rahul","Hemant","Kuldeep","Amit","Manoj","Arun","Imran","hemant"};
		int n=name.length;
		for(int r=1;r<n;r++)
		{
			for(int j=0;j<n-r;j++)
			{
				int c=name[j].compareTo(name[j+1]);
				if(c>0)
				{
					String temp=name[j];
					name[j]=name[j+1];
					name[j+1]=temp;
				}
			}
		}//end of round loop
		//loop to display numbers
		for(String x:name)
		{
			System.out.println(x);
		}
	}
}
