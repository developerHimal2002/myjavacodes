package beginners;

import java.util.Arrays;
import java.util.Scanner;

public class MathsProblem {

	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);
				String s = sc.next();
				int[] nums = new int[(s.length()/2)+1];
				int index = 0;

				for (char c : s.toCharArray()) {
					if (c != '+') {
						nums[index] = Character.getNumericValue(c);
						System.out.println(nums[index]);
						index++;
					}
				}	

				Arrays.sort(nums);

				for (int i = 0; i < nums.length-1; i++) {
					System.out.print(nums[i]+"+");
				}
				System.out.print(nums[nums.length-1]);
	}

}
