import javax.swing.JOptionPane;
public class Q3_FaturaTeste {

	public static void main(String[] args) {
		
		Q3_Fatura mouse = new Q3_Fatura("1", "Mouse", 10, 30.0);
		Q3_Fatura teclado = new Q3_Fatura("2", "Teclado", 20, 100.0);
		Q3_Fatura monitor = new Q3_Fatura("3", "Monitor", 30, 2500.0);
		Q3_Fatura cadeira = new Q3_Fatura("4", "Cadeira", 25, 200.0);
		Q3_Fatura computador = new Q3_Fatura("5", "Computador", 5, 5000.0);

		JOptionPane.showMessageDialog(null, "N�mero: " + mouse.getNumero() + "\nDescri��o: " + mouse.getDescricao() + "\nQuantidade comprada: " + mouse.getQuant() + "\nPre�o por item: R$" + mouse.getPreco() + "\nTotal fatura: R$" + mouse.getTotalFatura());
		JOptionPane.showMessageDialog(null, "N�mero: " + teclado.getNumero() + "\nDescri��o: " + teclado.getDescricao() + "\nQuantidade comprada: " + teclado.getQuant() + "\nPre�o por item: R$" + teclado.getPreco() + "\nTotal fatura: R$" + teclado.getTotalFatura());
		JOptionPane.showMessageDialog(null, "N�mero: " + monitor.getNumero() + "\nDescri��o: " + monitor.getDescricao() + "\nQuantidade comprada: " + monitor.getQuant() + "\nPre�o por item: R$" + monitor.getPreco()  + "\nTotal fatura: R$" + monitor.getTotalFatura());
		JOptionPane.showMessageDialog(null, "N�mero: " + cadeira.getNumero() + "\nDescri��o: " + cadeira.getDescricao() + "\nQuantidade comprada: " + cadeira.getQuant() + "\nPre�o por item: R$" + cadeira.getPreco()  + "\nTotal fatura: R$" + cadeira.getTotalFatura());
		JOptionPane.showMessageDialog(null, "N�mero: " + computador.getNumero() + "\nDescri��o: " + computador.getDescricao() + "\nQuantidade comprada: " + computador.getQuant() + "\nPre�o por item: R$" + computador.getPreco()  + "\nTotal fatura: R$" + computador.getTotalFatura());

	}

}