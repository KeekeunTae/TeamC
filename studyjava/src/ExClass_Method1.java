import java.util.ArrayList;

public class ExClass_Method1 {
	public static void main(String[] args) {
<<<<<<< HEAD
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
=======
		//Class 객체다. String int double array 등등 여러가지 데이터 타입을
		//하나의 객체로 묶어놓고 한번에 사용할때.
		//Class의 규칙 
		//1. 첫글자가 대문자로 시작하는 경우
		//2. new라는 키워드를 통해서 인스턴스화 식이 있는경우
		String str = new String(); 
		ExDTO dto = new ExDTO();
		
		dto.field1 = 10;
		dto.field2 = "dd";
		dto.field3 = 3.14;
		dto.feild4 = new ArrayList<>(); // list를 사용할 수 있게 초기화
		dto.feild4.add("a");
		dto.feild4.add("b");
		System.out.println(dto.field1);
		System.out.println(dto.field2);
		System.out.println(dto.field3);
		System.out.println(dto.feild4.get(0));
		System.out.println(dto.feild4.get(1));
		
		ExDTO.sfield1 = 1;
		ExDTO.sfield2 = "ddd";
		ExDTO.sfield3 = 3.14;
		
		ExDTO.sfeild4 = new ArrayList<>(); 
		ExDTO.sfeild4.add(2);
		ExDTO.sfeild4.add(3);
		System.out.println(ExDTO.sfield1);
		System.out.println(ExDTO.sfield2);
		System.out.println(ExDTO.sfield3);
		System.out.println(ExDTO.sfeild4.get(0));
		System.out.println(ExDTO.sfeild4.get(1));
		
		
		
>>>>>>> 1ffaaa86f7a196a2870f89bec9af2d588463f529
		
	}
}
