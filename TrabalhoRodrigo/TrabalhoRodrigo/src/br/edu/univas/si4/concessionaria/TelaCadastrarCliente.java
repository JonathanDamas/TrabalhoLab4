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

public class TelaCadastrarCliente extends JFrame implements ActionListener{

	private static final long serialVersionUID = -4896590801548222199L;

	private Cliente cliente;
	
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	private JTextField nomeTextField;
	private JTextField enderecoTextField;
	private JTextField cpfTextField;
	private JTextField telefoneTextField;
	
	private JPanel painel = null;
	
	JButton salveButton = new JButton();
	
	public TelaCadastrarCliente(){
		
		this.setTitle("Cadastrar Cliente");
		this.setSize(350, 250);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JLabel enderecoLabel = new JLabel();
		enderecoLabel.setText("Endereco: ");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.insets = new Insets(15, 15, 10, 10);
		this.add(enderecoLabel,gbc);
		
		enderecoTextField = new JTextField();
		gbc.gridx = 1; // COLUNA
		gbc.gridy = 1; // LINHA
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15, 0, 10, 15);
		gbc.anchor = GridBagConstraints.CENTER;
		this.add(enderecoTextField, gbc);
		
		
		JLabel cpfLabel = new JLabel();
		cpfLabel.setText("CPF: ");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.weightx = 0;
		gbc.insets = new Insets(15, 15, 10, 15);
		gbc.anchor = GridBagConstraints.LINE_END;
		this.add(cpfLabel, gbc);
		
		cpfTextField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15, 0, 10, 15);
		gbc.anchor = GridBagConstraints.LINE_START;
		this.add(cpfTextField, gbc);
		
		JLabel telefoneLabel = new JLabel();
		telefoneLabel.setText("Telefone: ");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.weightx = 0;
		gbc.insets = new Insets(15, 15, 10, 15);
		gbc.anchor = GridBagConstraints.LINE_END;
		this.add(telefoneLabel, gbc);
		
		telefoneTextField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15, 0, 10, 15);
		gbc.anchor = GridBagConstraints.LINE_START;
		this.add(telefoneTextField, gbc);
		
		salveButton.setText("Salvar");
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.weightx = 0;
		gbc.gridwidth = 2; // NUMERO DE COLUNAS QUE IRA OCUPAR
		gbc.insets = new Insets(15, 0, 10, 15);
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;
		salveButton.addActionListener(this);
		this.add(salveButton, gbc);
		
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == salveButton){
	
			cliente = new Cliente();
			
			cliente.setNomeCliente(nomeTextField.getText());
			cliente.setEndereco(enderecoTextField.getText());
			cliente.setCpf(cpfTextField.getText());
			cliente.setTelefone(telefoneTextField.getText());
			clientes.add(cliente);
			JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
			cleanFields();
			
			}
	}
	private void cleanFields() {
		nomeTextField.setText(null);
		enderecoTextField.setText(null);
		cpfTextField.setText(null);
		telefoneTextField.setText(null);
	}	
}
