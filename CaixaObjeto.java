package Generics;

public class CaixaObjeto {
	
	private Object coisa;
	
	public void guardar(Object coisa) {
		this.coisa = coisa;
	}
	
	public Object Abrir() {
		return coisa;
	}
}
