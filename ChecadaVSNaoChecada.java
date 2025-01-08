package Excecao;

public class ChecadaVSNaoChecada {
	
	public static void main(String[] args) throws Exception {
		
		try {
			geraErro1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim !!");
	}
	
	//NÃO checada ou NÃO verificada
	static void geraErro1( ) throws RuntimeException {
		throw new RuntimeException("Ocorreu um erro bem legal aqui !!");
	}
	
	//Exceção checada ou verificada
	static void geraErro2() throws Exception {
		try {
			throw new Exception("Ocorreu um erro bem legal ##02 !!");
		} catch (Exception e) {
			System.out.println("Ocorreu um erro bem legal ! # 02");
		}
	}

}
