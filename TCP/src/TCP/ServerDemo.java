package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// 创建Socket对象
		// ServerSocket(port)
		ServerSocket ss = new ServerSocket(10086);

		// 监听客户端，返回一个对应的Socket对象
		Socket s = ss.accept();//阻塞式

		// 获取输入流，显示
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int length = is.read(bys);//阻塞式
		String str = new String(bys, 0, length);
		
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+":"+str);
		
		//获取输出流
		OutputStream os = s.getOutputStream();
		os.write("服务器已收到".getBytes());

		// 释放资源
		// ss.close(); 服务器不关闭
		s.close();
	}
}
