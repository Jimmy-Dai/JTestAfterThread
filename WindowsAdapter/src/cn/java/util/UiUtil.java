package cn.java.util;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

public class UiUtil {
	private UiUtil() {
	}
	static Toolkit tk = Toolkit.getDefaultToolkit();
	public static void setFrameImage(Frame f){
		Image i = tk.getImage("src\\cn\\java\\image\\9.png");
		f.setIconImage(i);
	}
	public static void setFrameCenter(Frame f){
		Dimension d = tk.getScreenSize();
		double screenWidth = d.getWidth();
		double screenHeight = d.getHeight();
		int frameWidth = f.getWidth();
		int frameHeight = f.getHeight();
		
		int pointWidth = (int)(screenWidth-frameWidth)/2;
		int pointHeight = (int)(screenHeight-frameHeight)/2;
		
		f.setLocation(pointWidth, pointHeight);
	}
}
