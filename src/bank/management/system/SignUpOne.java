package bank.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
import com.toedter.*;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.demo.DateChooserPanel;

public class SignUpOne extends JFrame implements ActionListener {

	static int rand= new Random().nextInt(90000000)+10000000;
	JButton reset, next;
	JTextField[] textField = new JTextField[8];
	//0-firstname, 1-lastname,2-DOB, 3- othergender, 4-email, 5-phone,6-address,7-postal,8-city,-9-province
	JDateChooser date;
	JComboBox<String> genderBox, martialBox;
	JTextField otherGender;
	
	public int getRand() {
		rand= new Random().nextInt(90000000)+10000000;
		return rand;
	}
	 
	SignUpOne(){
		
		setLayout(null);
		setSize(650,800);
		setLocation(700,200);
		setTitle("New Application Deatils - Page 1");

		getContentPane().setBackground(new Color(169, 166, 180));;
		
		
		JLabel title = new JLabel("APPLICATION NUMBER : "+rand);
		title.setBounds(100, 15, 550, 50);
		title.setFont(new Font("OSWALD",Font.BOLD,25));
		title.setForeground(new Color(0,0,139));
		add(title);
		
		JLabel page1 = new JLabel("Customer Details: ");
		page1.setBounds(240, 50, 550, 50);
		page1.setFont(new Font("ARIAL",Font.BOLD,20));
		page1.setForeground(new Color(150,75,0));
		add(page1);
		
	
		JLabel name = new JLabel("Name");
		name.setBounds(80, 80, 100, 100);
		name.setFont(new Font("TimesRoman",Font.BOLD,22));
		add(name);
		
		textField[0] = new JTextField("");
		textField[0].setBounds(80, 145, 230, 35);
		textField[0].setFont(new Font("serif",Font.ITALIC,20));
		add(textField[0]);
		
		textField[1] = new JTextField("");
		textField[1].setBounds(330, 145, 230,35);
		textField[1].setFont(new Font("serif",Font.ITALIC,20));
		add(textField[1]);
		
		JLabel dateOfbirth = new JLabel("Date of Birth");
		dateOfbirth.setBounds(78,160,400,100);
		dateOfbirth.setFont(new Font("TimesRoman",Font.BOLD,22));
		add(dateOfbirth);
		
		date = new JDateChooser();
		date.setBounds(78, 225, 480,35);
		date.setFont(new Font("serif",Font.ITALIC,20));
		add(date);
		
		JLabel gender = new JLabel("Gender");
		gender.setBounds(78,240,100,100);
		gender.setFont(new Font("TimesRoman",Font.BOLD,22));
		add(gender);
		
		genderBox = new JComboBox<String>(new String[] {"","Male","Female","Other"});
		genderBox.addActionListener(this);
		JToolBar genderBar = new JToolBar();
		genderBar.setBounds(78,305,230,30);
		genderBar.add(genderBox);
		add(genderBar);
		
		otherGender = new JTextField("Rather Not Say");
		otherGender.setEnabled(false);
		otherGender.setBounds(330,305,230,30);
		add(otherGender);
		
		JLabel email = new JLabel("Email");
		email.setBounds(78,320,100,100);
		email.setFont(new Font("TimesRoman",Font.BOLD,22));
		add(email);
		
		textField[2] = new JTextField("");
		textField[2].setBounds(78, 385, 230,35);
		textField[2].setFont(new Font("serif",Font.ITALIC,20));
		add(textField[2]);
		
		JLabel phone = new JLabel("Phone Number");
		phone.setBounds(330,320,200,100);
		phone.setFont(new Font("TimesRoman",Font.BOLD,22));
		add(phone);
		
		textField[3] = new JTextField("");
		textField[3].setBounds(330, 385, 230,35);
		textField[3].setFont(new Font("serif",Font.ITALIC,20));
		add(textField[3]);
		
		JLabel address = new JLabel("Address");
		address.setBounds(78,400,200,100);
		address.setFont(new Font("TimesRoman",Font.BOLD,22));
		add(address);
		
		textField[4] = new JTextField("");
		textField[4].setBounds(78, 465, 230,35);
		textField[4].setFont(new Font("serif",Font.ITALIC,20));
		add(textField[4]);
		
		JLabel postal = new JLabel("Postal Code");
		postal.setBounds(330,400,200,100);
		postal.setFont(new Font("TimesRoman",Font.BOLD,22));
		add(postal);
		
		textField[5] = new JTextField("");
		textField[5].setBounds(330, 465, 230,35);
		textField[5].setFont(new Font("serif",Font.ITALIC,20));
		add(textField[5]);
		
		JLabel city = new JLabel("City");
		city.setBounds(78,480,200,100);
		city.setFont(new Font("TimesRoman",Font.BOLD,22));
		add(city);
		
		textField[6] = new JTextField("");
		textField[6].setBounds(78, 545, 230,35);
		textField[6].setFont(new Font("serif",Font.ITALIC,20));
		add(textField[6]);
		
		JLabel province = new JLabel("Province");
		province.setBounds(330,480,200,100);
		province.setFont(new Font("TimesRoman",Font.BOLD,22));
		add(province);
		
		textField[7] = new JTextField("");
		textField[7].setBounds(330, 545, 230,35);
		textField[7].setFont(new Font("serif",Font.ITALIC,20));
		add(textField[7]);
		
		JLabel martialStatus = new JLabel("Martial Status");
		martialStatus.setBounds(78,560,230,100);
		martialStatus.setFont(new Font("TimesRoman",Font.BOLD,22));
		add(martialStatus);
		
		martialBox = new JComboBox<String>(new String[] {"","Single","Married","Divorced","Widowed","Prefer Not to say"});
		JToolBar martialBar = new JToolBar();
		martialBar.setBounds(78,630,230,30);
		martialBar.add(martialBox);
		add(martialBar);
		
		reset = new JButton("RESET");
		reset.setBounds(330,630,230,30);
		reset.setBackground(new Color(128,0,0));
		reset.setForeground(Color.white);
		reset.addActionListener(this);
		add(reset);
		
		
		next = new JButton("PROCEED");
		next.setBounds(330,680,230,30);
		next.setBackground(new Color(1,50,32));
		next.setForeground(Color.white);
		next.addActionListener(this);
		add(next);
		
	
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == genderBox) {
			if(genderBox.getSelectedIndex() == 3)
				otherGender.setEnabled(true);
			else {
				otherGender.setEnabled(false);
			}
		}
		
		if(e.getSource() == reset) {
			for(int i=0;i<textField.length;i++) 
				textField[i].setText("");
				genderBox.setSelectedIndex(0);
				martialBox.setSelectedIndex(0);
				date.setCalendar(null);
		}
		else if(e.getSource() == next){
			
			boolean inputValues=false;
			
			for(int i=0;i<textField.length;i++) {
				if(textField[i].getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Empty Values not allowed!!!!");
					break;
				}
				else {
					inputValues = true;
				}
			}
			
			if(inputValues == true) {
				if(genderBox.getSelectedIndex() == 0 || martialBox.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null, "Empty Values not allowed!!!!");
					inputValues = false;
				}
			}
			
			if (inputValues == true) {
			String applicationNum = ""+rand;
			String firstName = textField[0].getText();
			String lastName = textField[1].getText();
			String dob = ((JTextField)date.getDateEditor().getUiComponent()).getText();
			String gender = "";
			
			if(genderBox.getSelectedIndex() == 1)
				gender = "male";
			else if(genderBox.getSelectedIndex() == 2)
				gender = "female";
			else
				gender = otherGender.getText();
			
			String email = textField[2].getText();
			String phoneNum = textField[3].getText();
			String address = textField[4].getText();
			String postalCode = textField[5].getText();
			String city = textField[6].getText();
			String province = textField[7].getText();
			String martialStat = martialBox.getItemAt(martialBox.getSelectedIndex());
			
			setVisible(false);
			new signupPage2().setVisible(true);

			try {
				ConnectionC conn = new ConnectionC();
				String query = "Insert into signupInfo values('"+applicationNum+"','"+firstName+"','"+lastName+"','"+dob+"','"+gender+"','"+email+"','"+phoneNum+"','"+address+"','"+postalCode+"','"+city+"','"+province+"','"+martialStat+"')";
				conn.st.executeUpdate(query);
						
				}
			catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex.toString());
			}
				}
			}
		}

	
	public static void main(String[] args) {
		new SignUpOne();
		

	}



}
