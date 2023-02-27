package businsa.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import businsa.model.MemberDao;

public class Mypage extends JFrame {
	
	Vector v;  
    Vector cols;
    DefaultTableModel model;
    JLabel     user;
    JTable jTable;
    JScrollPane pane;
    JPanel pbtn;
    JButton search,btnInsert,home,del;
	private static String userid;

    public Mypage (String userid) {
    	this.userid = userid;
    	
        setTitle("마이페이지");
        //v=getMemberList();
        
        JLabel user = new JLabel(userid + "님의 마이페이지");
        add(user,BorderLayout.NORTH);
        
        
        MemberDao dao = new MemberDao();
        v = dao.getMemberList();
        cols = getColumnList();

        model = new DefaultTableModel(v, cols);
 
        jTable = new JTable(model);
        pane = new JScrollPane(jTable);
        add(pane);
       
        pbtn = new JPanel();
        
        search = new JButton("검색");
        pbtn.add(search);
        add(pbtn,BorderLayout.SOUTH);
        
        btnInsert = new JButton("주문목록");
        pbtn.add(btnInsert);
        add(pbtn,BorderLayout.SOUTH);
       
        home = new JButton("HOME");
        pbtn.add(home);
        add(pbtn,BorderLayout.SOUTH);
        
        del = new JButton("탈퇴");
        pbtn.add(del);
        add(pbtn,BorderLayout.SOUTH);
        
        setSize(800,800);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        home.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Home2(userid);
				setVisible(false);
				
			}
		});
    }
    
   
    
    private Vector<Vector> getDataList() {
		MemberDao       dao   =  new MemberDao();
		Vector<Vector>  list  =  dao.getMemberList(user.getLabelFor());
		return  list;
	}

    private Vector<String> getColumnList(){
        Vector<String> col = new Vector<>();
        col.add("아이디");
        //col.add("비밀번호");
        col.add("이름");
        col.add("전화");
        col.add("주소");
        col.add("이메일");
       
        return col;
    }//getColumn
    
    

    public static void main(String[] args) {
        new Mypage(userid);
    }
    
   
}
