package Controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Voc� precisa falar "
					+"as palavras m�gicas");
			System.out.print("quer sair ?");
			texto = entrada.nextLine();
			
		}while(!texto.equalsIgnoreCase("por favor"));
				
		entrada.close();
	}
}
