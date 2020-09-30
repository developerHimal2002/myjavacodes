package beginners;

import java.util.Scanner;

public class PrimePalindrome {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		
		int mod = 0;
		int rev = 0;
		int count = 0;
			
		boolean isPrime = false;
		boolean isPalindrome = false;				

//			PRIME NUMBER FIND
		
				int x =  101;
					
				for(int i=1; i<=x; i++)
				{
					if(x % i == 0)
					{
						count++;
					}
				}	
					
				if(count < 3)
				{
					isPrime = true;					
				}

						
						
//			PALINDROME NUMBER FIND
					
				int tempx = x;
				while(tempx > 0)
				{
					mod = tempx % 10;
					rev = rev * 10 + mod;
					tempx = tempx / 10;
				}
					
				if(x == rev)
				{					
					isPalindrome = true;
				}
					
				if(isPrime == true && isPalindrome == true)
					System.out.println(x + " is Prime Palindrome");
					
				else
					System.out.println(x + " is not Prime Palindrome");	
						
	}

}
