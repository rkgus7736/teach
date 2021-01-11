package stream;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("c:\\20201109\\test.txt");
		//해당 경로가 있냐?
		System.out.println(file.exists());
		System.out.println(file.getParent());
		File pDir = file.getParentFile();
		System.out.println(pDir);
		if(!pDir.exists())
			pDir.mkdirs();//해당 경로까지 폴더를 전부 생성
		//해당 파일이 없으면, 파일 생성
		if(!file.exists()) {
			//파일 생성
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("파일 크기 : "  + file.length() + "byte");
		System.out.println("해당 경로는 폴더? " + file.isDirectory());
		System.out.println("해당 경로는 파일? " + file.isFile());
		System.out.println(file.getPath());//현재 파일 경로 -> 초기화 값
		System.out.println(file.getAbsolutePath());//절대 경로
		file.renameTo(new File("c:\\20201109\\t.txt"));
		file.delete();//파일 삭제
	}

}







