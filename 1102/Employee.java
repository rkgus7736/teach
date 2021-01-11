
public class Employee {
	/*
	 * 사번 : 정수
	 * 이름 : 문자열
	 * 부서 : 문자열
	 * 연봉 : 정수
	 * 
	 * 생성자(사번, 이름, 부서, 연봉)
	 * 사원정보 출력
	 */
	private int no;
	private String name;
	private String depart;
	private int salary;
	
	public Employee(int no, String name, String depart, int salary) {
		super();
		this.no = no;
		this.name = name;
		this.depart = depart;
		this.salary = salary;
	}
	
	public void printInfo()	{
		System.out.println("사번 " + no);
		System.out.println("이름 " + name);
		System.out.println("부서 " + depart);
		System.out.println("연봉 " + salary);
	}
	
}








