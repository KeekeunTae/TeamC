
<<<<<<< HEAD
public class ExVariable_Control2 {
	public static void main(String[] args) {
		//if(조건식) {조건식 참일때 실행되는 부분}
		//else if(조건식2) {조건식 2가 참일때 실행되는 부분}
		//else if는 계속해서 연결할수가 있다. 조건식 100개면 한개의 if와 99개의 else if
		//else if뒤에도 else if를 만족하지 못했을때 else를 사용해서 마지막 처리를 하면 된다.
		//변수의 사용 범위 (지역변수) == 메소드 안에서 변수를 만들었을때. local variable
		//블럭킹==중괄호=={ }를 기준으로 어디에 있느냐에 따라서 사용 범위가 달라진다.
		int num1 = 0; // <- 이변수는 어디까지 사용할수 있을까?
		
		if(true) {
			int num2 =1;
			System.out.println("첫번째 if문");
			System.out.println(num2);
		}else if(false) {
			System.out.println("else if문");
		}else if(true) {
			System.out.println("두번째 else if문");
		}else {
			System.out.println("else문");
		}
		System.out.println(num1);
		//System.out.println(num2);//num2변수는 if문의 지역변수이기 때문에 if문의 블럭이 끝나는 순간 사용이 불가능 하다.
	}
}
