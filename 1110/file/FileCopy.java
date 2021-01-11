package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("unnamed.jpg");
			FileOutputStream fos = new FileOutputStream("new.jpg");
			byte[] arr = new byte[10];
			int total = 0;
			while(true) { 
				int count = fis.read(arr);
				if(count == -1)break;
				total += count;
				System.out.println(total+"byte 만큼 복사");
				fos.write(arr, 0, count);
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






