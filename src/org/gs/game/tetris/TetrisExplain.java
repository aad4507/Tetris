package org.gs.game.tetris;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class TetrisExplain extends JFrame{
	public TetrisExplain() {
	
		getContentPane().setLayout(null);
		
		
		setTitle("TetrisExplain");	//초기화면 창 이름설정
		setSize(470, 520);		
		setLocationRelativeTo(null); //화면중앙에띄우기
		setVisible(true);
		


		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon("./image/설명.png"));
		btnNewButton_1.setBounds(0, 0, 452, 399);
		getContentPane().add(btnNewButton_1);
	
		

		
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBounds(170, 411, 105, 27);
		getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
		});
		
		
		

		
	}
}
