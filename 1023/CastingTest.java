
public class CastingTest {

	public static void main(String[] args) {
		int n = 100;
		float f = 3.1415f;
		double d = 3.9415;
		//형변환 : 데이터 타입을 변경
		//자동형변환 : 작은 개념(메모리 크기도 포함)이 큰 개념으로 바뀜
		System.out.println(n + f);
		System.out.println(f+d);
		System.out.println(f==d);
		//강제로 형변환
		int num = (int)d;
		System.out.println(num);
	}

}




