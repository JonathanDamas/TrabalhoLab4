package br.edu.univas.si4.concessionaria;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaAluguel extends JFrame implements ActionListener {
	
	private Aluguel aluguel;
	
	private static ArrayList<Aluguel> alugueis = new ArrayList<Aluguel>();
	
	private static final long serialVersionUID = 4253440926691625229L;
	private JTextField nomeTextField;
	private JTextField cpfTextField;
	private JTextField dataTextField;
	private JTextField modeloTextField;
	private JTextField placaTextField;
	
	JButton addButton = new JButton();
	
	private JPanel painel = null;
	
	public TelaAluguel(){
		this.setTitle("Tela Aluguel");
		this.setSize(300, 300);
	//	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		setContentPane();
		addComponent();
	}

	private void setContentPane() {
		painel = new JPanel();
		setContentPane(painel);
	}

	private void addComponent() {
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel nomeLabel = new JLabel();
		nomeLabel.setText("Nome do Cliente: ");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.insets = new Insets(15, 15, 10, 10);
		this.add(nomeLabel,gbc);
		
		nomeTextField = new JTextField();
		gbc.gridx = 1; // COLUNA
		gbc.gridy = 0; // LINHA
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15, 0, 10, 15);
		gbc.anchor = GridBagConstraints.CENTER;
		this.add(nomeTextField, gbc);
		
		JLabel cpfLabel = new JLabel();
		cpfLabel.setText("CPF: ");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.insets = new Insets(15, 15, 10, 10);
		this.add(cpfLabel,gbc);
		
		cpfTextField = new JTextField();
		gbc.gridx = 1; // COLUNA
		gbc.gridy = 1; // LINHA
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15, 0, 10, 15);
		gbc.anchor = GridBagConstraints.CENTER;
		this.add(cpfTextField, gbc);
		
		
		JLabel dataLabel = new JLabel();
		dataLabel.setText("Data de Aluguel: ");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.weightx = 0;
		gbc.insets = new Insets(15, 15, 10, 15);
		gbc.anchor = GridBagConstraints.LINE_END;
		this.add(dataLabel, gbc);
		
		dataTextField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15, 0, 10, 15);
		gbc.anchor = GridBagConstraints.LINE_START;
		this.add(dataTextField, gbc);
		
		JLabel descricaoLabel = new JLabel();
		descricaoLabel.setText("Modelo Veiculo: ");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.weightx = 0;
		gbc.insets = new Insets(15, 15, 10, 15);
		gbc.anchor = GridBagConstraints.LINE_END;
		this.add(descricaoLabel, gbc);
		
		modeloTextField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15, 0, 10, 15);
		gbc.anchor = GridBagConstraints.LINE_START;
		this.add(modeloTextField, gbc);
		
		JLabel tipoLabel = new JLabel();
		tipoLabel.setText("Placa: ");
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.weightx = 0;
		gbc.insets = new Insets(15, 15, 10, 15);
		gbc.anchor = GridBagConstraints.LINE_END;
		this.add(tipoLabel, gbc);
		
		placaTextField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15, 0, 10, 15);
		gbc.anchor = GridBagConstraints.LINE_START;
		this.add(placaTextField, gbc);
		
//		JButton addButton = new JButton();
		addButton.setText("Salvar");
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.weightx = 0;
		gbc.gridwidth = 2; // NUMERO DE COLUNAS QUE IRA OCUPAR
		gbc.insets = new Insets(15, 0, 10, 15);
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;
		addButton.addActionListener(this);
		this.add(addButton, gbc);
		
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == addButton){
			
			aluguel = new Aluguel();
			
			aluguel.setNome(nomeTextField.getText());
			aluguel.setCpf(cpfTextField.getText());
			aluguel.setData(dataTextField.getText());
			aluguel.setModelo(modeloTextField.getText());
			aluguel.setPlaca(placaTextField.getText());
			alugueis.add(aluguel);
			JOptionPane.showMessageDialog(null, "Aluguel cadastrado com sucesso");
			cleanFields();
			}
		}
	private void cleanFields() {
		nomeTextField.setText(null);
		cpfTextField.setText(null);
		dataTextField.setText(null);
		modeloTextField.setText(null);
		placaTextField.setText(null);
	}
	
	public ArrayList<Aluguel> listar() {
		return alugueis;
	}
}
