package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpSendDemo {
	public static void main(String[] args) throws IOException {
		// ����socket����
		DatagramSocket ds = new DatagramSocket();
		// �������ݣ������
		// DatagramPacket(byte[] bys,int length,InetAddress address,int port)
		byte[] bys = "WANTED U".getBytes();
		int length = bys.length;
		InetAddress ia = InetAddress.getByName("127.0.0.1");
		int port = 10086;
		DatagramPacket dp = new DatagramPacket(bys, length, ia, port);
		// ����socket�����ͷ���
		ds.send(dp);
		// �ͷ���Դ
		ds.close();
	}
}
