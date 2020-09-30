package beginners;

public class SittingArrangment {

	public static void main(String[] args) {

		
		
		
		
		int seatNo[] = new int[108];
		
		for(int i:seatNo ){
		    int row ;
		    row = ( i + ( 6 - ( i % 6 ) ) ) / 6 ;
		    int seat = i % 6; 
		    if( i % 12 == 0 ){
		      row = i / 6 ;
		      seat = 6 ;
		    }
		    int opposite;
		    if( row % 2 == 1)
		        opposite = row * 6 + ( 6 - seat + 1 );
		    else 
		        opposite = ( row - 1 ) * 6 - seat + 1 ;
		    String str=" AS";
		    if(seat==0 || seat == 1 || seat ==6 )
		            str =" WS";
		    else if(seat==2 || seat == 5)
		           str = " MS";
		    System.out.println(opposite+str) ;
		   } 

	}

}
