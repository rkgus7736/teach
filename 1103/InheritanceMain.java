package inheritance;

public class InheritanceMain {
	//생성과정에서는 부모 클래스가 먼저 생성, 그 후 자식 클래스가 생성
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println("-------------");
		Dog d = new Dog(20,"품종");
		System.out.println("-------------");
		Person p1 = new Person(20);
		p1.printAnimalInfo();
		System.out.println("-------------");
	}

}
