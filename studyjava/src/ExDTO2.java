import java.util.ArrayList;

public class ExDTO2 {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
=======
>>>>>>> 443ce8191cd59b9764c31a2afdaf61cced0ac35d
	//1.class 의 블럭킹 안에 있는지
	//2.ExDTO의 멤버다
	//3. 인스턴스 멤버, 스태틱 멤버
	//4. 메소드인 경우 void이냐 void가 아니냐
	//5. new를 통해 인스턴스화를 하면
	//인스턴스화 한 객체에 쩜. 을찍으면 모든멤버가 보인다
	
	void voidMethod() {
		//void라는건 리턴타입이 없는
		System.out.println("voidMethod");
	}
	//인자값을 입력받는 형태의 매소드
	void voidMethod2 (String a) {
		System.out.println(a);
	}
	void voidMethod3(String b, ArrayList<String> blist) {
		System.out.println(b);
		System.out.println(blist);
	}
	
	//void 가 아닌 메소드는 전부 return이 있음
	//return 이라는 키워드가 반드시 들어가고
	//키워드 뒤에는 int에 담을  수 있는 값이 있어야한다
	int rtnMethod1() {
		//return ""; ==x int 만 리턴가능
		return 40;
	}
	//메소드 오버로딩
	//같은 이름의 메소드에 매개변수 타입이나 
	//갯수를 달리 해서 사용하는것
	int rtnMethod1(int a, int b) {
		int i = 0;
		i = a+b;
		return i;
	}
	
	
	
	
	
}//ExDTO2 블럭킹
<<<<<<< HEAD
=======
	//1.class의 블럭킹 안에 있는지.
		//2.ExDTO2의 멤버다.
		//3.인스턴스 멤버 , 스태틱 멤버
		//4.메소드의 경우 void이냐 void가 아니냐.
		//5.new를 통해 인스턴스화를 하면
		//인스턴스화 한 객체에 쩜.을 찍으면 모든 멤버가 보인다.
		void voidMethod() {
			//void라는 건 리턴타입이 없는.
			System.out.println("voidMethod");
		}
		//인자값을 입력받는 형태의 메소드
		void voidMethod2(String a) {
			System.out.println(a);
		}
		void voidMethod3(String b 
				, ArrayList<String> blist) {
			System.out.println("voidMethod3");
		}
		//void가 아닌 메소드 전부는 return이 있음.
		//return이라는 키워드가 반드시 들어가고
		//키워드 뒤에는 int에 담을수있는 값이 있어야한다.
		int rtnMethod1() {
			
			return 40;
		}
		//메소드 오버로딩
		//같은 이름의 메소드에 매개변수 타입이나
		//갯수를 달리해서 사용하는 것
		int rtnMethod1(int a, int b) {
			
			return(a+b);
		}
}
>>>>>>> origin/kwk
=======
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
>>>>>>> 1ffaaa86f7a196a2870f89bec9af2d588463f529
=======
>>>>>>> origin/jhi
>>>>>>> 443ce8191cd59b9764c31a2afdaf61cced0ac35d
