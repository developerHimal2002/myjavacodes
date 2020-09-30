package beginners;

import java.util.Scanner;

public class SumOfFirstNLastNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int sum[] = new int[T];
		int first_digit[] = new int[T];
		int last_digit[] = new int[T];
		
		for(int i=0; i<T; i++)
		{
			int N = 0;
			int len = 0;
			N = sc.nextInt();
			len = String.valueOf(N).length();
			
			if (len <= 2)
			{
				if(len < 1)
				{
					sum[i] = N;
				}
				else
				{		
					while(len-- > 0)
					{
						first_digit[i] = N / 10;
						last_digit[i] = N % 10;
					}
					sum[i] = first_digit[i] + last_digit[i]; 
				}
			}
			else
			{
				first_digit[i] = N;
				
				while(first_digit[i] >= 10)
				{
					first_digit[i] = first_digit[i] / 10;
				}	
				
				last_digit[i] = N % 10;
				
				sum[i] = first_digit[i] + last_digit[i];
			}		
		}
		
		for(int j=0; j<T; j++)
			System.out.println(sum[j]);
	
	}
}
