package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;

public class ClienteGUI extends JFrame {
	
	/*Criar Conexão DAO e Criar também o Objeto Gerente de Imagens
	 * 
	 */
	
	private JPanel contentPane;	
	private JTextField campoNome;
	private JTextField campoEmail;
	private JTextField capoTelefone;
	private JTextField campoPesquisar;
	private JTable table;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteGUI frame = new ClienteGUI();
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
	public ClienteGUI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 427);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 5, 490, 34);
		contentPane.add(panel);
		FlowLayout fl_panel = new FlowLayout(FlowLayout.CENTER, 5, 5);
		fl_panel.setAlignOnBaseline(true);
		panel.setLayout(fl_panel);
		
		JLabel lbl1 = new JLabel("Cadastro de Clientes");
		lbl1.setBackground(SystemColor.windowBorder);
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setForeground(new Color(65, 132, 234));
		lbl1.setFont(new Font("Arial Rounded MT Bold", 1, 11));
		panel.add(lbl1);
		
		campoNome = new JTextField();
		campoNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		campoNome.setFont(new Font("Arial Rounded MT Bold", 1, 11));
		campoNome.setBounds(109, 79, 171, 23);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		campoEmail = new JTextField();
		campoEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		campoEmail.setFont(new Font("Arial Rounded MT Bold", 1, 11));
		campoEmail.setBounds(109, 145, 171, 25);
		contentPane.add(campoEmail);
		campoEmail.setColumns(10);
		
		capoTelefone = new JTextField();
		capoTelefone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		capoTelefone.setBounds(301, 79, 199, 22);
		contentPane.add(capoTelefone);
		capoTelefone.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(UIManager.getBorder("InternalFrame.border"));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 50, 89, 120);
		contentPane.add(panel_3);
		
		JLabel campoImagemCliente = new JLabel("");
		campoImagemCliente.setHorizontalAlignment(SwingConstants.CENTER);
		campoImagemCliente.setBackground(new Color(240, 240, 240));
		campoImagemCliente.setIcon(new ImageIcon(ClienteGUI.class.getResource("/imgs/cliente.PNG")));
		panel_3.add(campoImagemCliente);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Arial", Font.BOLD, 12));
		lblNome.setBounds(109, 56, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Arial", Font.BOLD, 12));
		lblTelefone.setBounds(359, 54, 56, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Arial", Font.BOLD, 12));
		lblEmail.setBounds(109, 120, 46, 14);
		contentPane.add(lblEmail);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(SystemColor.textText);
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Sexo", TitledBorder.LEFT, TitledBorder.TOP, null, Color.BLACK));
		panel_2.setToolTipText("");
		panel_2.setBackground(UIManager.getColor("ToggleButton.highlight"));
		panel_2.setBounds(311, 122, 189, 55);
		contentPane.add(panel_2);
		
		JRadioButton campoMasculino = new JRadioButton("Masculino");
		campoMasculino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGroup.add(campoMasculino);
		campoMasculino.setBackground(new Color(255, 255, 255));
		panel_2.add(campoMasculino);
		
		JRadioButton campoFeminino = new JRadioButton("Feminino");
		campoFeminino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGroup.add(campoFeminino);
		campoFeminino.setBackground(new Color(255, 255, 255));
		panel_2.add(campoFeminino);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 181, 490, 49);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalvar.setBounds(22, 11, 95, 21);
		panel_1.add(btnSalvar);
		btnSalvar.setFont(new Font("Arial", Font.BOLD, 11));
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExcluir.setBounds(131, 11, 86, 21);
		panel_1.add(btnExcluir);
		btnExcluir.setFont(new Font("Arial", Font.BOLD, 11));
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(273, 11, 23, 29);
		panel_1.add(lblNewLabel_6);
		lblNewLabel_6.setIcon(new ImageIcon(ClienteGUI.class.getResource("/imgs/pesquisar.PNG")));
		
		campoPesquisar = new JTextField();
		campoPesquisar.setBounds(306, 11, 174, 27);
		panel_1.add(campoPesquisar);
		campoPesquisar.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(10, 241, 490, 120);
		contentPane.add(panel_4);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(452, 13, 17, 64);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 13, 470, 96);
		panel_4.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBackground(new Color(255, 255, 255));
		table.setBorder(null);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setFont(new Font("Arial", table.getFont().getStyle(), table.getFont().getSize()));
		table.setModel(new javax.swing.table.DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Nome", "Telefone", "E-mail", "Sexo"
			}
			
			
		));
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		panel_4.add(scrollBar);
	}
}
