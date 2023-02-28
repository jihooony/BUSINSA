package businsa.view;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.JButton;
// 이덕만
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

import businsa.model.MemberDao;
import businsa.model.MemberDao2;
import businsa.model.MemberVO;

public class Mypage2 extends JFrame implements KeyListener, ActionListener {

	// 필드
	private JPanel      topPane;
	private JLabel      lblTxtUserName, lblTxtUserName1; 
	private JTextField  userCode, email;	
	private JLabel      passwd, phone, addr, joinDate, secesDate, userId;
	private JButton     btnFind, btnClear, btnDelete;  
	private JTable      jTable;
	private JScrollPane jSpane;
	private String      userid;

	Mypage2        memDetail = null;

	// 생성자
	public Mypage2() {
		initComponent();
	}
	public Mypage2(String userid) {
		this.userid = userid;
		
		initComponent();
		userId.setText(userid);
	}

	// 화면 배치
	private void initComponent() {
		setTitle("회원상세조회");
		getContentPane().setLayout(null);

		topPane    = new JPanel();
		topPane.setBounds(0, 0, 1000, 273);
		topPane.setLayout(null);

		lblTxtUserName = new JLabel();
		lblTxtUserName.setBounds(12, 17, 80, 28);
		lblTxtUserName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTxtUserName.setFont(new Font("굴림체", Font.BOLD, 16));

		JLabel lblText = new JLabel("님의 정보");
		lblText.setBounds(97, 17, 63, 28);
		lblText.setFont(new Font("굴림체", Font.PLAIN, 12));

		JLabel lblUserCode = new JLabel("회원코드");
		lblUserCode.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUserCode.setFont(new Font("굴림체", Font.PLAIN, 12));
		lblUserCode.setBounds(64, 61, 57, 15);

		userCode = new JTextField();
		userCode.setBounds(133, 55, 116, 28);
		userCode.setColumns(10);

		JLabel lblUserId = new JLabel("회원아이디");
		lblUserId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUserId.setFont(new Font("굴림체", Font.PLAIN, 12));
		lblUserId.setBounds(279, 61, 68, 15);

		userId = new JLabel();
		userId.setBounds(359, 55, 116, 28);
		

		JLabel lblPasswd = new JLabel("패스워드");
		lblPasswd.setFont(new Font("굴림체", Font.PLAIN, 12));
		lblPasswd.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPasswd.setBounds(514, 61, 57, 15);

		passwd = new JLabel();
		passwd.setBounds(583, 55, 116, 28);

		JLabel lblPhone = new JLabel("PHONE");
		lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhone.setFont(new Font("굴림체", Font.PLAIN, 12));
		lblPhone.setBounds(64, 103, 57, 15);

		phone = new JLabel();
		phone.setBounds(133, 97, 116, 28);

		JLabel lblAddr = new JLabel("주소");
		lblAddr.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddr.setFont(new Font("굴림체", Font.PLAIN, 12));
		lblAddr.setBounds(290, 103, 57, 15);

		addr = new JLabel();
		addr.setBounds(359, 97, 340, 28);

		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("굴림체", Font.PLAIN, 12));
		lblEmail.setBounds(64, 147, 57, 15);

		email = new JTextField();
		email.setBounds(133, 141, 342, 28);
		email.setColumns(10);

		JLabel lblJoinDate = new JLabel("가입일");
		lblJoinDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblJoinDate.setFont(new Font("굴림체", Font.PLAIN, 12));
		lblJoinDate.setBounds(64, 192, 57, 23);

		joinDate = new JLabel();
		joinDate.setFont(new Font("굴림체", Font.PLAIN, 12));
		joinDate.setBounds(133, 186, 192, 34);

		JLabel lblSecesDate = new JLabel("탈퇴일");
		lblSecesDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSecesDate.setFont(new Font("굴림체", Font.PLAIN, 12));
		lblSecesDate.setBounds(359, 192, 57, 23);

		secesDate = new JLabel();
		secesDate.setForeground(new Color(255, 0, 0));
		secesDate.setFont(new Font("굴림체", Font.PLAIN, 12));
		secesDate.setBounds(428, 186, 192, 34);


		lblTxtUserName1 = new JLabel();
		lblTxtUserName1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTxtUserName1.setFont(new Font("굴림체", Font.BOLD, 16));
		lblTxtUserName1.setBounds(12, 242, 80, 28);

		JLabel lblOrderList = new JLabel("님의 구매목록");
		lblOrderList.setFont(new Font("굴림체", Font.PLAIN, 12));
		lblOrderList.setBounds(97, 249, 155, 15);

		btnFind = new JButton("조회");
		btnFind.setBounds(721, 86, 97, 76);

		btnClear = new JButton("클리어");
		btnClear.setBounds(721, 217, 97, 23);

		btnDelete = new JButton("삭제");
		btnDelete.setBackground(new Color(255, 0, 0));
		btnDelete.setBounds(875, 217, 97, 23);

		topPane.add(lblTxtUserName);
		topPane.add(lblText);
		topPane.add(lblUserCode);
		topPane.add(userCode);
		topPane.add(lblUserId);
		topPane.add(userId);

		topPane.add(lblPhone);
		topPane.add(phone);
		topPane.add(lblAddr);
		topPane.add(addr);
		topPane.add(lblEmail);
		topPane.add(email);
		topPane.add(lblJoinDate);
		topPane.add(joinDate);
		topPane.add(lblSecesDate);
		topPane.add(secesDate);
		topPane.add(lblOrderList);
		topPane.add(lblTxtUserName1);
		topPane.add(btnFind);
		topPane.add(btnDelete);
		topPane.add(btnClear);
		getContentPane().add(topPane);

		jTable = new JTable();
		jTable.setFont(new Font("굴림체", Font.PLAIN, 12));
		jSpane = new JScrollPane(jTable);
		jSpane.setBounds(0, 274, 1000, 152);
		getContentPane().add(jSpane);
		jTable.setModel(
				new DefaultTableModel(getOrderList(userid), getOrderColumnList()) {
					@Override
					public boolean isCellEditable(int row, int column) {
						return false;
					}
				}
				);
		resizeColumnWidth(jTable);
		jTable.repaint();

		// 기능
		userCode.addKeyListener(this);
		userId.addKeyListener(this);
		email.addKeyListener(this);
		btnFind.addActionListener(this);
		btnClear.addActionListener(this);
		btnDelete.addActionListener(this);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(1014, 463);
		setLocation(550, 300);
		setVisible(true);
	}
	// 키보드 기능
	@Override
	public void keyTyped(KeyEvent e) { }
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			if(memDetail != null) setVisible(false);
			btnFind.doClick();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) { }
	// 버튼 액션 기능
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {  
		case "조회" : 
			if(!userCode.getText().equals("")) {
				codeFind();
			} else if(!userId.getText().equals("")) {
				idFind();
			} else if(!email.getText().equals("")) {
				emailFind();
			}
			break;
		case "클리어" :
			viewClear();
			break;
		case "삭제" :
			if(!userCode.getText().equals("")) {
				memDelete();
				viewClear();
			}
			break;
		}
	}
	// 코드로 찾기
	private void codeFind() {
		MemberDao2 memDao = new MemberDao2();
		if(!userCode.getText().equals("")) { 
			String inUserCode = userCode.getText();
			if(memDao.checkUserCode(inUserCode)) {
				MemberVO memVo = memDao.getMember(inUserCode);
				memDetail = new Mypage2(inUserCode);
				memDetail.setViewData(memVo);
			} else if(memDao.checkOUserCode(inUserCode)){
				MemberVO memVo = memDao.getOutMember(inUserCode);
				memDetail = new Mypage2(inUserCode);
				memDetail.setViewData(memVo);
			} else {
				JOptionPane.showMessageDialog(null, "없는 코드 입니다");
			}
		}
		if(memDetail != null) setVisible(false);
	}
	// 아이디로 찾기
	private void idFind() {
		MemberDao2 memDao = new MemberDao2();
		if(!userId.getText().equals("")) { 
			String inUserId = userId.getText();
			if(memDao.checkUserId(inUserId)) {
				MemberVO memVo = memDao.getMember(inUserId);
				String   usercode = memVo.getUsercode();
				memDetail = new Mypage2(usercode);
				memDetail.setViewData(memVo);
			} else {
				JOptionPane.showMessageDialog(null, "없는 아이디 입니다");
			}
		}
		if(memDetail != null) setVisible(false);
	}
	// 이메일로 찾기
	private void emailFind() {
		MemberDao2 memDao = new MemberDao2();
		if(!email.getText().equals("")) { 
			String inUserEmail = email.getText();
			if(memDao.checkUserEmail(inUserEmail)) {
				MemberVO memVo = memDao.getMember(inUserEmail);
				String   usercode = memVo.getUsercode();
				memDetail = new Mypage2(usercode);
				memDetail.setViewData(memVo);
			} else if(memDao.checkOUserEmail(inUserEmail)){
				MemberVO memVo = memDao.getOutMember(inUserEmail);
				String   usercode = memVo.getUsercode();
				memDetail = new Mypage2(usercode);
				memDetail.setViewData(memVo);
			} else {
				JOptionPane.showMessageDialog(null, "없는 이메일 입니다");
			}
		}
		if(memDetail != null) setVisible(false);
	}
	// 회원정보 화면에 뿌리기
	public void setViewData(MemberVO memVo) {
		String userName  = memVo.getUsername();
		String usetCode  = memVo.getUsercode();
		String userid    = memVo.getUserid();
		String passwd    = memVo.getPasswd();
		String phone     = memVo.getPhone();
		String addr      = memVo.getAddr();
		String email     = memVo.getEmail();
		String joinDate  = memVo.getJoindate();
		//String secesDate = memVo.getSecesdate();

		this.lblTxtUserName.setText(userid);
		this.userCode.setText(usetCode);
		this.userId.setText(userid);
		this.passwd.setText(passwd);
		this.phone.setText(phone);
		this.addr.setText(addr);
		this.email.setText(email);
		this.joinDate.setText(joinDate);
		//this.secesDate.setText(secesDate);
		this.lblTxtUserName1.setText(userName);
	}
	// JTable 폭 자동 조절
	private void resizeColumnWidth(JTable table) {
		final TableColumnModel columnModel = table.getColumnModel();
		for (int column = 0; column < table.getColumnCount(); column++) {
			int width = 50; 
			for (int row = 0; row < table.getRowCount(); row++) {
				TableCellRenderer renderer = table.getCellRenderer(row, column);
				Component comp = table.prepareRenderer(renderer, row, column);
				width = Math.max(comp.getPreferredSize().width +1 , width);
			}
			columnModel.getColumn(column).setPreferredWidth(width);
		}
	}
	// 구매 목록 가져오기 
	private Vector<Vector> getOrderList(String usercode) {
		MemberDao2 memDao = new MemberDao2();
		Vector<Vector> orderList = memDao.getmemOrderList(usercode);
		return orderList;
	}
	private Vector<String> getOrderColumnList() {
		Vector<String> cols = new Vector<>();
		cols.add("순번");
		cols.add("주문코드");
		cols.add("상호명");
		cols.add("상호주소");
		cols.add("상품명");
		cols.add("가격");
		cols.add("사이즈");
		cols.add("주문량");
		cols.add("주문일");
		cols.add("상호코드");
		cols.add("상품코드");
		return cols;
	}

	// 화면 클리어
	private void viewClear() {
		lblTxtUserName.setText("");
		lblTxtUserName1.setText(""); 
		userCode.setText("");
		userId.setText("");
		email.setText("");
		passwd.setText("");
		phone.setText("");
		addr.setText("");
		joinDate.setText("");
		secesDate.setText("");
		userid = "";
		jTable.setModel(
				new DefaultTableModel(getOrderList(""), getOrderColumnList()) {
					@Override
					public boolean isCellEditable(int row, int column) {
						return false;
					}
				}
				);
		resizeColumnWidth(jTable);
		jTable.repaint();
	}
	// 회원삭제
	private void memDelete() {
		String inUserCode = userCode.getText();
		if(inUserCode.trim().equals("")) return;
		MemberDao2 memDao = new MemberDao2();
		if(!userCode.getText().equals("")) {
			if(memDao.checkUserCode(inUserCode)) {
				int choice = JOptionPane.showConfirmDialog(null, 
						userId.getText() + "를 삭제하시겠습니까?", "삭제확인",
						JOptionPane.OK_CANCEL_OPTION);
				String msg = "";
				if(choice == 0) {
					int aftcnt = memDao.clear1(inUserCode);
					memDao.clear2(inUserCode);
					memDao.clear3(inUserCode); 
					if(aftcnt > 0) {
						msg = aftcnt + "건 삭제되었습니다";
					} else {
						msg = "삭제 되지 않았습니다";
					}
				} else {
					msg = "취소를 클릭하였습니다";
				}
				JOptionPane.showMessageDialog(null, msg,
						"삭제", JOptionPane.OK_OPTION);
			} else if(memDao.checkOUserCode(inUserCode)) {
				JOptionPane.showMessageDialog(null, "이미 탈퇴한 회원입니다");
			}
		}
	}

	public static void main(String[] args) {
		new Mypage2();
	}
}

