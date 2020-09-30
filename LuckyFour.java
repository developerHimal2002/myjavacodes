package beginners;

import java.util.Scanner;

public class LuckyFour {
	
	public static void main(String[] args){
		
		Scanner sc =  new Scanner(System.in);
		
		int t = sc.nextInt();
		int[] num = new int[1000];
		int countt[] = new int[50];
		int rem = 0;
		for(int i=0; i<t; i++)
		{
			int count = 0;
			num[i] = sc.nextInt();
			int len = String.valueOf(num[i]).length();
			
			while(len-- > 0)
			{
				rem = num[i] % 10;
				
				if(rem == 4)
					count++;
				
				num[i] = num[i] / 10;
				
			} 
			countt[i] = count;
			
			//System.out.println(count);
		}
		for(int i=0; i<t; i++)
			System.out.println(countt[i]);
		
	}
}