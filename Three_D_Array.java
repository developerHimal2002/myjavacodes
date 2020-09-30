package beginners;

import java.util.Scanner;

public class Three_D_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter column = ");
		int r = sc.nextInt();
		
		int arr[][] = new int[r][];
		int even = 0;
		int odd = 0;
		
		System.out.println("Enter column = ");
		
		for(int i=0; i<r; i++)
		{
			int c = sc.nextInt();
			arr[i] = new int[c];
		}
		
		for(int j=0; j<arr.length; j++)
		{
			System.out.println();
			System.out.println("TestCase " + j + " with "+ arr[j].length + " values:");
			for(int k=0; k<arr[j].length; k++)
			{
				arr[j][k] = sc.nextInt();
				System.out.print(arr[j][k] + " ");
				if(arr[j][k] % 2 == 0)
					even++;
				else
					odd++;
			}
			System.out.println();
			System.out.println("Odd number is " + odd);
			System.out.println("Even number is " + even);
			even = 0;
			odd = 0;
		}
		
	}

}