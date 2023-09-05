public class BubbleSorting 
{
	public static void main(String[] args) 
	{
		int [] num= {90,45,14,13,12,40};
		int n=num.length;
		for(int r=1;r<n;r++)
		{
			for(int j=0;j<n-r;j++)
			{
				if(num[j]>num[j+1])
				{
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}//end of round loop
		//loop to display numbers
		for(int x:num)
		{
			System.out.println(x);
		}
	}
}
