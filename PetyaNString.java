package beginners;

public class PetyaNString {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);


        //String str1 = new String("AAA"); // you can also make the literal String.
	String str1 = "AAA";
        //String str2 = new String("AAA"); 
        String str2 = "AAA";
		
        for (int i = 0; i < str1.length() &&  
                i < str2.length(); i++) { 
        if ((int)str1.charAt(i) == (int)str2.charAt(i)) 
        { 
        	System.out.println("SAME" + " " + i);
        	continue; 
        }  
        else { 
            System.out.println((int)str1.charAt(i) - (int)str2.charAt(i)); 
        } 
        
        if (str1.length() < str2.length()) { 
            System.out.println((str1.length()-str2.length()));
        }  
//        else if (str1.length() > str2.length()) { 
//        	System.out.println((str1.length()-str2.length())); 
//        }
//        else
//        	System.out.println("0");
    } 
        
//	      Scanner sc = new Scanner(System.in);
//	      
//	      int n=0;
//	      n = sc.nextInt();
//	      int temp = n;
//	      int power = 1;
//	      while(temp >= 10)//(temp<=9)
//	      {
//	    	  temp = temp / 10;
//	    	  power = power * 10;
//	      }
//	      
//	      temp = n;
//	      while(power != 0)
//	      {
//	    	  int digit = temp / power ;
//	    	  System.out.println(digit);
//	    	  temp = temp % power;
//	    	  power= power / 10;
//	      
//	      }
	      
	      
	}

}
