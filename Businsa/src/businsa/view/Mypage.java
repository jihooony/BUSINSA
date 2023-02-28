package businsa.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import businsa.model.MemberDao;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class Mypage extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnNewButton,btnNewButton1,btnNewButton2,btnNewButton3;
	private static String userid;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mypage frame = new Mypage(userid);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Mypage(String userid) {
		this.userid = userid;
		
		MemberDao memDao = new MemberDao();
		
		
		setTitle("MyPage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(6, 6, 6, 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder
		(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "회원정보 상세보기", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(6, 10, 633, 57);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디 : " + userid);
		lblNewLabel.setBounds(15, 22, 100, 15);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("상세정보");
		btnNewButton.setBounds(525, 18, 97, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton1 = new JButton("주문목록");
		btnNewButton1.setBounds(420, 18, 97, 23);
		panel.add(btnNewButton1);
		
		JButton btnNewButton2 = new JButton("HOME");
		btnNewButton2.setBounds(10, 185, 100, 23);
		add(btnNewButton2);
		
		JButton btnNewButton3 = new JButton("회원탈퇴");
		btnNewButton3.setBounds(532, 185, 100, 23);
		add(btnNewButton3);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 78, 621, 100);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		setVisible(true);
		setLocationRelativeTo(null);
		
		btnNewButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Home2(userid);
				
			}
		});
	}
}