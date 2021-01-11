package employee;

public class SalaryEmployee extends Employee{
	private int incenPoint;

	public SalaryEmployee(int eno, String name, int salary, int incenPoint) {
		super(eno, name, salary);
		this.incenPoint = incenPoint;
	}
	
	public int calcInecentive() {
		return (int)(incenPoint * 0.2);
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("인센티브 : "+calcInecentive());
	}
}









