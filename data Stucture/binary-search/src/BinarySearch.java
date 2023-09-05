public class BinarySearch 
{
	public static void main(String[] args) 
	{
		int [] num= {10,50,80,90,120,400,600,700,900,1290,1900,5600};
		int x=400;
		int lb=0;
		int ub=num.length-1;
		boolean found=false;
		while(lb<=ub)
		{
			int mb=(lb+ub)/2;
			if(x==num[mb])
			{
				System.out.println("Element found");
				found=true;
				break;
			}
			else if(x<num[mb])
				ub=mb-1;
			else
				lb=mb+1;
		}
		if(!found)
			System.out.println("Element not found");
		System.out.println("Total :"+count);
	}
}
