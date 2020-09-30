package beginners;

import java.util.Scanner;

public class ScoreBoardWinner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		   
		int t = sc.nextInt();
		
		int a[] = new int[1000];
		int b[] = new int[1000];
		int Lead[] = new int[1000];
		
		for(int i=0; i<t; i++)
		{
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			Lead[i] = a[i] - b[i];
		}
		int max;
		max = Lead[0];
		for(int j=0; j<t; j++)
		{
			if(max < Lead[j+1])
			{
				Lead[j+1] = max;
			}
		}
		
		if(max > 1)
			System.out.println("1 " + max);
		else
			System.out.println("2 " + max);
			
	}

}
