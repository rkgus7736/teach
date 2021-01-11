package obj;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	//문자열 계산 또는 일을 하면 자동으로 실행되는 메서드
	public String toString() {
		//return "Person [name=" + name + ", age=" + age + "]";
		return name +"|"+age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	//객체 내부 비교
//	public boolean equals(Object obj) {
//		//1. 메모리 주소가 같냐?
//		if(this == obj) return true;
//		//2. 받아온 obj가 현재 내 타입이랑 동일한지 체크
//		if(!(obj instanceof Person)) {
//			return false;
//		}
//		//3.내부 내용 비교
//		Person temp = (Person) obj;
//		if(age != temp.age) return false;
//		if(!name.equals(temp.name)) return false;
//		
//		return true;
//	}
	
	
	
}













