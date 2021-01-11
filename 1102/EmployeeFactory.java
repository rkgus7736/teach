//싱글턴 패턴을 적용
public class EmployeeFactory {
	//static 객체
	private static EmployeeFactory instance = new EmployeeFactory();
	private int empNo;
	//private 생성자
	private EmployeeFactory() {	
		empNo = 1000;
	}

	//get : static으로 된 객체를 리턴
	public static EmployeeFactory getInstance() {
		if(instance == null)
			instance = new EmployeeFactory();
		return instance;
	}
	//creatEmployee : Employee 객체를 생성 후 리턴
	//				  외부에서 이름, 부서, 연봉, 사번은 자동으로 생성
	public Employee createEmployee(String name, String depart, int salary) {
		Employee employee = new Employee(empNo, name, depart, salary);
		empNo++;
		return employee;
	}
}













