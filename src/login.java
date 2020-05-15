import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

import java.awt.Dialog.ModalExclusionType;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class login {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	

	private final JTextField usernametf = new JTextField();
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(login.class.getResource("/imagesnlogo/ADEPTO.png")));
		frame.setForeground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 983, 702);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);//step
		frame.setUndecorated(false); //step 
		frame.getContentPane().setLayout(null);
		panel.setBackground(new Color(0, 0, 51));
		panel.setForeground(Color.BLACK);
		panel.setBounds(0, 0, 982, 675);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setHorizontalAlignment(SwingConstants.TRAILING);
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		lblUsername.setBounds(208, 247, 128, 31);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		lblPassword.setBounds(208, 323, 128, 31);
		
		panel.add(lblPassword);
		usernametf.setBorder(null);
		usernametf.setForeground(new Color(0, 0, 0));
		usernametf.setBackground(new Color(255, 255, 255));
		usernametf.setBounds(345, 252, 312, 31);
		panel.add(usernametf);
		usernametf.setColumns(10);

		JLabel lblNotif = new JLabel("");
		lblNotif.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotif.setForeground(Color.RED);
		
		lblNotif.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNotif.setBounds(220, 459, 515, 31);
		panel.add(lblNotif);
		
		JButton loginbtn = new JButton("Login");
		loginbtn.setBackground(Color.ORANGE);
		//loginbtn.setBorder(null);
		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(usernametf.getText().isEmpty()||passwordField.getText().isEmpty())
				{
					lblNotif.setForeground(Color.RED);
					lblNotif.setText("Please Enter your Complete Credentials");
				}
				else
				{
					
					//Auth auth = new Auth();
					//auth.connect(usernametf.getText(),passwordField.getText()); //Auth connect
					Auto a=new Auto();
					try {
						
					a.method1(usernametf.getText(),passwordField.getText());
					// method to automate
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					/*if(auth.getKey()=="00000000000")   //Auth control
					{
						lblNotif.setForeground(Color.RED);
						lblNotif.setText("The Username or Password does not match.");
					}
					else {
					lblNotif.setForeground(Color.GREEN);
					lblNotif.setText(auth.getKey());
					}*/
					frame.dispose();
				}
			}
		});
	    
		loginbtn.setForeground(Color.BLACK);
		loginbtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		loginbtn.setBounds(543, 406, 115, 40);
		panel.add(loginbtn);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(null);
		passwordField.setBounds(345, 323, 312, 31);
		panel.add(passwordField);
		
		JLabel lblBG = new JLabel("New label");
		lblBG.setIcon(new ImageIcon(login.class.getResource("/imagesnlogo/bg2.png")));
		lblBG.setVerticalAlignment(SwingConstants.TOP);
		lblBG.setHorizontalAlignment(SwingConstants.CENTER);
		lblBG.setBounds(0, 0, 982, 675);
		panel.add(lblBG);
		
		
	}
}
