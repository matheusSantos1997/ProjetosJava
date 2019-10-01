package pct_fonte04;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class ConfirmarEntrada extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfEndereco;
	private JTextField tfCidade;
	private JTextField tfEmail;
	private final ButtonGroup btngEstadoCivil = new ButtonGroup();
	private final ButtonGroup btngSexo = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfirmarEntrada frame = new ConfirmarEntrada();
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ConfirmarEntrada() {
		setTitle("Formul\u00E1rio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 773, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Entrada = new JPanel();
		Entrada.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Entrada de Dados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 100, 0)));
		Entrada.setBounds(10, 11, 737, 152);
		contentPane.add(Entrada);
		Entrada.setLayout(null);
		
		JLabel lbNome = new JLabel("Nome:");
		lbNome.setFont(new Font("Arial", Font.BOLD, 12));
		lbNome.setForeground(new Color(0, 100, 0));
		lbNome.setBounds(10, 24, 46, 14);
		Entrada.add(lbNome);
		
		JLabel lbEndereco = new JLabel("Endere\u00E7o:");
		lbEndereco.setFont(new Font("Arial", Font.BOLD, 12));
		lbEndereco.setForeground(new Color(0, 100, 0));
		lbEndereco.setBounds(10, 49, 57, 14);
		Entrada.add(lbEndereco);
		
		JLabel lbCidade = new JLabel("Cidade:");
		lbCidade.setFont(new Font("Arial", Font.BOLD, 12));
		lbCidade.setForeground(new Color(0, 100, 0));
		lbCidade.setBounds(10, 76, 46, 14);
		Entrada.add(lbCidade);
		
		JLabel lbCEP = new JLabel("CEP:");
		lbCEP.setFont(new Font("Arial", Font.BOLD, 12));
		lbCEP.setForeground(new Color(0, 100, 0));
		lbCEP.setBounds(10, 106, 26, 14);
		Entrada.add(lbCEP);
		
		JLabel lbUF = new JLabel("UF:");
		lbUF.setFont(new Font("Arial", Font.BOLD, 12));
		lbUF.setForeground(new Color(0, 100, 0));
		lbUF.setBounds(618, 107, 26, 14);
		Entrada.add(lbUF);
		
		JComboBox cmbUF = new JComboBox();
		cmbUF.setModel(new DefaultComboBoxModel(new String[] {"--", "SP", "PR", "RR", "TO", "MG", "AM", "RJ", "MA"}));
		cmbUF.setBounds(654, 104, 57, 20);
		Entrada.add(cmbUF);
		
		tfNome = new JTextField();
		tfNome.setBounds(66, 22, 628, 20);
		Entrada.add(tfNome);
		tfNome.setColumns(10);
		
		tfEndereco = new JTextField();
		tfEndereco.setBounds(77, 47, 617, 20);
		Entrada.add(tfEndereco);
		tfEndereco.setColumns(10);
		
		tfCidade = new JTextField();
		tfCidade.setBounds(66, 74, 284, 20);
		Entrada.add(tfCidade);
		tfCidade.setColumns(10);
		
		JFormattedTextField ftfCEP = new JFormattedTextField();
		try {
			ftfCEP.setFormatterFactory(new DefaultFormatterFactory(
				new MaskFormatter("#####-###")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		ftfCEP.setBounds(46, 104, 141, 20);
		Entrada.add(ftfCEP);
		
		JPanel OutrasInfo = new JPanel();
		OutrasInfo.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Outras informa\u00E7\u00F5es", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 100, 0)));
		OutrasInfo.setBounds(10, 174, 737, 172);
		contentPane.add(OutrasInfo);
		OutrasInfo.setLayout(null);
		
		JLabel lbTelefone = new JLabel("Telefone:");
		lbTelefone.setFont(new Font("Arial", Font.BOLD, 12));
		lbTelefone.setForeground(new Color(0, 100, 0));
		lbTelefone.setBounds(10, 28, 57, 14);
		OutrasInfo.add(lbTelefone);
		
		JLabel lbFax = new JLabel("Fax:");
		lbFax.setFont(new Font("Arial", Font.BOLD, 12));
		lbFax.setForeground(new Color(0, 100, 0));
		lbFax.setBounds(505, 28, 29, 14);
		OutrasInfo.add(lbFax);
		
		JLabel lbEmail = new JLabel("E-mail:");
		lbEmail.setFont(new Font("Arial", Font.BOLD, 12));
		lbEmail.setForeground(new Color(0, 100, 0));
		lbEmail.setBounds(10, 53, 46, 14);
		OutrasInfo.add(lbEmail);
		
		JLabel lbEstadoCivil = new JLabel("Estado C\u00EDvil:");
		lbEstadoCivil.setFont(new Font("Arial", Font.BOLD, 12));
		lbEstadoCivil.setForeground(new Color(0, 100, 0));
		lbEstadoCivil.setBounds(10, 87, 75, 14);
		OutrasInfo.add(lbEstadoCivil);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Arial", Font.BOLD, 12));
		lblSexo.setForeground(new Color(0, 100, 0));
		lblSexo.setBounds(10, 123, 46, 14);
		OutrasInfo.add(lblSexo);
		
		JRadioButton rdbtnSolteiro = new JRadioButton("Solteiro(a)");
		btngEstadoCivil.add(rdbtnSolteiro);
		rdbtnSolteiro.setFont(new Font("Arial", Font.BOLD, 12));
		rdbtnSolteiro.setForeground(new Color(0, 100, 0));
		rdbtnSolteiro.setBounds(91, 84, 109, 23);
		OutrasInfo.add(rdbtnSolteiro);
		
		JRadioButton rdbtnCasado = new JRadioButton("Casado(a)");
		btngEstadoCivil.add(rdbtnCasado);
		rdbtnCasado.setForeground(new Color(0, 100, 0));
		rdbtnCasado.setFont(new Font("Arial", Font.BOLD, 12));
		rdbtnCasado.setBounds(202, 83, 109, 23);
		OutrasInfo.add(rdbtnCasado);
		
		JRadioButton rdbtnDivorciado = new JRadioButton("Divorciado(a)");
		btngEstadoCivil.add(rdbtnDivorciado);
		rdbtnDivorciado.setForeground(new Color(0, 100, 0));
		rdbtnDivorciado.setFont(new Font("Arial", Font.BOLD, 12));
		rdbtnDivorciado.setBounds(313, 84, 109, 23);
		OutrasInfo.add(rdbtnDivorciado);
		
		JFormattedTextField ftfTelefone = new JFormattedTextField();
		try {
			ftfTelefone.setFormatterFactory(new DefaultFormatterFactory(
				new MaskFormatter("(###)#####-####")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		ftfTelefone.setBounds(77, 26, 184, 20);
		OutrasInfo.add(ftfTelefone);
		
		JFormattedTextField ftfFax = new JFormattedTextField();
		try {
			ftfFax.setFormatterFactory(new DefaultFormatterFactory(
				new MaskFormatter("(###)####-####")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		ftfFax.setBounds(544, 26, 163, 20);
		OutrasInfo.add(ftfFax);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(66, 51, 641, 20);
		OutrasInfo.add(tfEmail);
		tfEmail.setColumns(10);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		btngSexo.add(rdbtnMasculino);
		rdbtnMasculino.setForeground(new Color(0, 100, 0));
		rdbtnMasculino.setFont(new Font("Arial", Font.BOLD, 12));
		rdbtnMasculino.setBounds(62, 120, 109, 23);
		OutrasInfo.add(rdbtnMasculino);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		btngSexo.add(rdbtnFeminino);
		rdbtnFeminino.setFont(new Font("Arial", Font.BOLD, 12));
		rdbtnFeminino.setForeground(new Color(0, 100, 0));
		rdbtnFeminino.setBounds(173, 119, 109, 23);
		OutrasInfo.add(rdbtnFeminino);
		
		JPanel Acoes = new JPanel();
		Acoes.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "A\u00E7\u00F5es", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 100, 0)));
		Acoes.setBounds(10, 357, 737, 115);
		contentPane.add(Acoes);
		Acoes.setLayout(null);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nome: Matheus Jardim da Costa Santos" 
						+ "\nRA:D1943D-7 truma:CC4P41");
				if (tfNome.getText().isEmpty() && tfEmail.getText().isEmpty() && ftfCEP.getText().isEmpty() && ftfTelefone.getText().isEmpty() && ftfFax.getText().isEmpty() && tfCidade.getText().isEmpty() && 
						tfEndereco.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Ah campos que precisam ser preenchidos");
				} else {
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso !!!");
				}
			}
		});
		btnConfirmar.setFont(new Font("Arial", Font.BOLD, 12));
		btnConfirmar.setForeground(new Color(0, 100, 0));
		btnConfirmar.setBounds(46, 49, 89, 23);
		Acoes.add(btnConfirmar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btngEstadoCivil.clearSelection();
				btngSexo.clearSelection();
				tfNome.setText("");
				tfEndereco.setText("");
				tfCidade.setText("");
				tfEmail.setText("");
				ftfCEP.setValue(null);
				ftfTelefone.setValue(null);
				ftfFax.setValue(null);
				cmbUF.setSelectedIndex(0);
				
			}
		});
		btnLimpar.setFont(new Font("Arial", Font.BOLD, 12));
		btnLimpar.setForeground(new Color(0, 100, 0));
		btnLimpar.setBounds(323, 50, 89, 23);
		Acoes.add(btnLimpar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setFont(new Font("Arial", Font.BOLD, 12));
		btnSair.setForeground(new Color(0, 100, 0));
		btnSair.setBounds(612, 50, 89, 23);
		Acoes.add(btnSair);
	}
}
