package KeyEvent;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Window extends JPanel{
	public final static int WIDTH=960;
	public final static int HEIGHT=540;
	
	MyKeyEvent myKey=new MyKeyEvent();
	private Star star=new Star();
	
	MyKeyEvent myKeyEvent=new MyKeyEvent();
	private static BufferedImage bg;
	
	static{
		try {
			bg=ImageIO.read(Window.class.getResource("bg.jpg"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void gogogo(){
		int tox=myKey.getToX();
		int toy=myKey.getToY();
		star.gogogo(tox, toy);
		
		
	}
	public void action(){
		Timer timer=new Timer();//定时器对象
		int interval=10;//定时间隔，毫秒
		timer.schedule(new TimerTask() {
			public void run() {
				gogogo();
				repaint();
			}
		},interval,interval);
	}
	
	public void paint(Graphics g){
		g.drawImage(bg, 0, 0,WIDTH,HEIGHT, null);
		star.paintPic(g);
		
	}
	
	public static void main(String[] args) {
		Window window=new Window();
		JFrame jf=new JFrame("飞机大战");
		jf.add(window);
		jf.setVisible(true);
		jf.setSize(WIDTH, HEIGHT);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.addKeyListener(window.myKey);
		jf.addKeyListener(window.myKeyEvent);
		window.action();
	}
}
