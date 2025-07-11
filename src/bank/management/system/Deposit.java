package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Deposit extends JFrame implements ActionListener {
	
	JButton deposit,back;
	JTextField amount;
	int accountNumber;
	//long accountNumber = SignUpOne.rand;

	Deposit(int accountNumber){
		this.accountNumber = accountNumber;
		
		setLayout(null);
		setSize(320,300);
		setLocation(700,200);
		setTitle("Deposit Money");
		
		JLabel msg = new JLabel("Enter the amount below");
		msg.setBounds(40,30,250,50);
		msg.setFont(new Font("OSWALD",Font.BOLD,20));
		msg.setForeground(Color.black);
		add(msg);
		
		JLabel restriction = new JLabel("(Amount from $5 to $9999)");
		restriction.setBounds(40,50,250,50);
		restriction.setForeground(Color.black);
		add(restriction);
		
		amount = new JTextField();
		amount.setBounds(50,120,200,30);
		amount.setForeground(Color.black);
		add(amount);
		
		deposit = new JButton("Deposit");
		deposit.setBounds(50,160,100,30);
		deposit.setForeground(Color.black);
		deposit.addActionListener(this);
		add(deposit);
		
		back = new JButton("Go Back");
		back.setBounds(150,160,100,30);
		back.setForeground(Color.black);
		back.addActionListener(this);
		add(back);
		
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String depositAmount = "";
		int balance = 0;
		
		if(e.getSource() == back) {
			
			ConnectionC conn = new ConnectionC();
			String query = "Select ChequingBalance from balance WHERE AccountNumber ='"+this.accountNumber+"'";	
			
			try {
				ResultSet rs = conn.st.executeQuery(query);
				if(rs.next())
					balance = Integer.parseInt(rs.getString("ChequingBalance"));
				setVisible(false);
				new bankingPage(balance,this.accountNumber).setVisible(true);
			} catch (SQLException ex) {
				JOptionPane.showMessageDialog(null,ex.toString());
			}
			
			
		}
		
		if(e.getSource() == deposit) {
			
			if(amount.getText().equals(""))
				JOptionPane.showMessageDialog(null, "Enter a number between 5 and 9999");
			else if(Integer.parseInt(amount.getText()) < 5 || Integer.parseInt(amount.getText()) > 9999) {
				JOptionPane.showMessageDialog(null, "Enter a number between 5 and 9999");
			}
			else {
				depositAmount = amount.getText();
				try {
					
					ConnectionC conn = new ConnectionC();
					String query = "UPDATE balance SET ChequingBalance = ChequingBalance + '"+depositAmount+"' WHERE AccountNumber ='"+this.accountNumber+"';";					
					conn.st.executeUpdate(query);
					
				}
				catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex.toString());
				}
				
			}
			amount.setText("");
		}
		
		
	}
	public static void main(String[] args) {
		new Deposit(0);
	}
	

}
