package beginners;

import java.util.Scanner;

public class BirthdayParty {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int type_Candie[] = new int[10];
		int total_Child = 0;
		int en_Candie[] = new int[10];
		
		int en_Div[] = new int[10];
		int final_ans[] = new int[10];
		
		for(int i=0; i<t; i++)
		{
			type_Candie[i] = sc.nextInt(); 
			total_Child = sc.nextInt();
			int en_Sum = 0;
			for(int j=0; j<type_Candie[i]; j++)
			{
				en_Candie[j] = sc.nextInt();
				en_Div[j] = en_Candie[j] / total_Child;
				en_Sum = en_Sum + en_Div[j];  
			}
			final_ans[i] = en_Sum;
		}
		
		for(int i=0; i<t; i++)
			System.out.print(final_ans[i] + " ");
		
	}

}
