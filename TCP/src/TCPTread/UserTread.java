package TCPTread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UserTread implements Runnable {
	private Socket s;

	UserTread(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {

		try {
			String timeName = System.currentTimeMillis() + ".txt";
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			// BufferedWriter bw = new BufferedWriter(new
			// FileWriter("D:\\copyDialog.txt", true));
			BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\copyDialog" + timeName));

			String line = null;
			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
				bw.flush();
			}

			BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			bwServer.write("上传成功");
			bwServer.newLine();
			bwServer.flush();

			s.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
