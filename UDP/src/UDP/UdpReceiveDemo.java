package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiveDemo {
	public static void main(String[] args) throws IOException {

		// 创建Socket对象
		DatagramSocket ds = new DatagramSocket(10086);

		// 创建数据包（接收容器）
		byte[] bys = new byte[2014];
		// int length = bys.length;
		DatagramPacket dp = new DatagramPacket(bys, bys.length);

		// 调用Socket对象方法接收数据
		ds.receive(dp);

		// 解析数据，并显示在控制台
		String ip = dp.getAddress().getHostAddress();
		// int len = dp.getLength();// 获取实际长度
		// byte[] bys2 = dp.getData();
		String s = new String(dp.getData(), 0, dp.getLength());
		// InetAddress ia = dp.getAddress();
		System.out.println("from" + ip + " data is :" + s);

		// 释放资源
		ds.close();
	}

}
