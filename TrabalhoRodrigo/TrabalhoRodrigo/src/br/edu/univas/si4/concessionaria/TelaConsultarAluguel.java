package br.edu.univas.si4.concessionaria;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class TelaConsultarAluguel extends JFrame implements ActionListener{
	

	private static final long serialVersionUID = -8959929089789240920L;

	private JPanel centerPanel = null;
	
	private ArrayList<Aluguel> alugueis2;
	
	private JTable table;
	
	JButton searchButton = new JButton();
	
	TelaAluguel consulta = new TelaAluguel();
	
	public TelaConsultarAluguel(){
		this.setTitle("Consultar Aluguel");
		this.setSize(500, 500);
		this.setResizable(false);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.alugueis2 = consulta.listar();
		addComponents();
	}

	private void addComponents() {
	
			
		this.getContentPane().setLayout(new BorderLayout());
			
		JPanel northPanel = new JPanel();
		northPanel.setBackground(Color.LIGHT_GRAY);
		createButtons(northPanel);
		
		centerPanel = new JPanel();
		this.createList(centerPanel);
			
		this.getContentPane().add(northPanel, BorderLayout.NORTH);
		this.getContentPane().add(centerPanel, BorderLayout.CENTER);
			
		}

		public JPanel getCenterPanel(){
			
			return centerPanel;
			
		}
		
		
		public void createButtons(JPanel panel){
			
			JLabel fabricante = new JLabel();
			fabricante.setText("Fabricante: ");
			panel.add(fabricante);
			
			JTextField TextFabricante = new JTextField();
			TextFabricante.setColumns(20);
			panel.add(TextFabricante);
			
			searchButton.setText("Pesquisar");
			searchButton.addActionListener(this);
			panel.add(searchButton);
			
			
			
		}
		
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == searchButton){
				
			}
		}
		
		public void createList(JPanel listPanel){
			
			listPanel.setLayout(new GridBagLayout());
			GridBagConstraints gbc = new GridBagConstraints();
			
			Vector<String> columnNames = new Vector<>();
			columnNames.add("Nome");
			columnNames.add("CPF");
			columnNames.add("Data");
			columnNames.add("Modelo");
			columnNames.add("Placa");
			
			table = new JTable(null, columnNames);
			table.setFillsViewportHeight(true);
			ListCarros(alugueis2);
			
			JScrollPane tableScroll = new JScrollPane(table);
			tableScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			tableScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			gbc.gridx = 0;
			gbc.gridy = 0;
			gbc.weightx = 1.0;
			gbc.insets = new Insets(1, 1, 1, 1);
			gbc.anchor = GridBagConstraints.CENTER;
			listPanel.add(tableScroll,gbc);
		}

		private void ListCarros(ArrayList<Aluguel> alugueis) {
			DefaultTableModel dtm = (DefaultTableModel) table.getModel();
			dtm.setRowCount(0);
			
			for (Aluguel aluguel : alugueis) {
				dtm.addRow(new Object[] {
						aluguel.getNome(),
						aluguel.getCpf(),
						aluguel.getData(),
						aluguel.getModelo(),
						aluguel.getPlaca()
				});
			} 
			
		}
		
	}
