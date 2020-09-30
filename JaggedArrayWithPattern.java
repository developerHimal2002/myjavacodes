package beginners;

public class JaggedArrayWithPattern {

	public static void main(String[] args) {

		int r = 5;
		int arr[][] = new int[5][];
		
		for(int k=0; k<arr.length; k++)
		{
			arr[k] = new int[k+1];
		}
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print("* ");
			}		
			System.out.println();
		}


	}

}
