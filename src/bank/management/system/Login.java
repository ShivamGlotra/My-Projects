package bank.management.system;

import javax.swing.*;
import javax.tools.OptionChecker;

import com.mysql.cj.protocol.Resultset;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener{
	
	JButton signIn, clear, signUp, supportLink;
	JTextField cardValue;
	JPasswordField passwordValue;
	int balance = 0;

	Login() {
			
	
		setLayout(null);
		
		ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("logos/w.png"));
		Image image2 = image1.getImage().getScaledInstance(120, 120,Image.SCALE_DEFAULT);
		ImageIcon image3 = new ImageIcon(image2);
		JLabel label = new JLabel(image3);	
		label.setBounds(40, 40, 100, 100);
		add(label);
		
		JLabel welcomeText = new JLabel("WayStar's Online Banking");
		welcomeText.setBounds(180,40,500, 100);
		welcomeText.setFont(new Font("OSWALD",Font.BOLD,30));
		welcomeText.setForeground(Color.black);
		add(welcomeText);
		
		JLabel cardNumber = new JLabel("User Name: ");
		cardNumber.setBounds(80, 190,200,100);
		cardNumber.setForeground(Color.black);
		cardNumber.setFont(new Font("serif",Font.BOLD,25));

		add(cardNumber);

		
		JLabel password = new JLabel("Password: ");
		password.setBounds(80, 250,200,100);
		password.setForeground(Color.black);
		password.setFont(new Font("serif",Font.BOLD,25));
		add(password);
			
		cardValue = new JTextField();
		cardValue.setBounds(260, 230,230,25);
		cardValue.setFont(new Font("arial",Font.BOLD,13));
		add(cardValue);
		
		passwordValue = new JPasswordField();
		passwordValue.setBounds(260, 290,230,25);
		passwordValue.setFont(new Font("arial",Font.BOLD,13));
		add(passwordValue);
		
		signIn = new JButton("LOGIN");
		signIn.setBounds(260, 350,100,25);
		signIn.addActionListener(this);
		add(signIn);
		
		clear = new JButton("CLEAR");
		clear.setBounds(390, 350,100,25);
		clear.addActionListener(this);
		add(clear);

		signUp = new JButton("Create an Account");
		signUp.setBounds(300, 420,160,25);
		signUp.addActionListener(this);
		add(signUp);
		
		JLabel signUpQuestion = new JLabel("Not a customer?");
		signUpQuestion.setBounds(330, 395,100,25);
		add(signUpQuestion);
		
		
		JLabel customerSupport = new JLabel("Trouble Signing in?");
		customerSupport.setBounds(220, 470,170,25);
		add(customerSupport);
		
		supportLink = new JButton("Contact Us !");
		supportLink.setBackground(null);
		supportLink.setBorder(null);
		supportLink.setForeground(Color.BLUE);
		supportLink.setBounds(220,490,110,22);
		supportLink.addActionListener(this);
		add(supportLink);
		
		
		getContentPane().setBackground(new Color(119, 121, 128));
		
		setSize(600,580);
		setLocation(700,200);
		setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String userN="";
		String passW ="";
		int accountNumber = 0;
		
		if(e.getSource() == clear) {
			cardValue.setText("");
			passwordValue.setText("");
		}else if(e.getSource() == signIn) {
			if(cardValue.getText().equals("") && passwordValue.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Empty Values not allowed!!");
				
			}
			else {
				userN = cardValue.getText().toLowerCase();
				passW =passwordValue.getText();
				ConnectionC conn = new ConnectionC();
				String query = "Select * from finalSignupInfo WHERE userName ='"+userN+"' and passwordValue = '"+passW+"'";
			
			try {	
				ResultSet rSet =  conn.st.executeQuery(query);

				if(rSet.next()) {
					accountNumber = Integer.parseInt(rSet.getString("accountNum"));
					System.out.println(accountNumber);
					String query2 = "Select ChequingBalance from balance WHERE AccountNumber ='"+accountNumber+"'";
					ConnectionC conn2 = new ConnectionC();
					ResultSet rs = conn2.st.executeQuery(query2);
					if(rs.next())
						balance = Integer.parseInt(rs.getString("ChequingBalance"));
					setVisible(false);
					new bankingPage(balance,accountNumber).setVisible(true);
				}
				else
					JOptionPane.showMessageDialog(null, "Account Doesn't Exist");

				}
			catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex.toString());
			}
				
			}
		}else if(e.getSource() == signUp) {
			setVisible(false);
			new SignUpOne().setVisible(true);
		}else if(e.getSource() == supportLink) {
			JOptionPane.showMessageDialog(null, "Call us at  1-(866)-(464)-(2431)\nEmail : support@waystar.com");
		}
		
	}
	public static void main(String[] args) {
		new Login();
		
	}


}
