package org.gs.game.tetris;

public class Main {
	

	private Music music;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TetrisWindow();
		Music introMusic = new Music("introMusic.mp3",true);//�������
		introMusic.start();//�������
	}

}
