package beginners;

import java.util.Scanner;

public class Presents {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a[] = new int[num];
		int n=0,o;
		for(int i=0; i<num; i++)
		{
			a[i] = sc.nextInt();
		}

		for(int j=0; j<num; j++)
		{
			n = a[j];
			o = a[n];
			a[j] = o;
			System.out.print(o);
			System.out.print(n);
		}
	}

}