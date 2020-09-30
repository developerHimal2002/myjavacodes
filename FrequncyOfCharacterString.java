package beginners;

import java.util.Scanner;

public class FrequncyOfCharacterString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();

		while(t-- > 0)
		{
			String str = sc.next();
			char s1[] = str.toCharArray();
			boolean isVisited[] = new boolean[s1.length]; 
			
			for(int i=0; i<s1.length; i++)
			{
				int count[] = new int[s1.length];
				for(int j=0; j<s1.length; j++)
				{
					
					if(s1[i] == s1[j] && !isVisited[j])
					{
						count[i]++;
						isVisited[j] = true;
					}
				}
				
//				int max = count[0];
//				boolean isDone[] = new boolean[s1.length];
//				
//				if(count[max] > count[i] && !isVisited[i])
//				{
//					int temp = max;
//					max = i;
//					i = temp;	
//					isVisited[i] = true;
//				}
//				if(isVisited[i])
				if(count[i] > 0) 
					System.out.println(s1[i] + " Frequncy is " + count[i]);
		
			}
		}
	}
	
}	