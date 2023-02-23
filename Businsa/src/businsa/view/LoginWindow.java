package businsa.view;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class LoginWindow extends JFrame {

   private JPanel contentPane;
   private JTextField tfUsername, tfPassword;
   private JButton loginBtn, joinBtn;
   private JButton btnNewButton_1;
   private JButton btnNewButton_2;
   


   public LoginWindow() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(400, 600);
      setLocationRelativeTo(null);
      
      contentPane = new JPanel();
      contentPane.setBackground(new Color(255, 255, 255));
      contentPane.setBorder(new EmptyBorder(0, 0, 1, 1));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      tfUsername = new JTextField();
      tfUsername.setText("\uC544\uC774\uB514");
      tfUsername.setBounds(40, 194, 303, 35);
      contentPane.add(tfUsername);
      tfUsername.setColumns(10);
      
      joinBtn = new JButton("회원가입");
      joinBtn.setFont(new Font("HY견고딕", Font.PLAIN, 12));
      joinBtn.setBackground(new Color(255, 255, 255));
      joinBtn.setForeground(new Color(0, 128, 255));
      joinBtn.setBounds(125, 487, 136, 29);
      joinBtn.setBorderPainted(false);
      contentPane.add(joinBtn);
      
      loginBtn = new JButton("로그인");
      loginBtn.setBackground(new Color(128, 128, 128));
      loginBtn.setForeground(new Color(255, 255, 255));
      loginBtn.setBorderPainted(false);
      loginBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      loginBtn.setFont(new Font("HY견고딕", Font.PLAIN, 14));
      loginBtn.setBounds(40, 448, 303, 29);
      contentPane.add(loginBtn);
      
      tfPassword = new JTextField();
      tfPassword.setText("\uBE44\uBC00\uBC88\uD638");
      tfPassword.setColumns(10);
      tfPassword.setBounds(40, 253, 303, 35);
      contentPane.add(tfPassword);
      
      JRadioButton rdbtnNewRadioButton = new JRadioButton("\uC790\uB3D9 \uB85C\uADF8\uC778");
      rdbtnNewRadioButton.setFont(new Font("HY견고딕", Font.PLAIN, 12));
      rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
      rdbtnNewRadioButton.setBounds(40, 322, 107, 23);
      contentPane.add(rdbtnNewRadioButton);
      
      JButton btnNewButton = new JButton("\uC544\uC774\uB514 | \uBE44\uBC00\uBC88\uD638 \uCC3E\uAE30");
      btnNewButton.setForeground(new Color(0, 0, 0));
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      btnNewButton.setBackground(new Color(255, 255, 255));
      btnNewButton.setBounds(175, 322, 167, 23);
      contentPane.add(btnNewButton);
      
      btnNewButton_1 = new JButton("카카오 로그인");
      btnNewButton_1.setFont(new Font("HY견고딕", Font.PLAIN, 14));
      btnNewButton_1.setBackground(new Color(255, 204, 000));
      btnNewButton_1.setForeground(new Color(255, 255, 255));
      btnNewButton_1.setBounds(40, 374, 303, 33);
      btnNewButton_1.setBorderPainted(false);
      contentPane.add(btnNewButton_1);
      
      btnNewButton_2 = new JButton("네이버 로그인");
      btnNewButton_2.setFont(new Font("HY견고딕", Font.PLAIN, 14));
      btnNewButton_2.setBackground(new Color(051, 153, 051));
      btnNewButton_2.setForeground(new Color(255, 255, 255));
      btnNewButton_2.setBounds(40, 411, 303, 33);
      btnNewButton_2.setBorderPainted(false);
      contentPane.add(btnNewButton_2);
      
      JLabel lblNewLabel = new JLabel("<HTML>BUSINSA<br>LOGIN</HTML>",JLabel.CENTER);
      lblNewLabel.setFont(new Font("무신사", Font.BOLD,30));
      //lblNewLabel.setIcon(new ImageIcon(LoginWindow.class.getResource("file:///D:/ws/java/Businsa/src/image/KakaoTalk_20230223_101205427.png")));
      lblNewLabel.setBounds(40, 34, 303, 133);
      contentPane.add(lblNewLabel);
      
      
      
      setVisible(true);
      //회원가입 액션
      joinBtn.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            new JoinScreen();
            setVisible(false);
         }
      });
   }
      public static void main(String[] args) {
  		new LoginWindow();
  	}
}