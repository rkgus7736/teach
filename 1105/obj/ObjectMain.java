package obj;

public class ObjectMain {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 30);
		Person p2 = new Person("홍길동", 30);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p2+" "+p1);//각각의 toString 호출
		
//		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
	}

}





