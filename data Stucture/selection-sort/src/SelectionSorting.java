public class SelectionSorting 
{
	public static void main(String[] args) 
	{
		int [] num= {90,45,14,13,12,40};
		int n=num.length;
		for(int i=0;i<n;i++)
		{
			int si=i;
			for(int j=i+1;j<n;j++)
			{
				if(num[j]<num[si])
				{
					si=j;
				}
			}//End of loop(finding index of smallest number)
			int temp=num[i];
			num[i]=num[si];
			num[si]=temp;
		}//end of sorting
		for(int x:num)
			System.out.println(x);
	}
}
