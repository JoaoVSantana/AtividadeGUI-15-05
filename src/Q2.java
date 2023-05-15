import javax.swing.JOptionPane;

public class Q2 {
	
	static float saldo;

	public static void main(String[] args) {
		
		float saque, deposito;
		
		definirSaldoInicial(Float.parseFloat(JOptionPane.showInputDialog(null, "Quanto você possui na conta?")));
		
		JOptionPane.showMessageDialog(null, "Você possui " + saldo + " reais na conta");
	
		saque = Float.parseFloat(JOptionPane.showInputDialog(null, "Quanto deseja sacar? "));
		
		if(saque < saldo) {
			sacar(saque);
			JOptionPane.showMessageDialog(null, "Saque de " + saque + " reais realizado! Você possui " + saldo + " reais na conta");
			
		} else {
			JOptionPane.showMessageDialog(null,"Valor informado maior do que a conta bancária possui!");
		}
		
		deposito = Float.parseFloat(JOptionPane.showInputDialog(null, "Quanto deseja depositar? "));
		depositar(deposito);
		
		JOptionPane.showMessageDialog(null, "Você possui " + saldo + " reais na conta");
		
		saque = Float.parseFloat(JOptionPane.showInputDialog(null, "Quanto deseja sacar? "));
		
		if(saque < saldo) {
			sacar(saque);
			JOptionPane.showMessageDialog(null, "Saque de " + saque + " reais realizado! Você possui " + saldo + " reais na conta");
			
		} else {
			JOptionPane.showMessageDialog(null,"Valor informado maior do que a conta bancária possui!");
		}
		
	}
	static void definirSaldoInicial(float saldoInicial) {
		saldo = saldoInicial;
	}
	
	static void sacar(float saque) {
		saldo -= saque;
	}
	
	static void depositar(float deposito) {
		saldo += deposito;
	}
}
