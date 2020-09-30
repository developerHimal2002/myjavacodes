package beginners;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		while(t-- > 0)
		{
			int a = in.nextInt();
			int b = in.nextInt();
			
			System.out.println(a+b);
		}
		//int a = in.nextInt();
		//int b = in.nextInt();
		//you can use this mehod if the size of number is fixed.
	
	}

}
