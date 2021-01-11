
public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person();
		
		p.init("홍길동", 20);
		p.printInfo();

		Person a = new Person();
		Person d = a;
		a.name = "김철수";
		a.age = 33;
		d.name = "홍철수";
		a.printInfo();
		d.printInfo();
		
		System.out.println(p);
		System.out.println(a);
		System.out.println(d);
	}

}






