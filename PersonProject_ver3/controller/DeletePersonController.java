package controller;
import java.util.Scanner;

import service.PersonManageSystem;

public class DeletePersonController extends Controller{
	@Override
	public void execute(Scanner sc) {
		System.out.print("삭제할 이름 입력 : ");
		String name = sc.nextLine();
		PersonManageSystem.getInstance().deletePerson(name);		
	}
}
