import javax.swing.JOptionPane;
public class Q1 {

	public static void main(String[] args) {
		
		int numPassos, posicaoInicio, posicaoFinal;
		StringBuilder mensagem = new StringBuilder();
		
		
		String infoInicio = JOptionPane.showInputDialog(null, "Digite a posição que deseja chegar: ");
		posicaoInicio = Integer.parseInt(infoInicio);
		
		String infoPfinal = JOptionPane.showInputDialog(null, "Digite a posição que deseja chegar: ");
		posicaoFinal = Integer.parseInt(infoPfinal);
		
		if(posicaoInicio > posicaoFinal) {
			mensagem.append("Você já passou do seu destino").append("!");
			JOptionPane.showMessageDialog(null, mensagem);
		}
		
		numPassos = atravessarRua(posicaoInicio, posicaoFinal);
		
		mensagem.append("você precisa dar ").append(numPassos).append(" passos para atravessar a rua");
		JOptionPane.showMessageDialog(null, mensagem);

	}
	
	static int atravessarRua( int posicaoInicio, int posicaoFinal) {
		int passos = 1, contaPassos = 0;
		
		while(posicaoInicio < posicaoFinal) {
			posicaoInicio += passos;
			contaPassos ++;
			
		}
		return contaPassos;
	}

}
