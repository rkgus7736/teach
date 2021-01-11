
public class StringEquals {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		//메모리 주소로 비교
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		//내부 내용으로 비교
		System.out.println(str1.equals(str3));
		
	}

}
