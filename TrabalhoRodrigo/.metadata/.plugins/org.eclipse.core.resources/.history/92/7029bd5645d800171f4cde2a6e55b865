package br.edu.univas.si4.Concessionaria;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaInicial extends JFrame implements ActionListener {

	private static final long serialVersionUID = 16546876532L;
	
	private JPanel panel = null;
	
	private JButton buttonConsulta = new JButton("Consultar Veiculos");
	private JButton buttonAluguel = new JButton("Solicitar Aluguel");
	private JButton buttonConsultarAluguel = new JButton("Consultar Aluguel");
	private JButton buttonCadastrarCliente = new JButton("Cadastrar Cliente");
	private JButton buttonCadastrarCarro = new JButton("Cadastrar Carro");
	
	
	public TelaInicial(){
		this.setTitle("Tela Inicial");
		this.setSize(450, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		setContentPane();
		addComponent();
	}
	
	private void setContentPane() {
		panel = new JPanel();
		setContentPane(panel);	
	}
	
	private void addComponent() {
		
		Dimension dim = new Dimension(150, 50);
		
		buttonConsulta.setBounds(10, 10, 10, 10);
		buttonConsulta.setPreferredSize(dim);
		buttonConsulta.addActionListener(this);
		add(buttonConsulta);
		
		buttonAluguel.setBounds(10, 10, 10, 10);
		buttonAluguel.addActionListener(this);
		buttonAluguel.setPreferredSize(dim);
		add(buttonAluguel);
		
		buttonConsultarAluguel.setBounds(10, 10, 10, 10);
		buttonConsultarAluguel.setPreferredSize(dim);
		buttonConsultarAluguel.addActionListener(this);
		add(buttonConsultarAluguel);
		
		buttonCadastrarCliente.setBounds(10, 10, 10, 10);
		buttonCadastrarCliente.setPreferredSize(dim);
		buttonCadastrarCliente.addActionListener(this);
		add(buttonCadastrarCliente);
		
		buttonCadastrarCarro.setBounds(10, 10, 10, 10);
		buttonCadastrarCarro.setPreferredSize(dim);
		buttonCadastrarCarro.addActionListener(this);
		add(buttonCadastrarCarro);
		
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == buttonConsulta){
			
			TelaConsulta telaConsulta = new TelaConsulta();
			telaConsulta.setVisible(true);	
		}
		if(e.getSource() == buttonAluguel){
			
			TelaAluguel telaAluguel = new TelaAluguel();
			telaAluguel.setVisible(true);
		}
		if(e.getSource() == buttonConsultarAluguel){
	
			TelaConsultarAluguel telaConsAluguel = new TelaConsultarAluguel();	
			telaConsAluguel.setVisible(true);
}
		if(e.getSource() == buttonCadastrarCliente){
			
			TelaCadastrarCliente telaCadCliente = new TelaCadastrarCliente();	
			telaCadCliente.setVisible(true);
}
	
		if(e.getSource() == buttonCadastrarCarro){
			
			TelaCadastrarCarro telaCadCarro = new TelaCadastrarCarro();	
			telaCadCarro.setVisible(true);
}
		
	}
}
