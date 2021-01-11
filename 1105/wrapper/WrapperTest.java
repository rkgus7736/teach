package wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		int num = 10;//기본형
		Integer n1 = 20;//Wrapper Class
		System.out.println(num + n1);
		
		//auto boxing 기본형 -> Wrapper 
		Integer n2 = num;
		
		//auto unboxing Wrapper -> 기본형 
		int n3 = n2;
		
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		
		//1.5 이전 버전
		int n4 = 10;
		Object obj = (Object) n4;
		Integer n5 = (Integer) obj;
		
		obj = n5;
		int n6 = (int)obj;
		
	}

}











