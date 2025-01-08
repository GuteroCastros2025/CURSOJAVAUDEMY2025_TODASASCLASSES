package ClasseComida;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida c1 = new Comida("pão", 0.180);
		Comida c2 = new Comida("mortadela", 0.300);
		
		Pessoa p = new Pessoa("Jose", 95.0);
		System.out.println(p.apresentar());
		
		p.Comer(c1);
		System.out.println(p.apresentar());
		
		p.Comer(c2);
		System.out.println(p.apresentar());
		
	}

}
