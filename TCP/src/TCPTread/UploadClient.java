package TCPTread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UploadClient {

	public static void main(String[] args) throws IOException {
		Socket s = new Socket("127.0.0.1", 10086);
		
		BufferedReader br = new BufferedReader(new FileReader("dialog.txt"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		String line = null;
		while ((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		s.shutdownOutput();
		
		BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
		System.out.println(brClient.readLine());
		
		s.close();
		br.close();
	}

}
