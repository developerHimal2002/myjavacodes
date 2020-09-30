package beginners;

import java.util.Scanner;

public class LuckyDivison {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		if(checkDivisible(str))
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}
	
	private static boolean checkDivisible(String s)
	{
		int num = Integer.parseInt(s);
		if(num % 4 == 0 || num % 7 == 0 || num % 47 == 0)
			return(true);
		s = s.replace("4", "");
		s = s.replace("7", "");
		if(s.length() == 0) {
			return(true);
		}
		return false;		
	}
}