import java.util.ArrayList;

public class ExClass_method2 {
	public static void main(String[] args) {
		//1. voidMethod 호출하기
		//2. 10번 호출하기
		ExDTO2 dto = new ExDTO2();
		dto.voidMethod();
		for(int i = 0; i < 10; i++) {
			dto.voidMethod();
		}
		String a = "avcdr"; 
		dto.voidMethod2(a);
		dto.voidMethod3("dddd", null);
		//인자값에 값을 할당하는 초기화식
		//ArrayList<String> blist = a;
		System.out.println("-----------------리턴타입이 있는-----------------");
		//1. 40을 출력하시오(rtn메소드 1을 호출해서)
		//2. 그리고 그값에 10을 더한 값 출력
		System.out.println(dto.rtnMethod1());
		System.out.println(dto.rtnMethod1()+10);
		//return이 없는 void메소드 이기때문에 출력이 안됨
		//메소드 실행결과도 받을수없다
		
		//rtnMethod1을 오버로딩시켜서
		//파라메터 int 값 두개를 넘겼을때 두수의 합을 구하는
		//메소드를 완성하고 호출하기
		//리턴타입이 있는 메소드는 해당하는 타입의 변수와 같다
		System.out.println(dto.rtnMethod1(1, 2));
		System.out.println(dto.rtnMethod1(1, 2)+20);
		
	}
}
