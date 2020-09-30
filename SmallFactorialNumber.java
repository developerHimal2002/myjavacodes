package beginners;

import java.util.Scanner;

public class SmallFactorialNumber {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int arr[] = new int[200];
	
	int ans = 0;
	int Fact;
	int test = sc.nextInt();
	
	
	while(test-- > 0)
	{
		arr[0] = 1;
		int m=1;
		Fact = sc.nextInt();
		for(int j=1; j<=Fact; j++)
		{
			int index = 0;
			int temp = 0;
			for(int i = 1; i <=m; i++)
			{
				ans = arr[index] * j + temp;
		//		System.out.println("Arr[" + index + "]is = " + arr[index]);
		//		System.out.println();
				arr[index++] = ans % 10 ; 
				temp = ans / 10 ;
		//		System.out.println("Answer is " + ans);
		//		System.out.println("Arr[" + index + "]is = " + arr[index]);
		//		System.out.println("Temp is = " + temp);
			}
			
			while(temp > 0)
			{
				arr[index++] = temp % 10;
		//		System.out.println("New Arr[" + index + "]is = "+ arr[index]);
				temp = temp / 10;
		//		System.out.println("New Temp is " + temp);
				m++;
			}
		}
			for(int k = m-1; k>=0; k--)
			{
				System.out.print(arr[k]);
		//		System.out.println("Arr[" + k + "]is = " + arr[k]);
			}
			System.out.println();
		}
	
	}	
}

