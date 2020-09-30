package beginners;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramSecondMethod {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		char s1[] = str1.toCharArray();
		char s2[] = str2.toCharArray();
		
		boolean isAnagram = false;
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		System.out.println(s1);
		System.out.println(s2);
		
		for(int i=0; i<str1.length(); i++)
		{
			isAnagram = false;
			if(s1[i] == s2[i])
			{
				isAnagram = true;
			}
			else
			{
				System.out.println(s1[i] + " and " + s2[i] + " is not same. ");
				isAnagram = false;
				break;
			}
		}
		
		if(isAnagram)
			System.out.println("True");
		else
			System.out.println("False");
		
	}

}
