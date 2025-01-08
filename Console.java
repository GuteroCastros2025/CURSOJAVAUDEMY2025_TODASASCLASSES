package Fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia !\n\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
	
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "Joao");

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String  nome = entrada.nextLine();
		
		
		System.out.print("Digite o seu sobrenome: ");
		String  sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		String  idade = entrada.nextLine();
		
		System.out.printf("\n%s %s tem %d anos. %n", nome, sobrenome, idade);
		//System.out.println("\n\nNome = " + nome + " " + sobrenome);
	
		entrada.close();
	}
}
