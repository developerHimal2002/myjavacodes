package beginners;

import java.util.Scanner;

public class ScheduleFinding {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();
		int len = String.valueOf(day).length();
		
		//int sum_Time = 0;
		int temp[] = new int[len];
		
			for(int i=1; i<=len; i++)
			{	
				
				int average_Time = 0;
				int minimum_Time = sc.nextInt();
				int maximum_Time = sc.nextInt();
				
				average_Time = minimum_Time + maximum_Time / 2 ;
				System.out.println(average_Time);
				
				//temp[i] = average_Time;
				
			}	
//				int[] differnce_Time = null ;
//				
//				for(i=1; i<=len; i++)
//				{
//					for(int j=1; j<=len; j++)
//					{
//						difference_Time[j] = difference_Time[j] + average_Time[j];
//					}
//						if(spend_Hour !=  differnce_Time[2])
//							System.out.println("NO");
//						else
//						{
//							for(int k=1; k<=2; k++)
//							{
//								System.out.println(average_Time[k]);
//							}
//						}
//				}
				
	}
}
