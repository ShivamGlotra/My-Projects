package bank.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;

import com.toedter.*;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.demo.DateChooserPanel;

public class accountPageThree  extends JFrame implements ActionListener {
	
	JRadioButton check, saving;
	JCheckBox declare;
	JButton create;
	ButtonGroup accountTypeButton;
	JTextField salaryField, revenueField,userNameText;
	JPasswordField passwordText;
	int rand1,rand2,rand3,rand4;
	JComboBox<String> monthlyPlan,incomeType;
	
	accountPageThree() {
		
		setLayout(null);
		setSize(580,800);
		setLocation(700,200);
		setTitle("Account Details");
		
		getContentPane().setBackground(new Color(169, 166, 180));;
		
		rand1 = new Random().nextInt(900)+100;
		rand2 = new Random().nextInt(9000)+1000;
		rand3 = new Random().nextInt(9000)+1000;
		rand4 = new Random().nextInt(9000)+1000;
		
		JLabel additionalDetails = new JLabel("Account Details: ");
		additionalDetails.setBounds(200, 20, 550, 50);
		additionalDetails.setFont(new Font("ARIAL",Font.BOLD,22));
		additionalDetails.setForeground(Color.black);
		add(additionalDetails);
		
		JLabel accountType = new JLabel("Account Type: ");
		accountType.setBounds(80, 60, 550, 80);
		accountType.setFont(new Font("ARIAL",Font.BOLD,20));
		accountType.setForeground(Color.black);
		add(accountType);
		
		JLabel accountPlan = new JLabel("Choose Monthly Plan: ");
		accountPlan.setBounds(300, 60, 550, 80);
		accountPlan.setFont(new Font("ARIAL",Font.BOLD,19));
		accountPlan.setForeground(Color.black);
		add(accountPlan);
		
		JLabel addDetails = new JLabel("(monthly price and tansaction limit)");
		addDetails.setBounds(300, 80, 550, 80);
		addDetails.setFont(new Font("ARIAL",Font.PLAIN,12));
		addDetails.setForeground(Color.black);
		add(addDetails);
		
		monthlyPlan = new JComboBox<String>(new String[] {"$3.95 // 5","$9.95 // 10","$13.95 // No Limit"});
		monthlyPlan.addActionListener(this);
		JToolBar planBar = new JToolBar();
		planBar.setBounds(310, 150,180, 22);
		planBar.add(monthlyPlan);
		add(planBar);
		
		
		JLabel yesLabel = new JLabel("Check-In Account");
		yesLabel.setBounds(85, 90,180, 100);
		yesLabel.setFont(new Font("TimesRoman",Font.BOLD,18));
		add(yesLabel);
		
		check = new JRadioButton();
		check.setBounds(253,135,20,15);
		check.setBackground(new Color(169, 166, 180));
		check.addActionListener(this);
		add(check);
		
		JLabel noLabel = new JLabel("Savings Account");
		noLabel.setBounds(85, 130,180, 100);
		noLabel.setFont(new Font("TimesRoman",Font.BOLD,18));
		add(noLabel);
		
		saving = new JRadioButton();
		saving.setBounds(253,175,20,15);
		saving.setBackground(new Color(169, 166, 180));
		saving.addActionListener(this);
		add(saving);
		
		accountTypeButton = new ButtonGroup();
		accountTypeButton.add(check);
		accountTypeButton.add(saving);
		
		JLabel incomeDetails = new JLabel("Annual Income:");
		incomeDetails.setBounds(80, 190,180, 100);
		incomeDetails.setFont(new Font("Arial",Font.BOLD,20));
		incomeDetails.setForeground(Color.black);
		add(incomeDetails);
		
		JLabel salaryType = new JLabel("Type of Income");
		salaryType.setBounds(85, 240,180, 100);
		salaryType.setFont(new Font("TimesRoman",Font.BOLD,18));
		add(salaryType);
		
		incomeType = new JComboBox<String>(new String[] {"Employed","Self-Employed"});
		incomeType.addActionListener(this);
		JToolBar incBar = new JToolBar();
		incBar.setBounds(270, 280,220, 22);
		incBar.add(incomeType);
		add(incBar);
		
		JLabel salary = new JLabel("Annual Salary");
		salary.setBounds(95, 290,180, 100);
		salary.setFont(new Font("TimesRoman",Font.BOLD,16));
		add(salary);
		
		salaryField = new JTextField();
		salaryField.setBounds(270, 332,220, 20);
		salaryField.setFont(new Font("serif",Font.PLAIN,14));
		add(salaryField);
		
		JLabel revenue = new JLabel("Annual Revenue");
		revenue.setBounds(95, 330,180, 100);
		revenue.setFont(new Font("TimesRoman",Font.BOLD,16));
		add(revenue);
		
		revenueField = new JTextField();
		revenueField.setBounds(270, 372,220, 20);
		revenueField.setFont(new Font("serif",Font.PLAIN,14));
		revenueField.setEnabled(false);
		add(revenueField);
		
		JLabel newAccount = new JLabel("Login Details:");
		newAccount.setBounds(80, 400,180, 100);
		newAccount.setFont(new Font("Arial",Font.BOLD,20));
		newAccount.setForeground(Color.black);
		add(newAccount);
		
		JLabel accountNumber = new JLabel("Account Number :   "+SignUpOne.rand);
		accountNumber.setBounds(85, 440,300, 100);
		accountNumber.setFont(new Font("Arial",Font.BOLD,18));
		add(accountNumber);
		
		String cardN = "Card Number : %10d%d - %d - %d - %d";
		JLabel cardNumber = new JLabel(String.format(cardN, 4,rand1,rand2,rand3,rand4));
		cardNumber.setBounds(85, 480,600, 100);
		cardNumber.setFont(new Font("Arial",Font.BOLD,18));
		add(cardNumber);
		
		JLabel userName = new JLabel("User Name: ");
		userName.setBounds(85, 520,600, 100);
		userName.setFont(new Font("Arial",Font.BOLD,18));
		add(userName);
		
		userNameText = new JTextField();
		userNameText.setBounds(265, 560,220, 20);
		userNameText.setFont(new Font("Arial",Font.BOLD,18));
		add(userNameText);
		
		JLabel password = new JLabel("Password: ");
		password.setBounds(85, 560,600, 100);
		password.setFont(new Font("Arial",Font.BOLD,18));
		add(password);
		
		passwordText = new JPasswordField();
		passwordText.setEchoChar('*');
		passwordText.setBounds(265, 600,220, 20);
		passwordText.setFont(new Font("Arial",Font.BOLD,18));
		add(passwordText);
		
//		try {
//			URL url = new URL("https://youtu.be/dQw4w9WgXcQ?si=zl6vOD2Q7uyb0Vbj");
//		} catch (MalformedURLException ex) {
//			// TODO Auto-generated catch block
//			ex.printStackTrace();
//		}
		String terms = "I hereby declare that I have read the terms and conditions and I agree.";
		
		declare = new JCheckBox(terms);
		declare.setBounds(80, 650,600, 20);
		declare.setBackground(null);
		declare.setFont(new Font("Arial",Font.BOLD,11));
		add(declare);
	
		
		create = new JButton("CREATE ACCOUNT");
		create.setBounds(190,690,180,30);
		create.setBackground(new Color(144,238,144));
		create.setFont(new Font("Arial",Font.BOLD,15));
		create.setForeground(Color.BLUE);
		create.addActionListener(this);
		add(create);
	
		setVisible(true);
		
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		int accountNumber = SignUpOne.rand;
		String cardNumber = "4"+rand1+rand2+rand3+rand4;
		String accountType = "";
		String packageType = "";
		String annualIncome = "";
		String userName = "";
		String password = "";

		
		if(e.getSource() == incomeType) {
			if(incomeType.getSelectedIndex() == 1) {
				salaryField.setEnabled(false);
				revenueField.setEnabled(true);
			}else {
				salaryField.setEnabled(true);
				revenueField.setEnabled(false);
			}
		}
		
		if(e.getSource() == create) {
			if(!check.isSelected() && !saving.isSelected()) {
				JOptionPane.showMessageDialog(null, "Please Chose the Account Type!!!!");
			}
			else if(salaryField.getText().equals("") && revenueField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Empty Values not allowed!!!!");
			}
			else if(userNameText.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "User Name is required for logging in!!");
			}
			else if(passwordText.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Need Password for the account!!");
			}
			else if(!declare.isSelected()) {
				JOptionPane.showMessageDialog(null, "Please Read and accept The T & C!!");
			}
			else {
				if(check.isSelected())
					accountType = "Chequing Account";
				else if(saving.isSelected())
					accountType = "Savings Account";
				
				if(monthlyPlan.getSelectedIndex() == 0)
					packageType = "$ 3.95";
				else if(monthlyPlan.getSelectedIndex() == 0)
					packageType = "$ 9.95";
				else
					packageType = "$ 13.95";
				
				if(incomeType.getSelectedIndex() == 0)
					annualIncome = salaryField.getText();
				else if(incomeType.getSelectedIndex() == 1)
					annualIncome = revenueField.getText();
				
				userName = userNameText.getText();
				password = passwordText.getText();
				
				setVisible(false);
				new Login().setVisible(true);

				try {
					
					ConnectionC conn = new ConnectionC();
					String query = "Insert into finalSignupInfo values('"+accountNumber+"','"+accountType+"','"+packageType+"','"+annualIncome+"','"+cardNumber+"','"+userName+"','"+password+"')";
					conn.st.executeUpdate(query);
					
					String query2 = "Insert into balance values('"+accountNumber+"','"+0+"','"+"NULL"+"')";
					String query2s = "Insert into balance values('"+accountNumber+"','"+"NULL"+"','"+0+"')";
					
					if(check.isSelected())
						conn.st.executeUpdate(query2);
					else if(saving.isSelected())
						conn.st.executeUpdate(query2s);
					
					}
				catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex.toString());
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new accountPageThree();

	}

}
