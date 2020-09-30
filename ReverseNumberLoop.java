package beginners;

import java.util.Scanner;

public class ReverseNumberLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			int rev_num = sc.nextInt();
			int len = String.valueOf(rev_num).length();
			int rem = 0,reverse = 0;
			
			while(len-- > 0)
			{
				rem = rev_num % 10;
				reverse = reverse * 10 + rem;
				rev_num = rev_num / 10;
				
			}System.out.print(reverse);
			System.out.println();
		}
//		while(t-- > 0)
//		{
//			int num = sc.nextInt();
//			System.out.println(Math.sqrt(num));
//		}
	}

}
