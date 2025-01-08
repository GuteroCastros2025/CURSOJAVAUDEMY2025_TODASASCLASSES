package Generics;

public class CaixaInt_Teste {
	
	public static void main(String[] args) {
		
		CaixaInt caixaA = new CaixaInt();
		caixaA.guardar(123);
		
		Integer coisaA = caixaA.Abrir();
		System.out.println(coisaA);
		
	}

}	