package beginners;

import java.util.Scanner;

public class ChatRoom {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char ch_s[] = s.toCharArray();
		int l=0;
		
		for(int i=0; i<s.length(); i++)		
		{
			
			if(ch_s[i] == 'h' && l==0)
				l++;
			
			else if(ch_s[i] == 'e' && l==1)
				l++;
			
			else if(ch_s[i] == 'l' && l==2)
				l++;

			else if(ch_s[i] == 'l' && l==3)
				l++;

			else if(ch_s[i] == 'o' && l==4)
				l++;
			if(l==5)
				break;
			
		}
		if(l==5)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
 