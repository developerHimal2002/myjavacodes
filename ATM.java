package beginners;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int withdraw_Ammount = sc.nextInt() ;
		float bank_Balance = sc.nextFloat();
		
		if( ((withdraw_Ammount+0.50) < (bank_Balance)) && (withdraw_Ammount % 5 == 0)  )
			{
				float final_Balance = (float)(bank_Balance - withdraw_Ammount - 0.50);
				System.out.println(final_Balance);
			}
    	else
			System.out.println(bank_Balance);
		
		}
			
	}


