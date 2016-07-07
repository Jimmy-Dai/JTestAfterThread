package TCPByte;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class UploadClient {

	public static void main(String[] args) throws IOException {
		Socket s = new Socket("127.0.0.1",10086);
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("title9.png"));
		BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
		
		byte[] bys = new byte[1024];
		int len = 0 ;
		while((len=bis.read(bys))!=-1){
			bos.write(bys,0,len);
			bos.flush();
		}
		
		s.shutdownOutput();
		
		InputStream is = s.getInputStream();
		byte[] bys2 = new byte[1024];
		int len2 = is.read(bys2);
		System.out.println(new String(bys2,0,len2));
		
		s.close();
		bis.close();

	}

}
