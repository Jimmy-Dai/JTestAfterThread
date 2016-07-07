package TCPTread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss =new ServerSocket(10086);
		
//		Socket s = ss.accept();
//		
//		UserTread ut = new UserTread(s);
//		
//		Thread th = new Thread(ut);
//		
//		th.start();
		
		while(true){
			Socket s = ss.accept();
			new Thread(new UserTread(s)).start();
		}
		
	}
}
