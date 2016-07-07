package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {

	public static void main(String[] args) throws IOException {
		//创建Socket对象
		//Socket(InetAddress,port)
		//Socket(String host,port)   此处找服务器ip和端口
		Socket s = new Socket("127.0.0.1",10086);
		
		//获取输出流，写数据
		OutputStream os = s.getOutputStream();
		os.write("你好".getBytes());
		
		//获取输入流
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String client = new String(bys,0,len);
		System.out.println("client:"+client);
		
		//释放资源
		s.close();
	}

}
