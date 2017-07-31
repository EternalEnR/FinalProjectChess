package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.General;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private General controller;
	private JPasswordField passwordField;
	private JTextField textField;
	private JButton btnSignIn;
	private JButton btnSignUp;

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setTitle("Login");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnSignUp = new JButton("Sign Up!");
		btnSignUp.setBounds(263, 399, 89, 23);
		contentPane.add(btnSignUp);
		
		btnSignIn = new JButton("Sign In");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSignIn.setEnabled(false);
		btnSignIn.setBounds(169, 315, 156, 40);
		contentPane.add(btnSignIn);
		
		JLabel lblDontHaveAn = new JLabel("Don't Have An Account?");
		lblDontHaveAn.setHorizontalAlignment(SwingConstants.CENTER);
		lblDontHaveAn.setForeground(Color.WHITE);
		lblDontHaveAn.setBounds(123, 403, 130, 14);
		contentPane.add(lblDontHaveAn);
		
		JLabel lblChessGame = new JLabel("Chess Game !");
		lblChessGame.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 23));
		lblChessGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblChessGame.setForeground(Color.WHITE);
		lblChessGame.setBackground(Color.WHITE);
		lblChessGame.setBounds(245, 47, 156, 54);
		contentPane.add(lblChessGame);
		
		JLabel lblUserName = new JLabel("User name");
		lblUserName.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUserName.setForeground(Color.WHITE);
		lblUserName.setBounds(201, 138, 89, 23);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(201, 225, 89, 23);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				if (textField.getText().length()>0 && passwordField.getText().length()>0){
					btnSignIn.setEnabled(true);
				}
				else btnSignIn.setEnabled(false);
			}
		});
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(123, 256, 245, 40);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				if (textField.getText().length()>0&&passwordField.getText().length()>0){
					btnSignIn.setEnabled(true);
				}
				else btnSignIn.setEnabled(false);
			}
		});
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(123, 174, 245, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(LoginFrame.class.getResource("/pictures/Background.jpg")));
		label.setBounds(-1, 0, 494, 456);
		contentPane.add(label);
	}
	
	public void setController(General controller){
		this.controller=controller;
	}
	public General getController(){
		return controller;
	}
}
