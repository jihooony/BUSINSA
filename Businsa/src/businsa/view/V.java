package businsa.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class V extends JFrame {
	
	
	JButton b1;
	JLabel p1,p2,p3,p4,p5;
	JLabel p6,p7,p8,p9,p10;
	private String userid;

	
	
	public  V(String userid) {
		this.userid = userid;
	JFrame fr = new JFrame("빈티지");
	
	fr.getContentPane().setLayout(null);
	
    fr.setSize(1400, 800);
    fr.setLocationRelativeTo(null);
    fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    b1 = new JButton("Home");
    b1.setBounds(675,30,80,50);
    
    p1 = new JLabel("사진1");
    p1.setBounds(100, 100, 200, 200);
    p1.setOpaque(true);
    p1.setBackground(Color.DARK_GRAY);
    //i1 = new ImageIcon(getClass().getResource("스크린샷(1).png"));
    //p1.setIcon(i1);

    p2 = new JLabel("사진2");
    p2.setBounds(350, 100, 200, 200);
    p2.setOpaque(true);
    p2.setBackground(Color.GRAY);
    
    p3 = new JLabel("사진3");
    p3.setBounds(600, 100, 200, 200);
    p3.setOpaque(true);
    p3.setBackground(Color.LIGHT_GRAY);
    
    p4 = new JLabel("사진4");
    p4.setBounds(850, 100, 200, 200);
    p4.setOpaque(true);
    p4.setBackground(Color.LIGHT_GRAY);
   
    p5 = new JLabel("사진5");
    p5.setBounds(1100, 100, 200, 200);
    p5.setOpaque(true);
    p5.setBackground(Color.LIGHT_GRAY);
    
    p6 = new JLabel("사진6");
    p6.setBounds(100, 350, 200, 200);
    p6.setOpaque(true);
    p6.setBackground(Color.DARK_GRAY);
    //i1 = new ImageIcon(getClass().getResource("스크린샷(1).png"));
    //p1.setIcon(i1);
    
    p7 = new JLabel("사진7");
    p7.setBounds(350, 350, 200, 200);
    p7.setOpaque(true);
    p7.setBackground(Color.GRAY);
    
    p8 = new JLabel("사진8");
    p8.setBounds(600, 350, 200, 200);
    p8.setOpaque(true);
    p8.setBackground(Color.LIGHT_GRAY);
    
    p9 = new JLabel("사진9");
    p9.setBounds(850, 350, 200, 200);
    p9.setOpaque(true);
    p9.setBackground(Color.LIGHT_GRAY);
    
    p10 = new JLabel("사진10");
    p10.setBounds(1100, 350, 200, 200);
    p10.setOpaque(true);
    p10.setBackground(Color.LIGHT_GRAY);
    

    
    fr.getContentPane().add(b1);
    fr.getContentPane().add(p1);
    fr.getContentPane().add(p2);
    fr.getContentPane().add(p3);
    fr.getContentPane().add(p4);
    fr.getContentPane().add(p5);
    fr.getContentPane().add(p6);
    fr.getContentPane().add(p7);
    fr.getContentPane().add(p8);
    fr.getContentPane().add(p9);
    fr.getContentPane().add(p10);
    
    fr.setVisible(true);
    
    p1.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			new LoginWindow ();
			fr.setVisible(false);
		}
	});
    
    b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			new Home2(userid);
			fr.setVisible(false);
			
		}
	});
    
	}
}

