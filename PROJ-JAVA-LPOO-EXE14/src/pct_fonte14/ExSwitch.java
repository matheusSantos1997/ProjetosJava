package pct_fonte14;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "unused", "serial" })
public class ExSwitch extends JFrame {

	private JPanel contentPane;
	private JTextField tfMes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExSwitch frame = new ExSwitch();
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
	public ExSwitch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMs = new JLabel("M\u00EAs");
		lblMs.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMs.setHorizontalAlignment(SwingConstants.CENTER);
		lblMs.setBounds(72, 54, 54, 16);
		contentPane.add(lblMs);
		
		JComboBox<?> comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox.setBounds(181, 53, 105, 26);
		contentPane.add(comboBox);
		
		tfMes = new JTextField();
		tfMes.setEnabled(false);
		tfMes.setBounds(175, 101, 111, 20);
		contentPane.add(tfMes);
		tfMes.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int mes;
				
			    //criando um array dos meses
				String listaMes [] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", 
					               "Junho", "Julho", "Agosto", "Setembro", "Outubro", 
					               "Novembro", "Dezembro"};
				
				Object m = comboBox.getSelectedItem(); 
				mes = Integer.parseInt("" + m);
				
				switch(mes) {
				  case 1:
					  tfMes.setText(listaMes[0]);
				 break;
				  case 2:
					  tfMes.setText(listaMes[1]);
			     break;
				  case 3:
					  tfMes.setText(listaMes[2]);
			      break;
				  case 4:
					  tfMes.setText(listaMes[3]);
			      break;
				  case 5:
					  tfMes.setText(listaMes[4]);
			     break;
				  case 6:
					  tfMes.setText(listaMes[5]);
			     break;
				  case 7:
					  tfMes.setText(listaMes[6]);
			     break;
				  case 8:
					  tfMes.setText(listaMes[7]);
			     break;
				  case 9:
					  tfMes.setText(listaMes[8]);
			     break;
			     case 10:
					  tfMes.setText(listaMes[9]);
			     break;
				  case 11:
					  tfMes.setText(listaMes[10]);
			     break;
				  case 12:
					  tfMes.setText(listaMes[11]);
			     break;
				}
				
				//tfCalc.setText(String.valueOf(fatorial));
				
				
				
			}
		});
		btnCalcular.setBounds(55, 182, 105, 33);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    tfMes.setText("");
			}
		});
		btnLimpar.setBounds(185, 182, 101, 33);
		contentPane.add(btnLimpar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(308, 182, 95, 32);
		contentPane.add(btnSair);
	}

}
