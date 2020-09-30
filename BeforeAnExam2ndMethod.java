package beginners;

import java.util.Scanner;

public class BeforeAnExam2ndMethod {

	public static void main(String[] args) {
	
				Scanner sc = new Scanner(System.in);
				
				int n = sc.nextInt();
				int sum = sc.nextInt();
				int a[] = new int[n];
				int b[] = new int[n];
				int a1 = 0; // minimum sum
				int b1 = 0; // maximum sum
				
				for (int i = 0; i < n; i++) {
					a[i] = sc.nextInt();
					a1 += a[i];
					b[i] = sc.nextInt();
					b1 += b[i];
				}
				 if (a1> sum || b1 <sum) // if the number entered is less than or greater than the sum of the minimum and maximum value can not be achieved
					System.out.println("NO");
				else {
					System.out.println("YES");
					sum -= a1;
					for (int i = 0; i < n - 1; i++) {
						 if (b [i] - a [i] <sum) {// first sequentially allocated in order of the largest
							System.out.print(b[i] + " ");
							sum -= b[i] - a[i];
							System.out.println("SUM IS " + sum);
						} else {
							System.out.print((a[i] + sum) + " ");
							sum = 0;
						}
					}
					System.out.println(a[n - 1] + sum);
				}
			}
		}