package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {

	public static void main(String[] args) throws IOException {
		//����Socket����
		//Socket(InetAddress,port)
		//Socket(String host,port)   �˴��ҷ�����ip�Ͷ˿�
		Socket s = new Socket("127.0.0.1",10086);
		
		//��ȡ�������д����
		OutputStream os = s.getOutputStream();
		os.write("���".getBytes());
		
		//��ȡ������
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String client = new String(bys,0,len);
		System.out.println("client:"+client);
		
		//�ͷ���Դ
		s.close();
	}

}
