package pct_guiWB11;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;

@SuppressWarnings({ "unused", "serial" })
public class MediaGUIcomWB extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfNota1;
	private JTextField tfNota2;
	private JTextField tfLista;
	private JTextField tfMedia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MediaGUIcomWB frame = new MediaGUIcomWB();
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
	public MediaGUIcomWB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNome = new JLabel("Nome");
		lbNome.setBounds(31, 26, 46, 14);
		contentPane.add(lbNome);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBackground(UIManager.getColor("Button.background"));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float Nota1, Nota2, Lista, Calcular;
				
				Nota1 = Float.parseFloat(tfNota1.getText());
				Nota2 = Float.parseFloat(tfNota1.getText());
				Lista = Float.parseFloat(tfNota1.getText());
				Calcular = Nota1 + Nota2/Lista;
				tfMedia.setText(String.valueOf(Calcular));
				
				if(Calcular >= 7) {
					JOptionPane.showMessageDialog(null,"Você passou!");
				} 
				else {
					JOptionPane.showMessageDialog(null,"Reprovou, saia do Rainbow six!");
				}
			}
		});
		btnCalcular.setBounds(299, 26, 97, 38);
		contentPane.add(btnCalcular);
		
		tfNome = new JTextField();
		tfNome.setBounds(87, 23, 117, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lbNota1 = new JLabel("Nota 1");
		lbNota1.setBounds(31, 61, 46, 14);
		contentPane.add(lbNota1);
		
		tfNota1 = new JTextField();
		tfNota1.setBounds(87, 58, 117, 20);
		contentPane.add(tfNota1);
		tfNota1.setColumns(10);
		
		JLabel lbNota2 = new JLabel("Nota2");
		lbNota2.setBounds(31, 98, 46, 14);
		contentPane.add(lbNota2);
		
		tfNota2 = new JTextField();
		tfNota2.setBounds(87, 95, 117, 20);
		contentPane.add(tfNota2);
		tfNota2.setColumns(10);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tfNota1.setText("");
				tfNota2.setText("");
				tfNome.setText("");
				tfLista.setText("");
				tfMedia.setText("");
			}
		});
		btnLimpar.setBounds(299, 86, 97, 38);
		contentPane.add(btnLimpar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancelar.setBounds(299, 151, 97, 38);
		contentPane.add(btnCancelar);
		
		JLabel lbLista = new JLabel("Lista");
		lbLista.setBounds(31, 140, 46, 14);
		contentPane.add(lbLista);
		
		tfLista = new JTextField();
		tfLista.setBounds(87, 137, 117, 20);
		contentPane.add(tfLista);
		tfLista.setColumns(10);
		
		JLabel lbMedia = new JLabel("M\u00E9dia");
		lbMedia.setBounds(31, 178, 46, 14);
		contentPane.add(lbMedia);
		
		tfMedia = new JTextField();
		tfMedia.setEditable(false);
		tfMedia.setBounds(87, 175, 117, 20);
		contentPane.add(tfMedia);
		tfMedia.setColumns(10);
	}
}
