
public class ExVariable_Contrl3 {

	public static void main(String[] args) {
		
		for(int i = 0; i <10; i++) {
			
			System.out.println(1+ " * "+ (i+1)+ " = " + ((i+1)*1));
		}
		
		for(int i = 1; i<10; i++) {
			for( int j= 2; j<10; j++) {
				System.out.println( i+" * "+j+" = "+ (i*j));
			}
			
		}
		boolean iswhile =true;
		while(iswhile) {
			System.out.println("dd");
			iswhile = false;
		}
		
		/*int i = 0;
		while(i<10) {
			System.out.println(1+ " * "+ (i+1)+ " = " + ((i+1)*1));
		}*/
		System.out.println("=== while 문===");
		int j = 2;
		while(j<9) {
			int j2 =1;
			while(j2<9) {
				System.out.println( j+" * "+j2+" = "+ (j*j2));
				j2++;
			}
			j++;
		}
	}
}
