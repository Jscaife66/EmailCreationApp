package EmailCreationApp;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ECInterface extends JFrame {
	
	//calls made for variables
	private JPanel contentPane;
	private JTextField firstNameTextField;
	private JLabel lastName;
	private JTextField lastNameTextField;
	private JLabel department;
	private JTextField departmentTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ECInterface frame = new ECInterface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ECInterface() {
		//coded settings for the interface box
		setTitle("Email Creation App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 405);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//firstName label
		JLabel firstName = new JLabel("First Name");
		firstName.setBounds(27, 21, 91, 14);
		contentPane.add(firstName);
		firstName.setFont(new Font("Segoe Ui", Font.PLAIN, 12));
		
		//firstName text field
		firstNameTextField = new JTextField();
		firstNameTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent evt) {
				//validates the jTextField for firstName to only allow letter character entry, whitespace and delete/backspace key
				
				char c = evt.getKeyChar();
				
				if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c)) {
					firstNameTextField.setEditable(true);
				}else {
					firstNameTextField.setEditable(false);
					System.out.println("invalid characters entered, please try again");
				}
			}
		});
		firstNameTextField.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		firstNameTextField.setBounds(27, 36, 165, 20);
		contentPane.add(firstNameTextField);
		firstNameTextField.setColumns(10);
		
		//lastName label
		JLabel lastName = new JLabel("Last Name");
		lastName.setBounds(240, 21, 91, 14);
		contentPane.add(lastName);
		lastName.setFont(new Font("Segoe Ui", Font.PLAIN, 12));
		
		//lastName text field
		lastNameTextField = new JTextField();
		lastNameTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent evt) {
				//validates the jTextField for lastName to only allow letter character entry, whitespace and delete/backspace key
				
				char c = evt.getKeyChar();
				
				if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c)) {
					lastNameTextField.setEditable(true);
				}else {
					lastNameTextField.setEditable(false);
					System.out.println("invalid characters entered, please try again");
				}
			}
		});
		lastNameTextField.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lastNameTextField.setBounds(240, 36, 165, 20);
		contentPane.add(lastNameTextField);
		lastNameTextField.setColumns(10);
		
		//department label
		JLabel department = new JLabel("Department");
		department.setBounds(27, 67, 91, 14);
		contentPane.add(department);
		department.setFont(new Font("Segoe Ui", Font.PLAIN, 12));
		
		//department text field
		departmentTextField = new JTextField();
		departmentTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent evt) {
				//validates the jTextField for department to only allow letter character entry, whitespace and delete/backspace key
				
				char c = evt.getKeyChar();
				
				if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c)) {
					departmentTextField.setEditable(true);
				}else {
					departmentTextField.setEditable(false);
					System.out.println("invalid characters entered, please try again");
				}
			}
		});
		departmentTextField.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		departmentTextField.setBounds(27, 82, 165, 20);
		contentPane.add(departmentTextField);
		departmentTextField.setColumns(10);
		
		//50 GB check box
		JCheckBox chckbx1 = new JCheckBox("50 GB");
		chckbx1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chckbx1.setBounds(240, 88, 122, 23);
		contentPane.add(chckbx1);
		
		//Capacity label
		JLabel capacity = new JLabel("Capacity");
		capacity.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		capacity.setBounds(240, 67, 91, 14);
		contentPane.add(capacity);
		
		//100 GB check box
		JCheckBox chckbx2 = new JCheckBox("100 GB");
		chckbx2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chckbx2.setBounds(240, 114, 122, 23);
		contentPane.add(chckbx2);
		
		//Grey background panel used for buttons
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlShadow);
		panel.setBounds(0, 238, 434, 128);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//clear button
		JButton clearButton = new JButton("Clear");
		clearButton.setForeground(new Color(30, 144, 255));
		clearButton.setFont(new Font("Segoe UI", Font.BOLD, 12));
		clearButton.setBackground(new Color(0, 51, 102));
		clearButton.setBounds(292, 66, 116, 23);
		panel.add(clearButton);
		
		//submit button
		JButton submitButton = new JButton("Submit");
		submitButton.setForeground(new Color(30, 144, 255));
		submitButton.setFont(new Font("Segoe UI", Font.BOLD, 12));
		submitButton.setBackground(new Color(0, 51, 102));
		submitButton.setBounds(146, 66, 116, 23);
		panel.add(submitButton);
	}
}
