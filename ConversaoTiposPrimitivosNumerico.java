package Fundamentos;

public class ConversaoTiposPrimitivosNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; //implicita
		System.out.println(a);
		
		float b = (float) 1.123456788888;
		System.out.println(b);// explicita  - cast
		
		int c = 340;
		Byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e; // explicito (CAST)
		System.out.println(f);
	}
}