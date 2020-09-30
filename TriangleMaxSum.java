package beginners;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TriangleMaxSum {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);		
		int t =	sc.nextInt();
		
		while(t-- > 0)
		{
			int row = sc.nextInt();
			int arr[][] = new int[row][];
			
			for(int i=0; i<row; i++)
			{
				arr[i] = new int[i+1];
			}
			
			int total = 0;
			
			for(int j=0; j<arr.length; j++)
			{
				for(int k=0; k<arr[j].length; k++)
				{
					arr[j][k] = sc.nextInt();
					total = total + arr[j][k];
				}
			}
			
			System.out.println(total/2);
		}
	}
}