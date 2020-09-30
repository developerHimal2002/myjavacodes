package beginners;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerForFactorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		BigInteger f = new BigInteger("1");
		int n = sc.nextInt();
		
		for(int t=1; t<=n; t++)
		{
			int a = sc.nextInt();
			for(int i=1; i<=a; i++)
			{
				f = f.multiply(BigInteger.valueOf(i));
			}
			System.out.println(f);

		}

}
}
