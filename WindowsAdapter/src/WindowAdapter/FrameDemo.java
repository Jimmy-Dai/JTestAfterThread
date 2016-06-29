package WindowAdapter;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import cn.java.util.UiUtil;

public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame("������ϰ");
		UiUtil.setFrameImage(f);
		String sFrame = f.getTitle();
		f.setBounds(400, 200, 400, 300);
		UiUtil.setFrameCenter(f);
		f.setLayout(new FlowLayout());

		MenuBar mb = new MenuBar();
		Menu m1 = new Menu("�ļ�");
		Menu m2 = new Menu("������");
		Menu m3 = new Menu("�����޸�");
		MenuItem mi1 = new MenuItem("�˳�ϵͳ");
		MenuItem mi2 = new MenuItem("������");
		MenuItem mi3 = new MenuItem("���±�");
		MenuItem mi4 = new MenuItem("���ⱬ��");
		MenuItem mi5 = new MenuItem("�ָ�����");
		
		//f.add(mb);Ψ������Ƚ�����
		f.setMenuBar(mb);
		mb.add(m1);
		mb.add(m3);
		m1.add(m2);
		m1.add(mi1);
		m2.add(mi2);
		m2.add(mi3);
		m3.add(mi4);
		m3.add(mi5);
		
		mi1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mi2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Runtime rt1 = Runtime.getRuntime();
				try {
					rt1.exec("calc");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		mi3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Runtime rt1 = Runtime.getRuntime();
				try {
					rt1.exec("notepad");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		mi4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f.setTitle(mi4.getLabel());
			}
		});
		mi5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f.setTitle(sFrame);
			}
		});
		
		// ע�Ⲽ�ַ���
		// b1.setSize(10, 10);
		TextField tf = new TextField(20);
		Button b1 = new Button("�ı�ת��");
		TextArea ta = new TextArea(10, 40);
		Button b2 = new Button("���");
		f.add(tf);
		f.add(b1);
		f.add(ta);
		f.add(b2);
		Label lb1=new Label("������ϰ��ֻ���������֣�");
		f.add(lb1);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char ch = e.getKeyChar();
				if(!(ch>='0'&&ch<='9')){
					e.consume();
				}
			}
		});
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = tf.getText().trim();
				tf.setText("");
				
				ta.append(s1);
				
				tf.requestFocus();
			}
		});
		
		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				f.setBackground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				f.setBackground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				f.setBackground(Color.BLACK);
			}
		});

		f.setVisible(true);
	}

}
