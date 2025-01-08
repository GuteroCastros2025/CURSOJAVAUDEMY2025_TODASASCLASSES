package Excecao.personalizadaB;

public class TesteValidacoes {
	
	public static void main(String[] args) {
		
		Aluno aluno;
		
		try {
			aluno = new Aluno("", -7);
			Validar.aluno(aluno);
			
			Validar.aluno(null);			
		} catch (StringVaziaException e) {
			System.out.println(e. getMessage());
		}catch (NumeroForaDoIntervaloException
				| IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
				
		System.out.println("Fim !");
	}

}
