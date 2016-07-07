package TCPSystemin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientDemo {

	public static void main(String[] args) throws IOException {
		// 创建Socket对象
		// Socket(InetAddress,port)
		// Socket(String host,port) 此处找服务器ip和端口
		Socket s = new Socket("127.0.0.1", 10086);

		// 键盘录入
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 获取输出流，写数据
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

		String line = null;
		while ((line = br.readLine()) != null) {
			if ("886".equals(line)) {
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		// 释放资源
		bw.close();
		// br.close();
		s.close();
	}

}
