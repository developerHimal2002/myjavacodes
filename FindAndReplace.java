package beginners;

import java.util.Scanner;

public class FindAndReplace {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int len = s.length();
		char ch_s[] = s.toCharArray(); 
		int l=0;
		
		
		for(int i=0; i<len; i++)
		{	
			if(ch_s[i] == 'a' || ch_s[i] == 'A' && l == 0) 
			{
				s = s.replace('a', 'h');
				s = s.replace('A', 'H');
				l++;
			}
			
			else if(ch_s[i] == 's' || ch_s[i] == 'S' && l == 1)
			{
				s = s.replace('s', 'i');
				s = s.replace('S', 'I');
				l++;
			}
			
			else if(ch_s[i] == 'h' || ch_s[i] == 'H' && l == 2)
			{
				s = s.replace('h', 'm');
				s = s.replace('H', 'M');
				l++;
			}
			
			else if(ch_s[i] == 'o' || ch_s[i] == 'O' && l == 3)
			{
				s = s.replace('o', 'a');
				s = s.replace('O', 'A');
				l++;
			}
			
			else if(ch_s[i] == 'k' || ch_s[i] == 'K'  && l == 4)
			{
				s = s.replace('k', 'l');
				s = s.replace('K', 'L');
				l++;
			}
		}
		System.out.println(s);
		
		if(l==5)
			System.out.println("Replaced.");
		else
			System.out.println("Not Founded 'ASHOK'.");

	}

}
