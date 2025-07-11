package bank.management.system;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class bankingPage extends JFrame implements ActionListener {
		
	private JButton withdraw, deposit, send, contactSupport, rate;
	int balance,accountNumber;

	
	bankingPage(int balance, int accountNumber) {
		this.balance = balance;
		this.accountNumber = accountNumber;
		
		setLayout(null);
		setSize(540,500);
		setLocation(700,200);
		setTitle("Account Details");
		getContentPane().setBackground(new Color(119, 121, 128));
		
		JLabel welcomeText = new JLabel("Account Number");
		welcomeText.setBounds(90,30,500, 100);
		welcomeText.setFont(new Font("OSWALD",Font.BOLD,30));
		welcomeText.setForeground(Color.black);
		add(welcomeText);
		
		TitledBorder check = new TitledBorder(new LineBorder (Color.black, 2), "Chequing Account");
		check.setTitleColor(Color.black);;
		check.setTitleFont(new Font("OSWALD",Font.BOLD,15));
		
		TitledBorder save = new TitledBorder(new LineBorder (Color.black, 2), "Savings Account");
		save.setTitleColor(Color.black);;
		save.setTitleFont(new Font("OSWALD",Font.BOLD,15));
		
		JLabel cBalance = new JLabel("Account Balance: $ "+balance);
		cBalance.setForeground(Color.black);
		cBalance.setFont(new Font("serif",Font.BOLD,25));
		
		JLabel sBalance = new JLabel("Account Balance: NULL");
		sBalance.setForeground(Color.black);
		sBalance.setFont(new Font("serif",Font.BOLD,25));
		
		JPanel p = new JPanel();
		p.setBounds(85,150,350, 80);
		p.setBackground(new Color(119, 121, 128));
		p.setBorder(check);
		p.add(cBalance);
		add(p);
		
		JPanel p2 = new JPanel();
		p2.setBounds(85,250,350, 80);
		p2.setBackground(new Color(119, 121, 128));
		p2.setBorder(save);
		p2.add(sBalance);
		add(p2);
		
		withdraw = new JButton("Withdraw");
		withdraw.setBounds(87,370,150, 30);
		withdraw.setBackground(new Color(2,2,21));
		withdraw.setForeground(new Color(122,180,245));
		withdraw.addActionListener(this);
		add(withdraw);
		
		deposit = new JButton("Deposit");
		deposit.setBounds(280,370,150, 30);
		deposit.setBackground(new Color(2,2,21));
		deposit.setForeground(new Color(122,180,245));
		deposit.addActionListener(this);
		add(deposit);
		
		contactSupport = new JButton("Contact Us !!!");
		contactSupport.setBackground(null);
		contactSupport.setBorder(null);
		contactSupport.setFont(new Font("serif",Font.BOLD,15));
		contactSupport.setForeground(new Color(100,1,1));
		contactSupport.setBounds(200,420,110,22);
		contactSupport.addActionListener(this);
		add(contactSupport);
		
		setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			
		if(e.getSource() == withdraw) {
			setVisible(false);
			new Withdraw(this.accountNumber).setVisible(true);
		}
		if(e.getSource() == deposit) {
			setVisible(false);
			new Deposit(this.accountNumber).setVisible(true);
		}
		if(e.getSource() == contactSupport) {
			JOptionPane.showMessageDialog(null, "Call us at  1-(866)-(464)-(2431)\nEmail : support@waystar.com");
		}
			
		
	}

	public static void main(String[] args) {
		new bankingPage(0,0);

	}

}
