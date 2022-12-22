// Time complexity : O(n*n)


public class BubbleSort {

	public static void main(String[] args) {

		int[] ar = {9,8,7,6,5,4,3,2,1,10,2};
		
		for(int i=0; i<ar.length; i++)
		{
			for( int j=0; j<ar.length-i-1; j++) //Remember this point
			{
				if( ar[j]>ar[j+1] )
				{
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
	for( int i=0; i<ar.length; i++)
	{
		System.out.print(ar[i]+" ");
	}
	}
}
