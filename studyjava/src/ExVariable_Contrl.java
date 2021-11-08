import java.util.Scanner;

public class ExVariable_Contrl {

	public static void main(String[] args) {
		// 변수--데이터를 담기위한 그릇
		// 변수의 이름을 가지고 접근
		// 변수의타입 변수의이름; 
		int number ; //초기화되지 않은 변수는 사용불가
		number = 19;
		System.out.println("number");
		
		//★ 캐스팅..
		String str = "10";
		int num = Integer.parseInt(str);//
		char chr = '1';
		num = Integer.parseInt(chr+"" );
		str = num+"";
		
		//제어문 : 프로그램을 올바른 방향으로 제어하기 위한 문법
		//if문
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		if(input.equals("A") ) {
			System.out.println("a와 같다면 a입니다");
		}else {
			System.out.println("a가 아닙니다");
		}
		
		
		
		
		
	}

}
