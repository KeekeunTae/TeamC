

public class ExVariable_Control2 {
	public static void main(String[] args) {
		//if(조건식) { 조건식 참일때 실행되는 부분 }
		//else if (조건식 2) { 조건식 2가 참일때 실행되는 부분 }
		//else if 뒤에도 모든 else if 를 만족하지 못했을때 else를 사용해서 마지막 처리를 하면된다
		//변수의 사용범위 (지역 변수) == 메소드 안에서 변수를 만들었을때. local variable
		//블럭킹 == 중괄호 == { } 를 기준으로 어디에 있느냐에 따라서 사용 범위가 달라진다
		int num1 = 0; // <- 이 변수는 어디까지 사용할수 있을까?   // 메인메소드 안에서
		if(true) {
			int num2 = 1; // <-이 변수는 어디까지 사용할수 있을까? // 첫번째 if문 블럭 안
			System.out.println(" 첫번째 if문 ");
			System.out.println(num2 + " num2 는 첫번째 if문 블럭 안에서 사용 가능하다. ");
		}else if (true) {
			System.out.println(" else if문 ");
		}else if (true) {
			System.out.println(" 두번째 else if문 ");
		} else {
			System.out.println("else문");
		}
		
		System.out.println(num1 + " num1 은 메인메소드 블럭안에서 전체 사용가능하다.");
		
	}
}
