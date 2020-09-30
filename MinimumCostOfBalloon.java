package beginners;

import java.util.Scanner;

public class MinimumCostOfBalloon {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int maxBalloon = 2;
		
		while(t-- > 0)
		{
			int costBal[] = new int[maxBalloon];
			for(int i=0; i<maxBalloon; i++)
			{
				costBal[i] = sc.nextInt();
			}
			
			int n = sc.nextInt();
			int sumBal[] = new int[maxBalloon];
			
			for(int j=0; j<n; j++)
			{
				for(int k=0; k<maxBalloon; k++)
				{
					int Val = sc.nextInt();
					sumBal[k] += Val;
				}
				System.out.println(Math.min(costBal[0] * sumBal[0] + costBal[1] * sumBal[1], costBal[1] * sumBal[0] + costBal[0] * sumBal[1]));
			}
			System.out.println(Math.min(costBal[0] * sumBal[0] + costBal[1] * sumBal[1], costBal[1] * sumBal[0] + costBal[0] * sumBal[1]));
		}
		
		
	}

}
