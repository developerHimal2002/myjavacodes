package beginners;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReceiptFinder {

	public static void main(String[] args) throws IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		
		while(t-- > 0)
		{
			int N = Integer.parseInt(br.readLine());
			int ans = 0;
			for(int i=11; i>=0; i--)
			{
				int p = (int)Math.pow(2.0,(double)i);
				
				if(N - p >= 0)
				{
					N-=p;
					i++;
					ans = ans + 1;
				}	
			}
			System.out.println(ans);
		}	

	}

}
