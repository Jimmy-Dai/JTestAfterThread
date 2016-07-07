package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// ����Socket����
		// ServerSocket(port)
		ServerSocket ss = new ServerSocket(10086);

		// �����ͻ��ˣ�����һ����Ӧ��Socket����
		Socket s = ss.accept();//����ʽ

		// ��ȡ����������ʾ
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int length = is.read(bys);//����ʽ
		String str = new String(bys, 0, length);
		
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+":"+str);
		
		//��ȡ�����
		OutputStream os = s.getOutputStream();
		os.write("���������յ�".getBytes());

		// �ͷ���Դ
		// ss.close(); ���������ر�
		s.close();
	}
}
