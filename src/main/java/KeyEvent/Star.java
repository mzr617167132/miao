package KeyEvent;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Star {
	private int w;
	private int h;
	private int x;
	private int y;
	private int speed;
	public static  BufferedImage image;
	
	static{
		try {
			image=ImageIO.read(Window.class.getResource("star.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Star(){
		this.x=50;
		this.y=100;
		this.w=80;
		this.h=80;
		this.speed=3;
	}
	
	public void paintPic(Graphics g){
		g.drawImage(image, this.x,this.y,this.w,this.h, null);
	}
	
	public void gogogo(int toX,int toY){
		this.x+=toX*this.speed;
		this.y+=toY*this.speed;
	}
}
