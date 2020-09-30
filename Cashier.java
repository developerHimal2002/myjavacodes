package beginners;

import java.util.Scanner;

public class Cashier {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cash[] = new int[101];
		int num;
	
		while((num = sc.nextInt()) != 0)
		{
			cash[num]++;
		}
		
		for(int i=0; i<101; i++)
		{
			if(cash[i] > 0)
			{
				System.out.println(i + " " + cash[i]);
			}
		}
		
	}

}
