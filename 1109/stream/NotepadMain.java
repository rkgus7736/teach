package stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NotepadMain {

	public static void main(String[] args) {
		FileWriter fw = null;
		PrintWriter pw = null;
		Scanner sc = new Scanner(System.in);

		// 파일명 입력
		System.out.print("파일명 입력하세요");
		String fileName = sc.nextLine();
		fileName += ".txt";
		try {
			// 스트림 생성 및 초기화
			fw = new FileWriter(fileName);
			pw = new PrintWriter(fw);
			// 내용 입력
			String msg = "";//빈문자열
			do {
				// 파일에 출력
				pw.println(msg);
				pw.flush();
				System.out.print("내용 입력>");
				msg = sc.nextLine();
			} while (!msg.equals("exit"));// exit인지 확인
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pw != null)pw.close();
				if(fw != null)fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//------------------------
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			while(true) {
				String str = br.readLine();
				if(str == null) break;
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null)br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}










