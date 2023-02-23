package businsa.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Home extends JFrame {
	
	JLabel p1,p2,p3;
	JButton btn0,btn1,btn2,btn3,btn4;
	ImageIcon i1;
	
	
	public  Home() {
		
	JFrame fr = new JFrame("HOME");
	
	
	fr.getContentPane().setLayout(null);
	
    fr.setSize(1450, 800);
    fr.setLocationRelativeTo(null);
    fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    p1 = new JLabel("보세사진");
    p1.setBounds(100, 100, 350, 500);
    p1.setOpaque(true);
    p1.setBackground(Color.DARK_GRAY);
    //i1 = new ImageIcon(getClass().getResource("스크린샷(1).png"));
    //p1.setIcon(i1);

    p2 = new JLabel("편집샵사진");
    p2.setBounds(550, 100, 350, 500);
    p2.setOpaque(true);
    p2.setBackground(Color.GRAY);
    
    p3 = new JLabel("빈티지사진");
    p3.setBounds(1000, 100, 350, 500);
    p3.setOpaque(true);
    p3.setBackground(Color.LIGHT_GRAY);
    
    btn0 = new JButton("회원가입");
    btn0.setBounds(625,30,100,50);
    
    btn1 = new JButton(" 보세 ");
    btn1.setBounds(200,650,150,30);

    btn2 = new JButton(" 편집샵 ");
    btn2.setBounds(650,650,150,30);

    btn3 = new JButton(" 빈티지 ");
    btn3.setBounds(1100,650,150,30);
    
    btn4 = new JButton(" 로그인	 ");
    btn4.setBounds(725,30,100,50);
    
    fr.getContentPane().add(p1);
    fr.getContentPane().add(p2);
    fr.getContentPane().add(p3);
    
    fr.getContentPane().add(btn0);
    fr.getContentPane().add(btn1);
    fr.getContentPane().add(btn2);
    fr.getContentPane().add(btn3);
    fr.getContentPane().add(btn4);
    
    fr.setVisible(true);
    
    btn1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			new B();
			fr.setVisible(false);
			
			
		}
	});
    
btn2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			new P();
			fr.setVisible(false);
			
		}
	});

btn3.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
			new V();
			fr.setVisible(false);
		
	}
});

btn0.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		new JoinScreen();
		fr.setVisible(false);
		
	}
});
btn4.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		new LoginWindow();
		fr.setVisible(false);
		
		
	}
});


}

}

