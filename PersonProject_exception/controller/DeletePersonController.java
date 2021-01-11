package controller;
import java.util.Scanner;

import exception.PersonException;
import service.PersonManageSystem;

public class DeletePersonController extends Controller{
	@Override
	public void execute(Scanner sc) {
		System.out.print("삭제할 이름 입력 : ");
		String name = sc.nextLine();
		try {
			PersonManageSystem.getInstance().deletePerson(name);
		} catch (PersonException e) {
			System.out.println(e.getMessage());
		}		
	}
}






