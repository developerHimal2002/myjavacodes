package beginners;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args){
		
		Scanner sc =  new Scanner(System.in);
		
		int T ;
		T = sc.nextInt();
		int a,b,c;
				
		for(int i=0; i<T; i++)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			if(a>b && a<c || a<b && a>c)
				System.out.println(a);
			else if(b>a && b<c || b<a && b>c)
				System.out.println(b);
			else
				System.out.println(c);
		}
		

	}

}
