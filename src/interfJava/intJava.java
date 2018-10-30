package interfJava;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class intJava extends JFrame{
	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField();
	JLabel lblEndereco = new JLabel("Endereco: ");
	JTextField txtEndereco = new JTextField();
	JLabel lblCPF = new JLabel("CPF: ");
	JTextField txtCPF = new JTextField();
	JLabel lblRG = new JLabel("RG: ");
	JTextField txtRG = new JTextField();
	JLabel lblTelefone = new JLabel("Telefone: ");
	JTextField txtTelefone = new JTextField();
	
	public intJava() {
		super("Titulo da Minha Janela");
		
		Container paine = this.getContentPane();
		
		paine.add(lblNome);
		lblNome.setBounds(20,20,100,20);
		paine.add(txtNome);
		txtNome.setBounds(130,20,200,20);
		
		paine.add(lblEndereco);
		lblEndereco.setBounds(20,40,100,20);
		paine.add(txtEndereco);
		txtEndereco.setBounds(130,40,200,20);

		paine.add(lblCPF);
		lblCPF.setBounds(20,60,100,20);
		paine.add(txtCPF);
		txtCPF.setBounds(130,60,200,20);
		
		paine.add(lblRG);
		lblRG.setBounds(20,80,100,20);
		paine.add(txtRG);
		txtRG.setBounds(130,80,200,20);
		
		paine.add(lblTelefone);
		lblTelefone.setBounds(20,100,100,20);
		paine.add(txtTelefone);
		txtTelefone.setBounds(130,100,200,20);
		
		
		this.setLayout(null);
		this.setSize(400, 400);
		//this.setResizable(0);
		this.setVisible(true);
		
	}
	public static void main(String args[]) {
		intJava tela = new intJava();
	}
}

