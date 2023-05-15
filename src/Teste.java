import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
	
		String nome;
		StringBuilder mensagem = new StringBuilder();
		
		
		nome = JOptionPane.showInputDialog(null, "Digite o seu nome?");
		mensagem.append("Bem vindo ").append(nome).append("!");
		JOptionPane.showMessageDialog(null, mensagem);

	}

}
