package Util;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.Frame;

public class UiUtil {

    private UiUtil() {
    }

    public static void setFrameCenter(Frame f) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        double screenWidth = d.getWidth();
        double screenHeight = d.getHeight();
        int frameWidth = f.getWidth();
        int frameHeight = f.getHeight();

        int pointWidth = (int) (screenWidth - frameWidth) / 2;
        int pointHeight = (int) (screenHeight - frameHeight) / 2;

        f.setLocation(pointWidth, pointHeight);
    }
}
