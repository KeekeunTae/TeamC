
public class ExVariavle_Control2 {
	public static void main(String[] args) {
		//if (조건식) {조건식 참일때 실행되는 부분}
		//else(조건식2){ 조건식 2가 참일때 실행되는부분}
		//else if 는 계속해서 연결할 수 있다. 조건이 100개면 한개의 if와 99개의 else if
		//else if 뒤에도 모든 else if를 만족하지 못했을때 else를 사용해서 마지막 처리를 하면된다
		//변수의 사용 범위 (지역변수) == 메소드 안에서 변수를 만들었을때. local variable
		//블럭킹 == 중괄호 == {} 를 기준으로 어디에 있느냐에 따라서 사용범위가 달라진다
		int num1 = 0;			//<- 이 변수는 어디까지 사용할수 있을까?			////메인메소드블럭킹이 끝날때까지
		System.out.println(num1);		
		if(true) {
			int num2 = 1;// 이변수는 어디까지 사용할수 있을까    ///이프문의 블럭킹이 끝날때 까지 
			System.out.println(num2);
			System.out.println("첫번째 이프문");
		}else if(true) {
			System.out.println("else if 문");
		}else if (true) {
			System.out.println(" 두번째 else if 문");
		}else {
			System.out.println(" else문");
		}
		//반복문, Ref 참조타입, Class, Method
		
		
	}

}
