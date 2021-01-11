package stream;

import java.io.File;

public class FileList {

	public static void main(String[] args) {
		File file = new File("c:\\");
		File[] list = file.listFiles();
		for(File f : list) {
			String str = f.getName() + "\t";
			if(f.isDirectory())
				str += "<DIR>";
			else
				str += f.length()+"byte";
			System.out.println(str);
		}
	}

}










