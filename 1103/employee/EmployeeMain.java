package employee;

import java.util.Scanner;

public class EmployeeMain {
	public static Scanner sc = new Scanner(System.in);
	public static Employee createEmployee(int no) {
		Employee employee = null;
		System.out.print("사번 : ");
		int sno = sc.nextInt(); sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("급여 : ");
		int salary = sc.nextInt(); sc.nextLine();
		switch(no) {
		case 1:
			employee = new Employee(sno, name, salary);
			break;
		case 2:
			System.out.print("영업포인트 : ");
			int incentive = sc.nextInt();sc.nextLine();
			employee = new SalaryEmployee(sno, name, salary, incentive);
			break;
		case 3:
			System.out.print("초과근무시간 : ");
			int overTime = sc.nextInt();sc.nextLine();
			employee = new OfficeEmployee(sno, name, salary, overTime);
			break;
		}
		
		return employee;
	}
	public static void main(String[] args) {
		
		Employee[] arr = new Employee[10];
		int index = 0;
		
		while(true) {
			System.out.println("1. 일반사원 생성");
			System.out.println("2. 영업직사원 생성");
			System.out.println("3. 사무직사원 생성");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 번호를 입력하세요 : ");
			int no = sc.nextInt(); sc.nextLine();
			if(no == 0) break;
			Employee employee = createEmployee(no);
			if(employee != null)
				arr[index++]=employee;
			
		}
		for(int i=0;i<index;i++)
			arr[i].printInfo();
	}
}






