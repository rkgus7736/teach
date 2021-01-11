package inheritance;

public class Animal {
	//Animal을 상속 받은 클래스는 접근할 수 있다.
	protected int age;
	
	public Animal() {
		System.out.println("Animal Constructor");
	}

	public Animal(int age) {
		this.age = age;
		System.out.println("Animal(int age) Constructor");
	}
	
	public void printAnimalInfo() {
		System.out.println("이 동물의 나이 : "+age);
	}
}











