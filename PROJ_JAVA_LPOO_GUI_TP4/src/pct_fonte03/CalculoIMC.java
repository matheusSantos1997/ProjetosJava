package pct_fonte03;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class CalculoIMC extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private JTextField tfNome;
	private JTextField tfAltura;
	private JTextField tfPeso;
	private final ButtonGroup btngSexo = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String [] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculoIMC frame = new CalculoIMC();
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
	public CalculoIMC() {
		setTitle("IMC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setForeground(new Color(51, 51, 204));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 2), "Entrada de Dados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 204)));
		panel.setBackground(new Color(153, 153, 153));
		panel.setBounds(10, 11, 598, 222);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbNome = new JLabel("Nome:");
		lbNome.setForeground(new Color(51, 51, 204));
		lbNome.setFont(new Font("Arial", Font.BOLD, 12));
		lbNome.setBounds(21, 31, 46, 14);
		panel.add(lbNome);
		
		tfNome = new JTextField();
		tfNome.setBounds(77, 29, 439, 20);
		panel.add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lbAltura = new JLabel("Altura(Metros):");
		lbAltura.setForeground(new Color(51, 51, 204));
		lbAltura.setFont(new Font("Arial", Font.BOLD, 12));
		lbAltura.setBounds(21, 74, 93, 14);
		panel.add(lbAltura);
		
		tfAltura = new JTextField();
		tfAltura.setBounds(113, 72, 103, 20);
		panel.add(tfAltura);
		tfAltura.setColumns(10);
		
		JLabel lbPeso = new JLabel("Peso:");
		lbPeso.setFont(new Font("Arial", Font.BOLD, 12));
		lbPeso.setForeground(new Color(51, 51, 204));
		lbPeso.setBounds(21, 123, 46, 14);
		panel.add(lbPeso);
		
		tfPeso = new JTextField();
		tfPeso.setBounds(77, 121, 86, 20);
		panel.add(tfPeso);
		tfPeso.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Arial", Font.BOLD, 12));
		lblSexo.setForeground(new Color(51, 51, 204));
		lblSexo.setBounds(21, 180, 46, 14);
		panel.add(lblSexo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 2), "Resultado", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 204)));
		panel_1.setBackground(new Color(153, 153, 153));
		panel_1.setBounds(10, 244, 598, 232);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbImc = new JLabel("IMC:");
		lbImc.setForeground(new Color(51, 51, 204));
		lbImc.setFont(new Font("Arial", Font.BOLD, 12));
		lbImc.setBounds(21, 40, 46, 14);
		panel_1.add(lbImc);
		
		JLabel lbIMC = new JLabel("");
		lbIMC.setBounds(181, 41, 124, 14);
		panel_1.add(lbIMC);
		
		JLabel lblPesoIdeal = new JLabel("Peso ideal deve ser:");
		lblPesoIdeal.setFont(new Font("Arial", Font.BOLD, 12));
		lblPesoIdeal.setForeground(new Color(51, 51, 204));
		lblPesoIdeal.setBounds(21, 91, 124, 14);
		panel_1.add(lblPesoIdeal);
		
		JLabel lbPesoI = new JLabel("");
		lbPesoI.setBounds(181, 92, 245, 14);
		panel_1.add(lbPesoI);
		
		JLabel lblObservao = new JLabel("Observa\u00E7\u00E3o:");
		lblObservao.setFont(new Font("Arial", Font.BOLD, 12));
		lblObservao.setForeground(new Color(51, 51, 204));
		lblObservao.setBounds(21, 161, 80, 14);
		panel_1.add(lblObservao);
		
		JLabel lbOb = new JLabel("");
		lbOb.setBounds(181, 162, 124, 14);
		panel_1.add(lbOb);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setFont(new Font("Arial", Font.BOLD, 12));
		rdbtnMasculino.setForeground(new Color(51, 51, 204));
		btngSexo.add(rdbtnMasculino);
		rdbtnMasculino.setBackground(new Color(153, 153, 153));
		rdbtnMasculino.setBounds(77, 177, 109, 23);
		panel.add(rdbtnMasculino);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setForeground(new Color(51, 51, 204));
		rdbtnFeminino.setFont(new Font("Arial", Font.BOLD, 12));
		btngSexo.add(rdbtnFeminino);
		rdbtnFeminino.setBackground(new Color(153, 153, 153));
		rdbtnFeminino.setBounds(225, 177, 109, 23);
		panel.add(rdbtnFeminino);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float h, p, IMC, Pesoidealmaior, Pesoidealmenor;
				h = Float.parseFloat(tfAltura.getText());
				p = Float.parseFloat(tfPeso.getText());
				
				IMC = p/(h*h);
				Pesoidealmaior = (h*h)*24.9f;
				Pesoidealmenor = (h*h)*18.5f;
				
				if (IMC < 18.5) {
					JOptionPane.showMessageDialog(null, "Nome: Matheus Jardim da Costa Santos" 
							+ "\nRA:D1943D-7 truma:CC4P41");
					lbIMC.setText(String.valueOf(IMC));
					lbPesoI.setText(String.valueOf(Pesoidealmenor+" a "+Pesoidealmaior));
					lbOb.setText("Abaixo do Peso");
				} else if (IMC >= 18.5 && IMC <= 24.9) {
					JOptionPane.showMessageDialog(null, "Nome: Matheus Jardim da Costa Santos" 
							+ "\nRA:D1943D-7 truma:CC4P41");
					lbIMC.setText(String.valueOf(IMC));
					lbPesoI.setText(String.valueOf(Pesoidealmenor+" a "+Pesoidealmaior));
					lbOb.setText("Peso Normal");
				} else if (IMC >= 25 && IMC < 29.9) {
					JOptionPane.showMessageDialog(null, "Nome: Matheus Jardim da Costa Santos" 
							+ "\nRA:D1943D-7 truma:CC4P41");
					lbIMC.setText(String.valueOf(IMC));
					lbPesoI.setText(String.valueOf(Pesoidealmenor+" a "+Pesoidealmaior));
					lbOb.setText("Sobrepeso");
				} else if (IMC >= 30 && IMC <= 34.9) {
					JOptionPane.showMessageDialog(null, "Nome: Matheus Jardim da Costa Santos" 
							+ "\nRA:D1943D-7 truma:CC4P41");
					lbIMC.setText(String.valueOf(IMC));
					lbPesoI.setText(String.valueOf(Pesoidealmenor+" a "+Pesoidealmaior));
					lbOb.setText("Obesidade 1° grau");
				} else if (IMC >= 35 && IMC < 40){
					JOptionPane.showMessageDialog(null, "Nome: Matheus Jardim da Costa Santos" 
							+ "\nRA:D1943D-7 truma:CC4P41");
					lbIMC.setText(String.valueOf(IMC));
					lbPesoI.setText(String.valueOf(Pesoidealmenor+" a "+Pesoidealmaior));
					lbOb.setText("Obesidade 2° grau");
				} else {
					JOptionPane.showMessageDialog(null, "Nome: Matheus Jardim da Costa Santos" 
							+ "\nRA:D1943D-7 truma:CC4P41");
					lbIMC.setText(String.valueOf(IMC));
					lbPesoI.setText(String.valueOf(Pesoidealmenor+" a "+Pesoidealmaior));
					lbOb.setText("Obesidade 3° grau");
				}
				
			}
		});
		btnCalcular.setFont(new Font("Arial", Font.BOLD, 12));
		btnCalcular.setForeground(new Color(51, 51, 204));
		btnCalcular.setBounds(453, 71, 89, 23);
		panel.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbIMC.setText("");
				lbPesoI.setText("");
				lbOb.setText("");
				tfAltura.setText("");
				tfPeso.setText("");
				btngSexo.clearSelection();
				tfNome.setText("");
				
			}
		});
		btnLimpar.setFont(new Font("Arial", Font.BOLD, 12));
		btnLimpar.setForeground(new Color(51, 51, 204));
		btnLimpar.setBounds(453, 120, 89, 23);
		panel.add(btnLimpar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setForeground(new Color(51, 51, 204));
		btnSair.setFont(new Font("Arial", Font.BOLD, 12));
		btnSair.setBounds(453, 177, 89, 23);
		panel.add(btnSair);
		
		
	}
}
