package beginners;

import java.util.Scanner;
import java.util.Arrays;

public class FindReminder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int reminder[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			reminder[i] = a % b ; 
		}
		
		for(int rem : reminder)
			System.out.println(rem);
		
			 
	}
}	
			
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int a[] = new int[n];
// 		
//		for(int k=0; k<n; k++)
//		{
//			a[k] = sc.nextInt();
//		}
//		
//		Arrays.sort(a);
//		for(int k=0; k<n; k++ )
//		{
//			System.out.println(a[k]);
//		}
//
//		Scanner sc = new Scanner(System.in);
//		
//		int a = 0;
//		a = sc.nextInt();
//		if(a % 2 == 0)
//			System.out.println("YES");
//		else
//			System.out.println("NO");