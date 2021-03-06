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

public class TelaCadastrarCarro extends JFrame implements ActionListener{
	
	private Carro carro;
	
	private ArrayList<Carro> carros = new ArrayList<Carro>();
	
	private JTextField fabricanteTextField;
	private JTextField modeloTextField;
	private JTextField anoTextField;
	private JTextField placaTextField;
	
	private JPanel painel = null;
	
	JButton salveCButton = new JButton();
	
	public TelaCadastrarCarro(){
		
		this.setTitle("Cadastrar Veiculo");
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
		
		JLabel fabricanteLabel = new JLabel();
		fabricanteLabel.setText("Fabricante: ");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.insets = new Insets(15, 15, 10, 10);
		this.add(fabricanteLabel,gbc);
		
		fabricanteTextField = new JTextField();
		gbc.gridx = 1; // COLUNA
		gbc.gridy = 0; // LINHA
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15, 0, 10, 15);
		gbc.anchor = GridBagConstraints.CENTER;
		this.add(fabricanteTextField, gbc);
		
		JLabel modeloLabel = new JLabel();
		modeloLabel.setText("Modelo: ");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.insets = new Insets(15, 15, 10, 10);
		this.add(modeloLabel,gbc);
		
		modeloTextField = new JTextField();
		gbc.gridx = 1; // COLUNA
		gbc.gridy = 1; // LINHA
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15, 0, 10, 15);
		gbc.anchor = GridBagConstraints.CENTER;
		this.add(modeloTextField, gbc);
		
		
		JLabel anoLabel = new JLabel();
		anoLabel.setText("Ano: ");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.weightx = 0;
		gbc.insets = new Insets(15, 15, 10, 15);
		gbc.anchor = GridBagConstraints.LINE_END;
		this.add(anoLabel, gbc);
		
		anoTextField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15, 0, 10, 15);
		gbc.anchor = GridBagConstraints.LINE_START;
		this.add(anoTextField, gbc);
		
		JLabel placaLabel = new JLabel();
		placaLabel.setText("Placa: ");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.weightx = 0;
		gbc.insets = new Insets(15, 15, 10, 15);
		gbc.anchor = GridBagConstraints.LINE_END;
		this.add(placaLabel, gbc);
		
		placaTextField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15, 0, 10, 15);
		gbc.anchor = GridBagConstraints.LINE_START;
		this.add(placaTextField, gbc);
		
		salveCButton.setText("Salvar");
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.weightx = 0;
		gbc.gridwidth = 2; // NUMERO DE COLUNAS QUE IRA OCUPAR
		gbc.insets = new Insets(15, 0, 10, 15);
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;
		salveCButton.addActionListener(this);
		this.add(salveCButton, gbc);
		
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == salveCButton){
			
			carro = new Carro();
			
			carro.setFabricante(fabricanteTextField.getText());
			carro.setModelo(modeloTextField.getText());
			carro.setAno(anoTextField.getText());
			carro.setPlaca(placaTextField.getText());
			carros.add(carro);
			JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso");
			cleanFields();
			}
	}
	private void cleanFields() {
		fabricanteTextField.setText(null);
		modeloTextField.setText(null);
		anoTextField.setText(null);
		placaTextField.setText(null);
	}	

}
