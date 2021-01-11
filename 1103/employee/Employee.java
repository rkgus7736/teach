package employee;

public class Employee {
	private int eno;
	private String name;
	protected int salary;

	public Employee(int eno, String name, int salary) {
		this.eno = eno;
		this.name = name;
		this.salary = salary;
	}
	
	public void printInfo() {
		System.out.println("사원번호 : "+eno);
		System.out.println("이름 : "+name);
		System.out.println("급여 : "+salary);
		System.out.println("상여금 : "+calcBonus());
	}
	
	public int calcBonus() {
		return (int)(salary * 0.3);
	}
}



