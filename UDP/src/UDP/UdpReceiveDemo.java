package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiveDemo {
	public static void main(String[] args) throws IOException {

		// ����Socket����
		DatagramSocket ds = new DatagramSocket(10086);

		// �������ݰ�������������
		byte[] bys = new byte[2014];
		// int length = bys.length;
		DatagramPacket dp = new DatagramPacket(bys, bys.length);

		// ����Socket���󷽷���������
		ds.receive(dp);

		// �������ݣ�����ʾ�ڿ���̨
		String ip = dp.getAddress().getHostAddress();
		// int len = dp.getLength();// ��ȡʵ�ʳ���
		// byte[] bys2 = dp.getData();
		String s = new String(dp.getData(), 0, dp.getLength());
		// InetAddress ia = dp.getAddress();
		System.out.println("from" + ip + " data is :" + s);

		// �ͷ���Դ
		ds.close();
	}

}
