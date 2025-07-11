package bank.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
import com.toedter.*;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.demo.DateChooserPanel;

public class signupPage2 extends JFrame implements ActionListener {

	JButton reset, next;
	JRadioButton yes,no;
	JTextField[] textField = new JTextField[3];
	//0-firstname, 1-lastname,2-DOB, 3- othergender, 4-email, 5-phone,6-address,7-postal,8-city,-9-province
	JDateChooser exDate;
	JComboBox<String> edBox, idBox;
	JTextField otherGender, businessName, employerNameValue;
	ButtonGroup employmentType;
	
	
	signupPage2(){
		
		setLayout(null);
		setSize(580,800);
		setLocation(700,200);
		setTitle("New Account Application - Page 2");
		
		getContentPane().setBackground(new Color(169, 166, 180));;
		
		JLabel additionalDetails = new JLabel("Additional Details: ");
		additionalDetails.setBounds(200, 20, 550, 50);
		additionalDetails.setFont(new Font("ARIAL",Font.BOLD,20));
		additionalDetails.setForeground(Color.black);
		add(additionalDetails);
		
	
		JLabel employmentInfo = new JLabel("Employment Information:");
		employmentInfo.setBounds(80, 40,300, 100);
		employmentInfo.setFont(new Font("TimesRoman",Font.BOLD,22));
		add(employmentInfo);
		
		JLabel selfEmp = new JLabel("Self Employed :");
		selfEmp.setBounds(90, 80,300, 100);
		selfEmp.setFont(new Font("TimesRoman",Font.BOLD,18));
		add(selfEmp);
		
		JLabel yesLabel = new JLabel("Yes");
		yesLabel.setBounds(235, 80,50, 100);
		yesLabel.setFont(new Font("TimesRoman",Font.BOLD,16));
		add(yesLabel);
		
		yes = new JRadioButton();
		yes.setBounds(263,125,20,15);
		yes.setBackground(new Color(169, 166, 180));
		yes.addActionListener(this);
		add(yes);
		
		JLabel noLabel = new JLabel("No");
		noLabel.setBounds(290, 80,50, 100);
		noLabel.setFont(new Font("TimesRoman",Font.BOLD,16));
		add(noLabel);
		
		no = new JRadioButton();
		no.setBounds(313,125,20,15);
		no.setBackground(new Color(169, 166, 180));
		no.addActionListener(this);
		add(no);
		
		employmentType = new ButtonGroup();
		employmentType.add(yes);
		employmentType.add(no);
		
		
		businessName = new JTextField("Business Name");
		businessName.setEnabled(false);
		businessName.setBounds(340, 122,130, 20);
		businessName.setFont(new Font("serif",Font.ITALIC,20));
		add(businessName);
		
		JLabel employerName = new JLabel("Employer");
		employerName.setBounds(90, 123,250, 100);
		employerName.setFont(new Font("TimesRoman",Font.BOLD,18));
		add(employerName);
		
		employerNameValue = new JTextField("");
		employerNameValue.setEnabled(false);
		employerNameValue.setBounds(222, 160,250, 30);
		employerNameValue.setFont(new Font("serif",Font.ITALIC,20));
		add(employerNameValue);
		
		JLabel employmentAddress = new JLabel("Address");
		employmentAddress.setBounds(90, 170,250, 100);
		employmentAddress.setFont(new Font("TimesRoman",Font.BOLD,18));
		add(employmentAddress);
		
		textField[0] = new JTextField("");// address business or employer
		textField[0].setBounds(222, 210,250, 30);
		textField[0].setFont(new Font("serif",Font.ITALIC,20));
		add(textField[0]);
		
		JLabel education = new JLabel("Education Information");
		education.setBounds(80, 230,300, 100);
		education.setFont(new Font("TimesRoman",Font.BOLD,22));
		add(education);
		
		JLabel edLevel = new JLabel("Educataion Level");
		edLevel.setBounds(90, 290,300,70);
		edLevel.setFont(new Font("TimesRoman",Font.BOLD,18));
		add(edLevel);
		
		edBox = new JComboBox<String>(new String[] {"","High School","College","University","None"});
		edBox.addActionListener(this);
		JToolBar edBar = new JToolBar();
		edBar.setBounds(290, 315,180, 22);
		edBar.add(edBox);
		add(edBar);
		
		JLabel institution = new JLabel("Institution:");
		institution.setBounds(90, 330,300,70);
		institution.setFont(new Font("TimesRoman",Font.BOLD,19));
		add(institution);
		
		textField[1] = new JTextField("");// education institution
		textField[1].setBounds(222, 355,250, 25);
		textField[1].setFont(new Font("serif",Font.ITALIC,20));
		add(textField[1]);
		
		JLabel identity = new JLabel("Identity");
		identity.setBounds(80, 380,200, 100);
		identity.setFont(new Font("TimesRoman",Font.BOLD,22));
		add(identity);
		
		JLabel idLabel = new JLabel("Identity Type");
		idLabel.setBounds(90, 435,300,70);
		idLabel.setFont(new Font("TimesRoman",Font.BOLD,19));
		add(idLabel);
		
		idBox = new JComboBox<String>(new String[] {"","Passport","Driving License","PR Card","Ontario ID"});
		idBox.addActionListener(this);
		JToolBar idBar = new JToolBar();
		idBar.setBounds(290, 460,180, 22);
		idBar.add(idBox);
		add(idBar);
		
		JLabel idNumber = new JLabel("ID Number");
		idNumber.setBounds(90, 480,100,70);
		idNumber.setFont(new Font("TimesRoman",Font.BOLD,19));
		add(idNumber);
		
		textField[2] = new JTextField("");// ID number
		textField[2].setBounds(222, 505,250, 25);
		textField[2].setFont(new Font("serif",Font.ITALIC,20));
		add(textField[2]);
		
		JLabel expiryDate = new JLabel("Expiration");
		expiryDate.setBounds(90, 520,240,70);
		expiryDate.setFont(new Font("TimesRoman",Font.BOLD,19));
		add(expiryDate);
		
		exDate = new JDateChooser();
		exDate.setBounds(222, 545,250, 25);
		exDate.setFont(new Font("serif",Font.ITALIC,20));
		add(exDate);
		
		reset = new JButton("RESET");
		reset.setBounds(80,630,180,30);
		reset.setBackground(new Color(128,0,0));
		reset.setForeground(Color.white);
		reset.addActionListener(this);
		add(reset);
		
		
		next = new JButton("PROCEED");
		next.setBounds(295,630,180,30);
		next.setBackground(new Color(1,50,32));
		next.setForeground(Color.white);
		next.addActionListener(this);
		add(next);
		
	
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int accountNumber = SignUpOne.rand;
		String emloyersName = "";
		if(yes.isSelected()) {
			businessName.setEnabled(true);
			employerNameValue.setEnabled(false);
		}
		if(no.isSelected()) {
			employerNameValue.setEnabled(true);
			businessName.setEnabled(false);

		}
		
		if(e.getSource() == edBox) {
			if(edBox.getSelectedIndex() == 4)
				textField[1].setEnabled(false);
			else
				textField[1].setEnabled(true);
		}

		if(e.getSource() == reset) {
			for(int i=0;i<textField.length;i++) 
				textField[i].setText("");
				edBox.setSelectedIndex(0);
				idBox.setSelectedIndex(0);
				exDate.setCalendar(null);
		}
		else if(e.getSource() == next){
			
			boolean inputValues=true;
			
			for(int i=0;i<textField.length;i++) {
				if(textField[i].getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Empty Values not allowed!!!!");
					inputValues = false;
					break;
				}
			}
			if(inputValues == true) {
				if(!yes.isSelected() && !no.isSelected()) 
					JOptionPane.showMessageDialog(null, "Empty Values not allowed!!!!");
				else if(edBox.getSelectedIndex() == 0 || idBox.getSelectedIndex() == 0)
					JOptionPane.showMessageDialog(null, "Empty Values not allowed!!!!");
				else {
					if(yes.isSelected())
						emloyersName = employerNameValue.getText();
					else
						emloyersName = employerNameValue.getText();
					
					String employmentAddress = textField[0].getText();
					String idNumber = textField[2].getText();
					String expiry = ((JTextField)exDate.getDateEditor().getUiComponent()).getText();
					String edLevelValue = "";
					String idType = "";
					
					
					if(edBox.getSelectedIndex() == 1)
						edLevelValue = "High-School";
					else if(edBox.getSelectedIndex() == 2)
						edLevelValue = "College";
					else if(edBox.getSelectedIndex() == 3)
						edLevelValue = "Post-Grad";
					else 
						edLevelValue = "None";
					
					String institutionName = textField[1].getText();
		
		
					if(idBox.getSelectedIndex() == 1)
						idType = "Passport";
					else if(edBox.getSelectedIndex() == 2)
						idType = "Driving-License";
					else if(edBox.getSelectedIndex() == 3)
						idType = "PR Card";
					else
						idType = "Ontario ID";
					
					setVisible(false);
					new accountPageThree().setVisible(true);
	
					try {
						ConnectionC conn = new ConnectionC();
						String query = "Insert into signupInfoTwo values('"+accountNumber+"','"+emloyersName+"','"+employmentAddress+"','"+edLevelValue+"','"+institutionName+"','"+idType+"','"+idNumber+"','"+expiry+"')";
						conn.st.executeUpdate(query);
								
						}
					catch (Exception ex) {
						JOptionPane.showMessageDialog(null, ex.toString());
						}
			}
			}
		}
	}

	
	public static void main(String[] args) {
		new signupPage2();
		

	}



}
