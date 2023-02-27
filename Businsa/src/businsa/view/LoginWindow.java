package businsa.view;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import businsa.model.MemberDao;

public class LoginWindow extends JFrame {

   private JPanel contentPane;
   private JTextField userid, passwd;
   private JButton loginBtn, joinBtn;
 
   
   public LoginWindow() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(400, 450);
      setLocationRelativeTo(null);
      
      contentPane = new JPanel();
      contentPane.setBackground(new Color(255, 255, 255));
      contentPane.setBorder(new EmptyBorder(0, 0, 1, 1));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JLabel lblNewLabel = new JLabel("BUSINSA",JLabel.CENTER);
      lblNewLabel.setFont(new Font("무신사", Font.BOLD,35));
      lblNewLabel.setBounds(40, 0, 303, 133);
      contentPane.add(lblNewLabel);
      
      JLabel lblNewLabel1 = new JLabel("로그인",JLabel.CENTER);
      lblNewLabel1.setFont(new Font("HY견고딕", Font.BOLD,25));
      lblNewLabel1.setBounds(40, 40, 303, 133);
      contentPane.add(lblNewLabel1);
      
      
      userid = new JTextField();
      userid.setText("wlgns");
      userid.setBounds(40, 155, 303, 35);
      contentPane.add(userid);
      userid.setColumns(10);
      userid.getBorder();
      
      passwd = new JTextField();
      passwd.setText("wlgns");
      passwd.setColumns(10);
      passwd.setBounds(40, 200, 303, 35);
      contentPane.add(passwd);
      
      JRadioButton rdbtnNewRadioButton = new JRadioButton("자동로그인");
      rdbtnNewRadioButton.setFont(new Font("HY견고딕", Font.PLAIN, 12));
      rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
      rdbtnNewRadioButton.setBounds(40, 240, 107, 23);
      contentPane.add(rdbtnNewRadioButton);
      
      JButton btnNewButton = new JButton("아이디|비밀번호찾기");
      btnNewButton.setForeground(new Color(0, 0, 0));
    
      btnNewButton.setBackground(new Color(255, 255, 255));
      btnNewButton.setBounds(175, 240, 167, 23);
      contentPane.add(btnNewButton);
      
      
      loginBtn = new JButton("로그인");
      loginBtn.setBackground(new Color(128, 128, 128));
      loginBtn.setForeground(new Color(255, 255, 255));
      loginBtn.setBorderPainted(false);
      loginBtn.setFont(new Font("HY견고딕", Font.PLAIN, 14));
      loginBtn.setBounds(40, 280, 303, 29);
      contentPane.add(loginBtn);
      
      joinBtn = new JButton("회원가입");
      joinBtn.setFont(new Font("HY견고딕", Font.PLAIN, 12));
      joinBtn.setBackground(new Color(255, 255, 255));
      joinBtn.setForeground(new Color(0, 128, 255));
      joinBtn.setBounds(125, 320, 136, 29);
      joinBtn.setBorderPainted(false);
      contentPane.add(joinBtn);
      
      
      setVisible(true);
      
      loginBtn.addKeyListener(new KeyListener() {
          @Override
          public void keyTyped(KeyEvent e) { }
          @Override
          public void keyReleased(KeyEvent e) {
             if(e.getKeyCode() == KeyEvent.VK_ENTER) {
            	 loginBtn.doClick();
             }
          }
          @Override
          public void keyPressed(KeyEvent e) { }
       });
      
      loginBtn.addActionListener(new ActionListener() {
          MemberDao memDao = new MemberDao();
          @Override
          public void actionPerformed(ActionEvent e) {
             if(memDao.checkMemCode(userid.getText())){
                if(memDao.checkMemPwd(passwd.getText())) {
                  
                  new Home2(userid.getText());             
                	setVisible(false);
                   return;
                } else {
                   JOptionPane.showMessageDialog(null, "패스워드가 틀렸습니다");
                }
             } else {
                JOptionPane.showMessageDialog(null, "아디디가 틀렸습니다");
                userid.grabFocus();
             }   
          }
       });
      
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
  		new Home();
  	}
}