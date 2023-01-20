package algorithm;
import java.util.Scanner;

public class linear_search {

	public static void linear_search(int a[], int n, int key)
	{
		int i=0;
		while(n>0)
		{
			if( key == a[i])
				System.out.println("Key "+key+" found at "+a[i]);
		n--;
		i++;
		}
	}
	
	public static void main(String[] args) {

		int i, n, key=0;
		int a[] = new int[20];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the key : ");
		key = sc.nextInt();
		System.out.print("Enter the limit : ");
		n = sc.nextInt();
		
		for(i=1; i<=n; i++)
			a[i] = sc.nextInt();

		linear_search(a, n, key);
	}
}