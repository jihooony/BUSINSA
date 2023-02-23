package businsa.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Logcheck extends JFrame {

	JLabel lbl1;
	JButton btn1;
	
	BorderLayout bl = new BorderLayout();
	
	
	public Logcheck() {
		
		super("Logcheck");		
		setTitle("가입완료");
		
		lbl1 = new JLabel("가입을 환영합니다.");
		this.add(lbl1,"North");
		
		btn1 = new JButton("쇼핑하러 가기");
		this.add(btn1);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    //setSize(300,300);
		super.pack();
		setLocationRelativeTo(null);
	    setVisible(true);
	    
	    btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Home();
				setVisible(false);
				
			}
		});
	    
		}
		
	}

