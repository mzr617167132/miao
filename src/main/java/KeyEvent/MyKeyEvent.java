package KeyEvent;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyKeyEvent extends KeyAdapter{
	private int toX;
	private int toY;
	
	public void keyPressed(KeyEvent e){
		int code=e.getKeyCode();
		System.out.println(code);
		if(code==37||code==65){
			
			this.toX=-1;
		}else if(code==39||code==68){
			this.toX=1;
		}else if(code==38||code==87){
			this.toY=-1;
		}else if(code==40||code==83){
			this.toY=1;
		}
	}
	public void keyReleased(KeyEvent e){
		this.toX=0;
		this.toY=0;
	}
	public int getToX() {
		return toX;
	}

	public int getToY() {
		return toY;
	}
	
}
