package Fundamentos;

import java.util.Scanner;

public class DEsafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada =  new Scanner(System.in);
		
		System.out.println("informe o primeiro salario : ");
		String valor1 = entrada.nextLine().replace(",","."); ; 
		
		System.out.println("informe o segundo salario : ");
		String valor2 = entrada.nextLine().replace(",","."); 
		
		System.out.println("informe o terceiro salario : ");
		String valor3 = entrada.nextLine().replace(",",".1000"); 
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3)/3;
		System.out.println("A media é: " + media);
		
		entrada.close();
	}
}
