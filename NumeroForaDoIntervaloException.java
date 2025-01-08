package Excecao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroForaDoIntervaloException extends Exception {

	private String nomeDoAtributo;
	
	public NumeroForaDoIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMMessage() {
		return String.format("O atributo %s está fora do intervalo " + nomeDoAtributo);
	}
		
}