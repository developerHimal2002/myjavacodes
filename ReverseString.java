package beginners;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		//PALINDROME STRING
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String[] s = str.split(" ");
		
//		for(int i=0; i<s.length; i++)
//		{		
//			System.out.println(s[i]);
//		}
		for(int j=s.length-1; j>=0; j--)
		{
			System.out.print(s[j] + " ");
		}
		
		
//		Scanner sc = new Scanner(System.in);
//	
//		int N = sc.nextInt();
//		int num[] = new int[N]; 
//		int num_odd[] = new int[N];
//		int num_even[] = new int[N];
//		
//		for(int i=0; i<N; i++)
//		{
//			num[i] = sc.nextInt();
//		}
//		
//		for(int j=0; j<N; j++)
//		{
//			if(num[j] % 2 == 0 )
//			{
//				num_even[j] = num[j];
//				System.out.println(num_even[j]);
//			}
//			else
//			{
//				num_odd[j] = num[j];
//			}
//		}
//		
//		for(int p=N-1; p>=0; p--)
//		{
//			if(num_odd[p] != 0)
//				System.out.println(num_odd[p]);
//		}
//		
	}
}
