import java.util.ArrayList;

public class ExClass_Method1 {
	public static void main(String[] args) {
		//class의 규칙
		//1. 첫 글자가 대문자로 시작하는 경우
		//2. new라는 키워드를 통해서 인스턴트화 식이 있는 경우.
		
		String str = new String();
		
		ExDTO dto = new ExDTO();
		dto.field1 = 1;
		dto.field2 = "str";
		dto.field3 = 1.5;
		dto.field4 = new ArrayList<>();//list를 사용할수있게 초기화
		//null.add != ArrayList.add
		dto.field4.add("a");
		dto.field4.add("b");
		System.out.println(dto.field1);
		System.out.println(dto.field2);
		System.out.println(dto.field3);
		System.out.println(dto.field4.get(0));
		System.out.println(dto.field4.get(1));
		
		
		ExDTO.sfield1=32;
		ExDTO.sfield2="win";
		ExDTO.sfield3=5;
		ExDTO.sfeild4 = new ArrayList<>();
		ExDTO.sfeild4.add(0);
		System.out.println(dto.sfield1);
		System.out.println(dto.sfield2);
		System.out.println(dto.sfield3);
		//static은 이미 메모리에 있기때문에
		//객체화 (new) 를 통해서 메모리를 더 낭비할 필요가 없다.
		
	}
}
