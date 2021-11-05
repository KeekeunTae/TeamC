import java.util.ArrayList;

public class ExClass_method1 {
	public static void main(String[] args) {
		//Class는 객체다, String, int, double, array 등등 여러가지 데이터 타입을
		//하나의 객체로 묶어놓고 한번에 사용할때.
		//Class의 규칙
		//1. 첫글자가 대문자로 시작하는 경우
		//2. new라는 키워드를 통해서 인스턴스화 식이 있는 경우.
		//모든필드에 값을 할당하고 출력하시어
		//String str = new String();	
		System.out.println(ExDTO.sfield1);
		System.out.println(ExDTO.Sfield2);
		System.out.println(ExDTO.sfield3);
		System.out.println(ExDTO.sfield4);
		//static은 이미 메모리에 있기때문에
		//객체화( new ) 를 통해서 메모리를 더 낭비할 필요가 없다
		ExDTO dto = new ExDTO();
		System.out.println(dto.field1);
		System.out.println(dto.field2);
		System.out.println(dto.field3);
		dto.al = new ArrayList<>();
		dto.al.add("a");
		System.out.println(dto.al.get(0));
		
		
		
	}
}
