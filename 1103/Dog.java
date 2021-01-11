package inheritance;

public class Dog extends Animal {
	private String kind;

	//개의 품종과 나이를 받는 생성자
	public Dog(int age, String kind) {
		super(age);
		this.kind = kind;
	}

	@Override
	public void printAnimalInfo() {
		super.printAnimalInfo();
	}
	
	//printAnimalInfo --> 오버라이딩(재구현)
	// 이 개의 품종은 kind, 나이는 ?? 입니다.  ---> 출력
	
	
	
}
