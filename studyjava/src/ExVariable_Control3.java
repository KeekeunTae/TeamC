

public class ExVariable_Control3 {
	public static void main(String[] args) {
		//반복문 - 제어문의 종류중에 어떠한것을 반복하기 위한문장
		//사용을 하는 목적 ( 어떤 동작을 계속해서 개발자가 원하는 횟수만큼 반복을 하고싶을때.)
		//for ( 반복문에서 사용할변수 초기화; 변수를 이용한 조건식; 증감식 ; ) { 
		//  		반복이 되는 구간 (조건식이 true일때 ) false일때는 반복문 빠져나감
		// }
		for (int i = 0; i < 10 ; i++) {
			System.out.println(1 + " * " + (i+1) + " = " + ((i+1)*1));
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
		//==============================//
		//while 정해진 횟수를 잘 모를때 조건을 두고 사용
		boolean isWhile = true;
		while (isWhile) {
			System.out.println("dd");
			isWhile = false;
		}
		int i = 2;
		
		while(i < 10) {
			System.out.println(i + " * " + i + " = " + i);			
			int j = 1;
			while(j < 10) {			
				System.out.println(i + " * " + j + " = " + (i*j));
				j++;			
			}	
			i++;
		}
		
		
		
		
		
		
		
		
		
	}
}
