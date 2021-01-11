package stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadTest {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		// 스트림 초기화
		try {
			fr = new FileReader("gisa.txt");
			br = new BufferedReader(fr);
			// 파일 읽기
			while (true) {
				String msg = br.readLine();
				if (msg == null)
					break;
				System.out.println(msg);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null)br.close();
				//프로세스 스트림 종료 하면 노드도 같이 종료
//				System.out.println(fr.read());
				if(fr != null)fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
