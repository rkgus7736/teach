
public class Person {
	String name;
	int age;
	
	public void printInfo() {
		System.out.println(name + " " + age);
	}
	
	//초기화 
	public void init(String n, int a) {
		name = n;
		age = a;
	}
}
