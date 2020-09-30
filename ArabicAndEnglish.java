package beginners;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArabicAndEnglish {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
    	
    	while(t-- > 0)
    	{
    	    int even = 0;
    	    int odd = 0;
    	    int N = Integer.parseInt(br.readLine());
    	    int A[] = new int[N];
    	    
    	    for(int i=0; i<N; i++)
    	    {
    	       A[i] = Integer.parseInt(br.readLine());
    	       
    	       if(A[i] % 2 == 0)
    	            even++;
    	       else
    	            odd++;
    	    }
    	    
    	    if(even > odd)
    	        System.out.println("READY FOR BATTLE");
    	    else if(even == odd)
    	        System.out.println("NOT READY");
    	    else
    	        System.out.println("NOT READY");
    	}
		
//		BufferedReader br = new BufferedReader( 
//                new InputStreamReader(System.in));
//                
//			StringTokenizer st = new StringTokenizer(br.readLine()); 
//			
//			int t = Integer.parseInt(st.nextToken());
//			
//			while(t-- > 0)
//			{
//				int A = Integer.parseInt(br.readLine());
//				int B = Integer.parseInt(br.readLine());
//				int max = Math.max(A,B);
//				int sum = A+B;
//				System.out.println(max + " " + sum);
//			}
	}

}
