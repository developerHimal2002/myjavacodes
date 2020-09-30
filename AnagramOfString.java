package beginners;

public class AnagramOfString {

	public static void main(String[] args) {
	
		String A = new String("a^ab");
		String B = new String("baa^");
		boolean visited[] = new boolean[A.length()];
		boolean isAnagram = true;
		
//		if(A.length() == B.length())
//		{
//			for(int i=0; i<A.length(); i++)
//			{
//				char find = A.charAt(i);
//				isAnagram = false;
//				for(int j=0; j<B.length(); j++)
//				{
//					if(B.charAt(j) == find && !visited[j])
//					{
//						visited[j] = true;
//						isAnagram = true;
//						break;
//					}
//				}
//				
//				if(!isAnagram){
//					break;}
//			}
//		}
		
		int al[] = new int[256];
//		int bl[] = new int[256];
		
//		for(int j=0; j<A.length(); j++)//Another Way to Represent this loop
//		{
//			char ch[j] = A.toCharArray();
//			int index = (int) ch[j];
//			al[index]++;      // al[index] = al[index] + 1;
//		}
		
		for(char ch : A.toCharArray())
		{
			int index = (int) ch;
			al[index]++;
		}
		
		for(char ch : B.toCharArray())
		{
			int index = (int) ch;
			al[index]--;
		}
		
		for(int i=0; i<256; i++)
		{
			if(al[i] != 0)
			{
				isAnagram = false;
				break;
			}
		}
		
		if(isAnagram) {
			System.out.println("Anagram");}
		else {
			System.out.println("Not Anagram");}
	}

}
