package TCPByte;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(10086);

		Socket s = ss.accept();

		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\copy9.png"));
		BufferedInputStream bis = new BufferedInputStream(s.getInputStream());

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
			bos.flush();
		}

		OutputStream os = s.getOutputStream();
		os.write("上传成功".getBytes());

		s.close();
		bos.close();
	}

}
