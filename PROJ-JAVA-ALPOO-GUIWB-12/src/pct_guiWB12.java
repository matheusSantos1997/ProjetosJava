import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "unused", "serial" })
public class pct_guiWB12 extends JFrame {

	private JPanel contentPane;
	private JTextField tfCalc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pct_guiWB12 frame = new pct_guiWB12();
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
	@SuppressWarnings("rawtypes")
	public pct_guiWB12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fatorial");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(64, 39, 68, 17);
		contentPane.add(lblNewLabel);
		
		JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox.setBounds(226, 39, 76, 20);
		contentPane.add(comboBox);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero;
				float fatorial = 1;
				
				//pegando o valor do combo box
				Object n = comboBox.getSelectedItem(); 
				numero = Integer.parseInt("" + n); //converte para inteiro e armazenou na variável
				
				for(int i=1; i <= numero;i++)
				{
				 fatorial = fatorial * i;
				 
				 //enviou o resultado para o textfield
				 tfCalc.setText(String.valueOf(fatorial));
				 
				}
			}
		});
		btnCalcular.setBounds(212, 98, 101, 33);
		contentPane.add(btnCalcular);
		
		tfCalc = new JTextField();
		tfCalc.setEnabled(false);
		tfCalc.setBounds(64, 101, 101, 26);
		contentPane.add(tfCalc);
		tfCalc.setColumns(10);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(213, 153, 100, 33);
		contentPane.add(btnSair);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfCalc.setText(""); 
			}
		});
		btnLimpar.setBounds(64, 153, 101, 33);
		contentPane.add(btnLimpar);
	}
}
