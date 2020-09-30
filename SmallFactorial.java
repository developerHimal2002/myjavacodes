package beginners;

import java.util.Scanner;

public class SmallFactorial {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	while(n-- >0)
	{
		int Factorial = 1;
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++)
		{
			Factorial = Factorial * i ;
		}
		System.out.println(Factorial);
	}
			
	}
}
