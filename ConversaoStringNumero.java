
package Fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	
	public static void main(String[] args) {
		
		String Valor1 = JOptionPane.showInputDialog("Digite o primeiro numero");
		String Valor2 = JOptionPane.showInputDialog("Digite o primeiro numero");
		
		System.out.println(Valor1 + Valor2);
		
		double numero1 = Double.parseDouble(Valor1);
		double numero2 = Double.parseDouble(Valor2);
		
		double soma = numero1 + numero2;
		System.out.println("Soma é : "+ soma);
		System.out.println("Media é: " + soma / 2);
	}
}
