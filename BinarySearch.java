//Binary Search Integer Array
//Limitation of Binary Search : List should be sorted already
//Worst Case : log(N+1), Best Case : O(1)

package searching;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] ar = {2,5,7,9,12,14,16,17,19,20,24,28};	//Sorted array
		int key=2;
		int low=0, high=ar.length-1;
		
		while( low<=high )
		{
			int mid= (low+high)/2;
			if( key == ar[mid] )
		{
			System.out.println(key+" found at "+mid);
			break;
		}
		else if( key > ar[mid])
			low = mid+1;
		else
			high = mid -1;
		}
	}
}