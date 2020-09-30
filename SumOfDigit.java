package beginners;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num[] = new int[n];
		int catch_Sum[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			num[i] = sc.nextInt();
			int len = String.valueOf(num[i]).length();
			int sum = 0;
			for(int j=0; j<len; j++)
			{
				int last_Digit = num[i] % 10;
				sum = sum + last_Digit ; 
				num[i] = num[i]/10;
			}
			catch_Sum[i] = sum;
		}
		
		for(int SUMM : catch_Sum)
			System.out.println(SUMM);
	}
}
