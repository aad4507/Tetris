package org.gs.game.tetris;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TetrisWindow extends JFrame {
	
	public TetrisWindow() {
		
		getContentPane().setLayout(null);
		setTitle("TetrisMain");	//초기화면 창 이름설정
		setSize(380, 630);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); //화면중앙에띄우기
		
		JButton btnStart = new JButton("게임시작");
		btnStart.setBounds(125, 448, 105, 27);
		getContentPane().add(btnStart);
		btnStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				try {
					new Tetris();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		JButton btnExplain = new JButton("게임설명");
		btnExplain.setBounds(125, 487, 105, 27);
		getContentPane().add(btnExplain);
		btnExplain.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					new TetrisExplain();			
			   // private TetrisBoard[] tetrisBoards;
			    
			}
		});
		
		JButton btnExit = new JButton("게임종료");
		btnExit.setBounds(125, 526, 105, 27);
		getContentPane().add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				

			}
		});
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("./image/tetris4.png"));
		btnNewButton.setBounds(27, 24, 309, 412);
		getContentPane().add(btnNewButton);
		setVisible(true);		//보이게 설정
		
		
		
	}	
	
//	public static void main(String[] args) {
//		new TetrisWindow();
//		
//	}
}
