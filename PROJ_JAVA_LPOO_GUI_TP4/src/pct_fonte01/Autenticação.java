package pct_fonte01;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Autenticação extends JFrame {

	private JPanel contentPane;
	private JTextField tfUser;
	String TrueUser = "Professor";
	String TruePass = "ProfUnip";
	private JPasswordField pfPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Autenticação frame = new Autenticação();
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
	public Autenticação() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbUsuario = new JLabel("Usu\u00E1rio:");
		lbUsuario.setFont(new Font("Arial", Font.BOLD, 12));
		lbUsuario.setBounds(85, 69, 53, 14);
		contentPane.add(lbUsuario);
		
		tfUser = new JTextField();
		tfUser.setBounds(148, 67, 134, 20);
		contentPane.add(tfUser);
		tfUser.setColumns(10);
		
		JLabel lbSenha = new JLabel("Senha:");
		lbSenha.setFont(new Font("Arial", Font.BOLD, 12));
		lbSenha.setBounds(85, 134, 46, 14);
		contentPane.add(lbSenha);
		
		pfPass = new JPasswordField();
		pfPass.setBounds(148, 132, 134, 20);
		contentPane.add(pfPass);
		
		JButton btnAutenticar = new JButton("Autenticar");
		btnAutenticar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String Pass;
			String User;
				User = tfUser.getText();
				Pass = String.copyValueOf(pfPass.getPassword());
				if(User.equals("Professor") && Pass.equals("1234")) {
					JOptionPane.showMessageDialog(null, "Nome: Matheus Jardim da Costa Santos" 
				+  "\nRA:D1943D-7 truma:CC4P41");
					JOptionPane.showMessageDialog(null, "Bem vindo ao Sistema de Notas");
					CalculoMedia frame = new CalculoMedia();
					frame.setVisible(true);
					dispose();//esconde o primeiro frame após ir pra outro
				} else {
					JOptionPane.showMessageDialog(null, "Nome: Matheus Jardim da Costa Santos"
							+ "\nRA:D1943D-7 truma:CC4P41");
					JOptionPane.showMessageDialog(null, "Usuário ou Senha incorretos");
				}
			}
		});
		
		
		btnAutenticar.setBounds(136, 199, 146, 23);
		contentPane.add(btnAutenticar);
	}
}
