package model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 633, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tf1 = new JTextField();
		tf1.setBounds(25, 11, 270, 52);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(317, 11, 270, 52);
		frame.getContentPane().add(tf2);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a = Integer.parseInt(tf1.getText());
					int b = Integer.parseInt(tf2.getText());
					int zbir = a + b; 
					lblNewLabel.setText(Integer.toString(zbir));
				}catch(Exception error) {
					JOptionPane.showMessageDialog(null, "Invalid Number!!");
				}
				
			}
		});
		btnAdd.setBounds(31, 148, 204, 52);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("Subtract");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					int a = Integer.parseInt(tf1.getText());
					int b = Integer.parseInt(tf2.getText());
					int razlika = a - b; 
					lblNewLabel.setText(Integer.toString(razlika));
				}catch(Exception error) {
					JOptionPane.showMessageDialog(null, "Invalid Number!!");
				}
			}
		});
		btnSub.setBounds(383, 148, 204, 52);
		frame.getContentPane().add(btnSub);
		
		lblNewLabel = new JLabel("Answer!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(271, 284, 147, 44);
		frame.getContentPane().add(lblNewLabel);
	}
}
