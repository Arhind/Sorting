
 class BubbleSortRecursion {

	public static void main(String[] args)
	{
		int[] ar = {9,8,7,6,5,4,3,2,1,10,2};

		BubbleSortRecursion b = new BubbleSortRecursion();
		b.recursion(ar, ar.length);
		for( int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
	
	 void recursion(int[] a , int n) {
		int i;
		
		if (n == 0 || n == 1)
	    {
	        return;
	    }
		for( i=0; i<n-1; i++) 
		{	
			if( a[i]>a[i+1]) 
			{
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
		}	}
	 recursion(a, n-1);
	 
	}
	
}
