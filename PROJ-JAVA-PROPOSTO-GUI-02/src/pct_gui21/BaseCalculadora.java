package pct_gui21;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "unused", "serial" })
public class BaseCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField tfValorDolar;
	private JTextField tfCotacaoDia;
	private JTextField tfValorReal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BaseCalculadora frame = new BaseCalculadora();
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
	public BaseCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 312);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Valor em Dolar (US$):");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(26, 49, 154, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCotao = new JLabel("Cota\u00E7\u00E3o do dia: ");
		lblCotao.setHorizontalAlignment(SwingConstants.CENTER);
		lblCotao.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCotao.setBounds(26, 103, 154, 14);
		contentPane.add(lblCotao);
		
		JLabel lblValorEmReal = new JLabel("Valor em Real(R$): ");
		lblValorEmReal.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorEmReal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValorEmReal.setBounds(26, 143, 154, 14);
		contentPane.add(lblValorEmReal);
		
		tfValorDolar = new JTextField();
		tfValorDolar.setBounds(231, 48, 127, 20);
		contentPane.add(tfValorDolar);
		tfValorDolar.setColumns(10);
		
		tfCotacaoDia = new JTextField();
		tfCotacaoDia.setBounds(231, 97, 127, 20);
		contentPane.add(tfCotacaoDia);
		tfCotacaoDia.setColumns(10);
		
		tfValorReal = new JTextField();
		tfValorReal.setEditable(false);
		tfValorReal.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfValorReal.setBounds(230, 142, 127, 20);
		contentPane.add(tfValorReal);
		tfValorReal.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double valorDolar, cotagemDia, valorReal = 0;
				
				valorDolar = Double.parseDouble(tfValorDolar.getText());
				cotagemDia = Double.parseDouble(tfCotacaoDia.getText());
				
				valorReal = valorDolar * cotagemDia;
				
				tfValorReal.setText(String.valueOf(valorReal));	
				
			}
		});
		btnCalcular.setBounds(46, 212, 107, 34);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfValorDolar.setText("");
				tfCotacaoDia.setText("");
				tfValorReal.setText("");
			}
		});
		btnLimpar.setBounds(191, 212, 112, 34);
		contentPane.add(btnLimpar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
			}
		});
		btnSair.setBounds(325, 212, 118, 34);
		contentPane.add(btnSair);
	}
}
