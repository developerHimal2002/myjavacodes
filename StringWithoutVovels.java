package beginners;

import java.util.Scanner;

public class StringWithoutVovels {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String inputstring = sc.nextLine();
		
		String inputstring1 = inputstring.toLowerCase();
		
		String newInputString = inputstring1.replaceAll("[aeiou]", ""); //	IMPORTENT PART
		
		System.out.println(newInputString);
		
		char input[] = newInputString.toCharArray();
		
		for(int i=0; i<input.length; i++)
		{
			System.out.print("."+input[i]);
		}
	}

}
