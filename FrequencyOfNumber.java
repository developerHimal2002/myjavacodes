package beginners;

import java.util.Scanner;

public class FrequencyOfNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int number = 0;
		int digit = 0;
		int Frequncy[] = new int[10];
		
		while(t-- > 0)
		{
			number = sc.nextInt();
			for(int i=0; i<10; i++)
			{
				Frequncy[i] = 0;
			}
			
			while(number > 0)
			{
				digit = number % 10;
				Frequncy[digit]++;
				number= number / 10;
			}
			System.out.println();
			for(int j=0; j<10; j++)
			{
				if(Frequncy[j] > 0 )
					System.out.println("Frequncy Of " + j + " is " + Frequncy[j]);
			}
			
		}
		

	}

}
