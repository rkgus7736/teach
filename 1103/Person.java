package inheritance;

public class Person extends Animal {

	public Person() {
		System.out.println("Person Constructor");
	}

	public Person(int age) {
		super(age);//부모 생성자 호출 부분, super 부모 클래스를 지칭
	}
	
	public void setAge(int age) {
		//자식이더라도 부모의 private 멤버에는 접근할 수 없다.
		this.age = age;
	}
	
	//오버라이딩 - 부모가 준 메서드를 다시 재구현
	//           메서드 형태가 부모와 동일
	public void printAnimalInfo() {
		System.out.println("이 사람의 나이 : "+age);
	}
}








