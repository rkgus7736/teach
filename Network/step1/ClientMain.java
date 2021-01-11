package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {

	public static void main(String[] args) {
		Socket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			//1. Server Connect
			server = new Socket("127.0.0.1",1234);
			//2. Stream Init
			pw = new PrintWriter(server.getOutputStream());
			br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			//3. I/O Process
			pw.println("Hello World");
			pw.flush();
			String msg = br.readLine();
			System.out.println(msg);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//4. close
				if(br!=null)br.close();
				if(pw!=null)pw.close();
				if(server!=null)server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
