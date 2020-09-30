package beginners;

import java.util.Scanner;

public class SumOfXOR {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    
	    int t = sc.nextInt();
	    int XOR = 0;
	    
	    while(t-- > 0)
	    {
	        int n = sc.nextInt();
	        int num[] = new int[n];
	        
	        for(int i=0; i<n; i++)
	        {
	            num[i] = sc.nextInt();
	            XOR = num[0];
	        }
	        
	        for(int j=1; j<n; j++)
	        {
	        		XOR = XOR ^ num[j];
	        }
	        
	        System.out.println(XOR);
	    }
	
	}

}
