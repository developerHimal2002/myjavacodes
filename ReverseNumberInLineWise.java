package beginners;

import java.util.Scanner;

public class ReverseNumberInLineWise {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  
	      int n = sc.nextInt();
	      int len = String.valueOf(n).length();
	      int num = 0;
	      int temp = 0;
	      
	      while(len-- > 0)//(temp<=9)
	      {
	    	  num = n % 10;
	    	  n = n / 10;
	    	  System.out.print(num);
	      }   
	      
	}
}
