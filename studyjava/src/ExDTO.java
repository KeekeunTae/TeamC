import java.util.ArrayList;

public class ExDTO {
	//ExDTO의 맴버
	//멤버 영역 ( 인스턴스 멤버 (동적) , 스테틱 멤버 (정적) )
	//필드 부분 ( static이 붙어있는지 유무에 따라서 멤버를 따로 구분할 수가 있다. )
	//1. 객체가 가지는 속성을 의미함( 기능 x , 어떤 값을 담을 수 있는 그릇 )
	//2. 대부분 알고있는 데이터 타입 모든것들은 필드 부분에 올 수 있다.
	//3. 필드들에 별도에 접근 제한자를 두지 않는 이상은 바로 접근이 가능하다.
	int field1 = 1;
	String field2 = "1";
	double field3 = 1.0;
	//ExVariavle_Control ec;
	ArrayList<String> al;
	static int sfield1 = 1;
	static String Sfield2 = "1";
	static double sfield3 = 1.2;
	static ArrayList<Integer> sfield4;
	
}
