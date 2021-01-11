
public class Person {
	private String name;
	private int age;
	
	public Person() {
		System.out.println("Person Constructor");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//set 메서드가 하는 일
	//외부에서 받아온 데이터를 저장
	//올바른 데이터인지 체크하고 저장이 가능
	public void setAge(int a) {
		if(a>0)
			age = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	public void printInfo() {
		System.out.println(name + " : " + age);
	}
}









