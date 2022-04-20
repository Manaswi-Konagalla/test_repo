import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
//import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.sql.Connection;


public class ABCCOMPANY {

	private JFrame frame;
	private JTextField txtname;
	private JTextField txtadd;
	private JTextField txtphone;
	private JTextField txtmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ABCCOMPANY window = new ABCCOMPANY();
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
	public ABCCOMPANY() {
		initialize();
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 334, 338);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ABC COMPANY");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(98, 11, 125, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("    REGISTRATION PAGE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(74, 36, 149, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(22, 79, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtname = new JTextField();
		txtname.setBounds(122, 76, 172, 20);
		frame.getContentPane().add(txtname);
		txtname.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("ADDRESS");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(22, 107, 69, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		txtadd = new JTextField();
		txtadd.setColumns(10);
		txtadd.setBounds(122, 104, 172, 20);
		frame.getContentPane().add(txtadd);
		
		JLabel lblNewLabel_2_2 = new JLabel("PHONE");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2.setBounds(22, 135, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		txtphone = new JTextField();
		txtphone.setColumns(10);
		txtphone.setBounds(122, 132, 172, 20);
		frame.getContentPane().add(txtphone);
		
		JLabel lblNewLabel_2_3 = new JLabel("MAIL ID");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_3.setBounds(22, 163, 69, 14);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		txtmail = new JTextField();
		txtmail.setColumns(10);
		txtmail.setBounds(122, 160, 172, 20);
		frame.getContentPane().add(txtmail);
		
		JButton butsub = new JButton("SUBMIT");
		butsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			
				
			}
		});
		butsub.setBounds(109, 223, 103, 34);
		frame.getContentPane().add(butsub);
	}
}
