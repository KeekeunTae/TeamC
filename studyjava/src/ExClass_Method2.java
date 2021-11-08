import java.util.ArrayList;

public class ExClass_Method2 {
	public static void main(String[] args) {
		ExDTO2 dto = new ExDTO2();
		dto.voidMethod();
		
		for (int i = 0; i < 10; i++) {
			dto.voidMethod();
		}		
		dto.voidMethod2("dd");
		dto.voidMethod3("", null);
		System.out.println("=========return 타입 없는거 =============");
		
		//40을 출력 rtnMethod1을 호출
		
		System.out.println(dto.rtnMethod1());
		System.out.println(dto.rtnMethod1() + 10);
		
		
		System.out.println(dto.rtnMethod1(2, 3));
		System.out.println(dto.rtnMethod1(2, 3)+10);
		
	}
}
