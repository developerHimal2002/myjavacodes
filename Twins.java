package beginners;

import java.util.Arrays;
import java.util.Scanner;

public class Twins {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long sum = 0;
		int mincoin = 0;
		int minCoinSum = 0;
		int coins[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			coins[i] = sc.nextInt();
			sum = sum + coins[i];
		}
		
		Arrays.sort(coins);
		
		for(int j=n-1; j>=0; j--)
		{
			minCoinSum = minCoinSum + coins[j];
			
			if(minCoinSum > (sum-minCoinSum))
			{
				mincoin++;
				break;
			}
			mincoin++;
		}
		System.out.println(mincoin);
		
	}

}
