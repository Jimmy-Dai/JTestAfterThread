package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpSendDemo {
	public static void main(String[] args) throws IOException {
		// 创建socket对象
		DatagramSocket ds = new DatagramSocket();
		// 创建数据，并打包
		// DatagramPacket(byte[] bys,int length,InetAddress address,int port)
		byte[] bys = "WANTED U".getBytes();
		int length = bys.length;
		InetAddress ia = InetAddress.getByName("127.0.0.1");
		int port = 10086;
		DatagramPacket dp = new DatagramPacket(bys, length, ia, port);
		// 调用socket对象发送方法
		ds.send(dp);
		// 释放资源
		ds.close();
	}
}
