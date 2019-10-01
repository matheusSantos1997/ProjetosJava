package pct_gui13;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "unused", "serial" })
public class SomaDeInteirosGUI extends JFrame {

	private JPanel contentPane;
	private JTextField tfNota1;
	private JTextField tfNota2;
	private JTextField tfCalc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SomaDeInteirosGUI frame = new SomaDeInteirosGUI();
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
	public SomaDeInteirosGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float n1, n2, res;
				
				n1 = Float.parseFloat(tfNota1.getText());
				n2 = Float.parseFloat(tfNota2.getText());
				res = n1 + n2;
				tfCalc.setText(String.valueOf(res));
			}
		});
		btnCalc.setBounds(311, 36, 89, 23);
		contentPane.add(btnCalc);
		
		JLabel lbNota1 = new JLabel("Nota 1:");
		lbNota1.setBounds(34, 40, 46, 14);
		contentPane.add(lbNota1);
		
		JLabel lbNota2 = new JLabel("Nota 2:");
		lbNota2.setBounds(34, 80, 46, 14);
		contentPane.add(lbNota2);
		
		tfNota1 = new JTextField();
		tfNota1.setBounds(103, 37, 86, 20);
		contentPane.add(tfNota1);
		tfNota1.setColumns(10);
		
		tfNota2 = new JTextField();
		tfNota2.setBounds(103, 77, 86, 20);
		contentPane.add(tfNota2);
		tfNota2.setColumns(10);
		
		tfCalc = new JTextField();
		tfCalc.setEditable(false);
		tfCalc.setBounds(103, 129, 86, 20);
		contentPane.add(tfCalc);
		tfCalc.setColumns(10);
		
		JLabel lbResultado = new JLabel("Resultado");
		lbResultado.setBounds(34, 132, 59, 14);
		contentPane.add(lbResultado);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfNota1.setText("");
				tfNota2.setText("");
				tfCalc.setText("");
			}
		});
		btnLimpar.setBounds(311, 76, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(311, 128, 89, 23);
		contentPane.add(btnSair);
	}

}
