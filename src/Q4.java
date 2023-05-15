import javax.swing.JOptionPane;

public class Q4 {

	public static void main(String[] args) {
		double nota;
		
		nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota:"));
		
		JOptionPane.showMessageDialog(null, "Classificação: " + Classificacao(nota));

	}
	static char Classificacao(double nota) {
		if(nota >= 9) {
			return 'A';
			
		} else if(nota >= 8 && nota < 9 ) {
			return 'B';
			
		} else if(nota >= 7 && nota < 8) {
			return 'C';
			
		} else if(nota >= 6 && nota < 7) {
			return 'D';
			
		} else {
			return 'E';
		}
	}

}
