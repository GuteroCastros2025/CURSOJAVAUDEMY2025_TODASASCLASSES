package Controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.print("informe a nota (ou -1 para sair)");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;
			}else {
				System.out.println("Nota invalida !!!!");
			}
		}
		
		double media = total/quantidadeDeNotas;
		System.out.println("A media �: " + media);
		
		
		entrada.close();
	}

}
