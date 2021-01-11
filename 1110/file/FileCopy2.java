package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명 입력 > ");
		String fileName = sc.nextLine();
		File file = new File("c:\\1110\\img\\"+fileName+".jpg");
		//파일 경로 확인
		if(!file.getParentFile().exists())
			file.getParentFile().mkdirs();
		//파일 복사
		try {
			FileInputStream fis = new FileInputStream("unnamed.jpg");
			FileOutputStream fos = new FileOutputStream(file);
			byte[] arr = new byte[1024];
			while(true) {
				int count = fis.read(arr);
				if(count == -1) break;
				fos.write(arr,0,count);
			}
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}







