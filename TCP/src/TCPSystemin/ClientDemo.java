package TCPSystemin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientDemo {

	public static void main(String[] args) throws IOException {
		// ����Socket����
		// Socket(InetAddress,port)
		// Socket(String host,port) �˴��ҷ�����ip�Ͷ˿�
		Socket s = new Socket("127.0.0.1", 10086);

		// ����¼��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ��ȡ�������д����
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

		// �ͷ���Դ
		bw.close();
		// br.close();
		s.close();
	}

}
