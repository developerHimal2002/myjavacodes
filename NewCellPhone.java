package beginners;

import java.util.Scanner;

public class NewCellPhone {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t1 = sc.nextInt();
		String FullName[] = new String[1000];
		int Number[] =  new int[100];
		
		for(int i=0; i<t1; i++)
		{	
			FullName[i] = sc.nextLine();
			//sc.nextLine();
			//Number[i] = sc.nextInt();
		}
		
		int t2 = sc.nextInt();
		String FullName2[] = new String[100];
		int Number2[] = new int[100];
		//int value[] = new int[100];
		
		for(int j=0; j<t2; j++)
		{
			FullName2[j] = sc.next();
			Number2[j] = sc.nextInt();
			//value[j] = Number[j];
		}
		
		for(int k=0; k<t2; k++)
		{
			for(int p=0; p<t1; p++)	
			{
				if(FullName2[k] == FullName[p])
				{
					Number[p] = Number2[k];
				}
			}
		}
				
	}

}
