import java.util.ArrayList;

public class ExDTO2 {
	//1. Class의 블럭킹 안에 있는지확인
	//2. ExDTO2의 멤버다
	//3. 인스턴스멤버, 스태틱멤버
	//4. 메소드의 경우 void이냐 void가 아니냐
	void voidMethod () {
		//void라는건 리턴 타입이 없는.
		System.out.println("voidMethod");
	}
	//인자값을 입력받는 형태의 메소드
	void voidMethod2 (String a) {
		
		System.out.println(a);
	}
	
	void voidMethod3 (String b, ArrayList<String> blist) {
		System.out.println("voidMethod3");
	}
	//=====================///
	//void가 아닌 메소드 전부는 return이있음.
	//return이라는 키워드가 반드시 들어가고
	//키워드 뒤에는 int에담ㅇ들수 있는 값이 있어야한다.
	int rtnMethod1 () {
		return 40;
	}
	int rtnMethod1 (int a, int b) {
		return a + b;
	}
	
}
