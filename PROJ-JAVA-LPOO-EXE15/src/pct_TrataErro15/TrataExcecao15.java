package pct_TrataErro15;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "unused", "serial" })
public class TrataExcecao15 extends JFrame {

	private JPanel contentPane;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrataExcecao15 frame = new TrataExcecao15();
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
	public TrataExcecao15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 272);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Num 1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(48, 41, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Num 2");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(48, 80, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		tfNum1 = new JTextField();
		tfNum1.setBounds(118, 38, 86, 20);
		contentPane.add(tfNum1);
		tfNum1.setColumns(10);
		
		tfNum2 = new JTextField();
		tfNum2.setBounds(118, 77, 86, 20);
		contentPane.add(tfNum2);
		tfNum2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(36, 125, 68, 14);
		contentPane.add(lblNewLabel_2);
		
		tfResultado = new JTextField();
		tfResultado.setEditable(false);
		tfResultado.setBounds(118, 122, 86, 20);
		contentPane.add(tfResultado);
		tfResultado.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				
				try {
					int num1, num2, resultado;
					
					num1 = Integer.parseInt(tfNum1.getText());
					num2 = Integer.parseInt(tfNum2.getText());
					
					resultado = num1 / num2;
					
					tfResultado.setText(String.valueOf(resultado));
					
					
					
				}catch(ArithmeticException e) {
					JOptionPane.showMessageDialog(null,"Não é divisivel por zero!!");
				}
			}
		});
		btnCalcular.setBounds(291, 37, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    
				tfNum1.setText("");
				tfNum2.setText("");
				tfResultado.setText("");
			}
		});
		btnLimpar.setBounds(291, 76, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(291, 116, 89, 23);
		contentPane.add(btnSair);
	}

}
