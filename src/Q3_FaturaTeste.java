import javax.swing.JOptionPane;
public class Q3_FaturaTeste {

	public static void main(String[] args) {
		
		Q3_Fatura mouse = new Q3_Fatura("1", "Mouse", 10, 30.0);
		Q3_Fatura teclado = new Q3_Fatura("2", "Teclado", 20, 100.0);
		Q3_Fatura monitor = new Q3_Fatura("3", "Monitor", 30, 2500.0);
		Q3_Fatura cadeira = new Q3_Fatura("4", "Cadeira", 25, 200.0);
		Q3_Fatura computador = new Q3_Fatura("5", "Computador", 5, 5000.0);

		JOptionPane.showMessageDialog(null, "Número: " + mouse.getNumero() + "\nDescrição: " + mouse.getDescricao() + "\nQuantidade comprada: " + mouse.getQuant() + "\nPreço por item: R$" + mouse.getPreco() + "\nTotal fatura: R$" + mouse.getTotalFatura());
		JOptionPane.showMessageDialog(null, "Número: " + teclado.getNumero() + "\nDescrição: " + teclado.getDescricao() + "\nQuantidade comprada: " + teclado.getQuant() + "\nPreço por item: R$" + teclado.getPreco() + "\nTotal fatura: R$" + teclado.getTotalFatura());
		JOptionPane.showMessageDialog(null, "Número: " + monitor.getNumero() + "\nDescrição: " + monitor.getDescricao() + "\nQuantidade comprada: " + monitor.getQuant() + "\nPreço por item: R$" + monitor.getPreco()  + "\nTotal fatura: R$" + monitor.getTotalFatura());
		JOptionPane.showMessageDialog(null, "Número: " + cadeira.getNumero() + "\nDescrição: " + cadeira.getDescricao() + "\nQuantidade comprada: " + cadeira.getQuant() + "\nPreço por item: R$" + cadeira.getPreco()  + "\nTotal fatura: R$" + cadeira.getTotalFatura());
		JOptionPane.showMessageDialog(null, "Número: " + computador.getNumero() + "\nDescrição: " + computador.getDescricao() + "\nQuantidade comprada: " + computador.getQuant() + "\nPreço por item: R$" + computador.getPreco()  + "\nTotal fatura: R$" + computador.getTotalFatura());

	}

}