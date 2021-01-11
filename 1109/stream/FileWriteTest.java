package stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteTest {

	public static void main(String[] args) {
		File file = new File("gisa.txt");
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			// 노드 스트림 생성 --> true 파일 이어서 쓰기
			fw = new FileWriter(file, true);
			// 프로세스 스트림 생성
			// 두번째 값은 auto flush 활성화
			pw = new PrintWriter(fw, true);
			pw.println("Hello World");
			pw.println(24 + 50);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pw != null)	pw.close();
				if (fw != null)fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
