package org.gs.game.tetris;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread {
	
	private Player player;
	private boolean isLoop;
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	public Music(String name, boolean isLoop) {
		try {
			this.isLoop = isLoop;
		//	file=new File("C:\\Users\\user\\Desktop\\자바용폴더\\DataCommunication\\src\\music" + name);
//			file = new File(Main.class.getResource("./music/" + name).toURI());
			file = new File("./music/" + name);
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
		} catch (Exception e) {
			System.out.println("A오류");
			System.out.println(e.getMessage());
			e.printStackTrace(); //문제 위치 추적
		}
	} 
	
	public int getTime() {
		if(player == null)
			return 0;
		return player.getPosition();
	}
	
	public void close() {
		isLoop = false;
		player.close();
		this.interrupt();
	}
	
	@Override
	public void run() {
		try {
			do {
				player.play();
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				player = new Player(bis);
			} while(isLoop);
		} catch (Exception e) {
			System.out.println("B오류");
			System.out.println(e.getMessage());
		}
	}
}

