package file;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileReview {

	public static void main(String[] args) {
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			//노드 스트림 연결
			fw = new FileWriter("test.txt");
			//프로세스 스트림 연결
			pw = new PrintWriter(fw);
			
			//입출력 처리
			pw.println("Hello World");
			pw.println(20);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//close 처리
			pw.close();
		}
		
	}

}





