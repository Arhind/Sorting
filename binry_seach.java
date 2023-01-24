package algorithm;
import java.util.Scanner;

public class binry_seach {

	public static void binary_search(int a[], int n, int key)
	{
		int l=a[0];
		int r=a[n-1];
		
		do {
			int i=0;
			int mid = (l+r)/2;
			if(key > mid)
			{
				l=mid+1;
			}
			else if( key < mid )
			{
				r=mid-1;
			}
			else
			{
				System.out.println(key+" found at "+a[i]);
				break;
			}
			i++;
		}while(n>0);
	}
	
	public static void main(String[] args) {
		
		int i, n, key=0;
		int a[] = new int[20];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the key : ");
		key = sc.nextInt();
		System.out.print("Enter the limit : ");
		n = sc.nextInt();
		
		for(i=0; i<n; i++)
			a[i] = sc.nextInt();

		binary_search(a, n, key);
	}
}
 