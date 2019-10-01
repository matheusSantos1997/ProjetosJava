package pct_fonte01;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class CalculoMedia extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfNp1;
	private JTextField tfNp2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculoMedia frame = new CalculoMedia();
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
	public CalculoMedia() {
		setFont(new Font("Arial", Font.BOLD, 12));
		setTitle("Calculadora de M\u00E9dia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 317);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNome = new JLabel("Nome: ");
		lbNome.setFont(new Font("Arial", Font.BOLD, 12));
		lbNome.setBounds(10, 24, 39, 14);
		contentPane.add(lbNome);
		
		JLabel lbNp1 = new JLabel("Digite a primeira nota: ");
		lbNp1.setFont(new Font("Arial", Font.BOLD, 12));
		lbNp1.setBounds(10, 46, 127, 14);
		contentPane.add(lbNp1);
		
		JLabel lbNp2 = new JLabel("Digite a segunda nota: ");
		lbNp2.setFont(new Font("Arial", Font.BOLD, 12));
		lbNp2.setBounds(10, 71, 138, 14);
		contentPane.add(lbNp2);
		
		tfNome = new JTextField();
		tfNome.setBounds(59, 22, 390, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfNp1 = new JTextField();
		tfNp1.setBounds(147, 44, 86, 20);
		contentPane.add(tfNp1);
		tfNp1.setColumns(10);
		
		tfNp2 = new JTextField();
		tfNp2.setBounds(147, 69, 86, 20);
		contentPane.add(tfNp2);
		tfNp2.setColumns(10);
		
		JLabel lbResultado = new JLabel("Resultado:");
		lbResultado.setFont(new Font("Arial", Font.BOLD, 12));
		lbResultado.setBounds(10, 148, 60, 14);
		contentPane.add(lbResultado);
		
		JLabel lbFinal = new JLabel("");
		lbFinal.setFont(new Font("Arial", Font.BOLD, 12));
		lbFinal.setBounds(80, 148, 369, 14);
		contentPane.add(lbFinal);
		
		JLabel lbDecisão = new JLabel("");
		lbDecisão.setFont(new Font("Arial", Font.BOLD, 12));
		lbDecisão.setBounds(10, 173, 439, 14);
		contentPane.add(lbDecisão);
		
		JButton btnCalcular = new JButton("Mostrar Resultado");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Nome;
				Nome = tfNome.getText();
				float n1, n2, media;
				
				n1 = Float.parseFloat(tfNp1.getText());
				n2 = Float.parseFloat(tfNp2.getText());
				JOptionPane.showMessageDialog(null, "Nome: Matheus Jardim da Costa Santos"
						+ "\nRA:D943D-7 truma:CC4P41");
				media = ((n1*4)+(n2*6))/10;
				lbFinal.setText(String.valueOf(media));
				
				if (media <= 10 && media > 9) {
					lbDecisão.setText("O aluno " + Nome + " está aprovado com aproveitamento A");
				} else if(media <= 9 && media >= 7) {
					lbDecisão.setText("O aluno " + Nome + " está aprovado com aproveitamento B");
				} else if(media < 7 && media >= 3) {
					lbDecisão.setText("O aluno " + Nome + " está de Exame com aproveitamento C");
				} else if(media <= 3 && media >= 0) {
					lbDecisão.setText("O aluno " + Nome + " está de DP com aproveitamento D");
				}
			}
		});
		
		
		btnCalcular.setBounds(10, 223, 127, 23);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfNome.setText("");
				tfNp1.setText("");
				tfNp2.setText("");
				lbFinal.setText("");
				lbDecisão.setText("");
			}
		});
		btnLimpar.setBounds(198, 223, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(348, 223, 89, 23);
		contentPane.add(btnSair);
	}
}
