package collection;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashCode : " +name );
		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals : "+name);
		Person p = (Person) obj;
		if(p.name.equals(name) && p.age == age)	return true;
		return false;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}






