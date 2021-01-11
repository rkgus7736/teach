package string;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		String str = "Hello\tWorld\tABCD\t123456";
		System.out.println(str);
		//문자열 개수
		System.out.println(str.length());
		//문자열 바꾸기
		System.out.println(str.replace("BC", "TEST"));
		//trim - 좌우 공백 지우기
		str = "         Hello\tWorld\tABCD\t123456        ";
		System.out.println(str.trim());
		System.out.println(str.trim().length());
		str = str.trim();
		//문자열 쪼개기
		String[] arr = str.split("\t");
		System.out.println(Arrays.toString(arr));
		String result = String.join("-", arr);
		System.out.println(result);
	}

}



