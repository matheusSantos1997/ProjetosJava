package pct_swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JToggleButton;
import javax.swing.JProgressBar;

@SuppressWarnings({ "serial", "unused" })
public class ProjetoGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JTextField txtNome;
	private JButton btnMaps;
	private JLabel lblNewLabel_1;
	private JProgressBar progressBar;
	private JButton btnAumentar;
	private JButton btnDiminuir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjetoGUI frame = new ProjetoGUI();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);//abrindo no meio da tela
					frame.setResizable(false); //nao permitir que redimensione o tamanho da tela e desabilita o maximizar
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProjetoGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Fam\u00EDlia\\eclipse-workspace\\ProjetoSwing\\imagens\\check_32.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 391);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb_texto = new JLabel("Este texto aqui");
		lb_texto.addMouseListener(new MouseAdapter() {
			
			//adicionou um evento apos passar o mouse para mudar o texto
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				lb_texto.setText("Mudou o texto");
			
			}
			
			//adicionou um evento apos tirar o mouse em cima do texto
			@Override
			public void mouseExited(MouseEvent e) 
			{
			   lb_texto.setText("Este texto aqui");
			}
			
		});
		lb_texto.setForeground(Color.RED);
		lb_texto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb_texto.setHorizontalAlignment(SwingConstants.CENTER);
		lb_texto.setBounds(10, 11, 143, 17);
		contentPane.add(lb_texto);
		
		textField = new JTextField();
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				textField.setText("Em Cima");
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				textField.setText("");
			}
		});
		textField.setToolTipText("Digite o seu nome aqui...");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(120, 67, 119, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("C\u00F3digo:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(44, 72, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.addMouseListener(new MouseAdapter() {
			
			//quando clicar no componente
			@Override
			public void mouseClicked(MouseEvent e)
			{
				txtNome.setText("clicou no componente!!");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtNome.setText("");
			}
		});
		//action performed - quando pressionar a tecla <ENTER>
		txtNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				txtNome.setText("clicou no componente!!");
			}
			
		});
		txtNome.setBounds(120, 117, 153, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnTeste = new JButton("teste");
		btnTeste.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnTeste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTeste.setIcon(new ImageIcon("C:\\Users\\Fam\u00EDlia\\eclipse-workspace\\ProjetoSwing\\imagens\\user.png"));
		btnTeste.setToolTipText("botao teste");
		btnTeste.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				btnTeste.setForeground(Color.BLUE);
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				btnTeste.setForeground(Color.BLACK);
			}
		});
		btnTeste.setBounds(94, 274, 119, 52);
		contentPane.add(btnTeste);
		
		btnMaps = new JButton("");
		btnMaps.setIcon(new ImageIcon("C:\\Users\\Fam\u00EDlia\\Pictures\\location_50px.png"));
		btnMaps.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					try {
					    java.awt.Desktop.getDesktop().browse( new java.net.URI("http://google.com/maps"));
					}
					catch(URISyntaxException ex) 
					{
				       Logger.getLogger(ProjetoGUI.class.getName()).log(Level.SEVERE, null, ex);
					}
				   }catch(IOException ex) {
					Logger.getLogger(ProjetoGUI.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});
		btnMaps.setBounds(10, 274, 74, 52);
		contentPane.add(btnMaps);
		
		JToggleButton tg_botao = new JToggleButton("botao pressionado");
		tg_botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(tg_botao.isSelected()) {
					lblNewLabel_1.setText("botao pressionado");
					
				}
				else 
				{
					lblNewLabel_1.setText("botao não pressionado");
					
				}
			}
		});
		tg_botao.setBounds(303, 11, 121, 37);
		contentPane.add(tg_botao);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(281, 67, 143, 28);
		contentPane.add(lblNewLabel_1);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(120, 168, 198, 28);
		contentPane.add(progressBar);
		
		btnAumentar = new JButton("Aumentar");
		btnAumentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(progressBar.getValue() >= 0) {
					int i = progressBar.getValue();
					progressBar.setValue(progressBar.getValue() + 10);
					
				}
			}
		});
		btnAumentar.setBounds(120, 207, 99, 23);
		contentPane.add(btnAumentar);
		
		btnDiminuir = new JButton("Diminuir");
		btnDiminuir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(progressBar.getValue() <= 100) {
					int i = progressBar.getValue();
					progressBar.setValue(progressBar.getValue() - 10);
					
				}
			}
		});
		btnDiminuir.setBounds(229, 207, 89, 23);
		contentPane.add(btnDiminuir);
	}
}
