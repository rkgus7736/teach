package employee;

public class OfficeEmployee extends Employee {
	private int overTime;

	public OfficeEmployee(int eno, String name, int salary, int overTime) {
		super(eno, name, salary);
		this.overTime = overTime;
	}
	//초과근무수당 - int, 초과근무시간 * (급여/20*1.5)
	public int calcOvertimePay() {
		return (int)(overTime * (salary/20*1.5));
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("초과근무 수당 : "+calcOvertimePay());
	}
	
	
}




