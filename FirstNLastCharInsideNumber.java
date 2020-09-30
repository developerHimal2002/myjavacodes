package beginners;

import java.util.Scanner;

public class FirstNLastCharInsideNumber {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		int word = sc.nextInt();
		String[] en_Word = new String[100];
		int en_Length[] = new int[100];
		
		for(int i=0; i<word; i++)
		{
			en_Word[i] = sc.next();
		}
		
		for(int j=0; j<word; j++)
		{
			en_Length[j] = en_Word[j].length();
			
			char start[] = new char[100];
			char end[] = new char[100];
			int new_en_length[] = new int[100];
			
			if(en_Length[j] <= 10)	
			{
				System.out.println(en_Word[j]);
			}
			else
			{
				start[j] = en_Word[j].charAt(0);
				end[j] = en_Word[j].charAt(en_Length[j]-1);
				new_en_length[j] = en_Length[j] - 2;
				
				System.out.print(start[j]);
				System.out.print(new_en_length[j]);
				System.out.println(end[j]);
				
			}
		}
	}

}

//Scanner sc = new Scanner(System.in);
//
//int word = sc.nextInt();
//String[] en_Word = new String[100];
//int en_Length[] = new int[100];
//
//for(int i=0; i<word; i++)
//{
//	en_Word[i] = sc.next();
//	en_Length[i] = en_Word[i].length();
//	
//	if(en_Length[j] <= 10)
//	{
//		System.out.println(en_Word[i]);
//	}
//	else
//	{
//		char start = en_Word[i].charAt(0);
//		char end = en_Word[i].charAt(en_Length[i]-1);
//		int new_en_length = en_Length[i] - 2;
//		System.out.print(start);
//		System.out.print(new_en_length);
//		System.out.println(end);
//		System.out.println(start + new_en_length + end);
//	}
//}

