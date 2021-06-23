package br.com.pooIntroducao;

public class ObjectEtoString {
	/** getClass - retorna o tipo do objeto 
	 *  equals - compara se o objeto é igual a outro
	 *  hashCode - retorna um código hash do objeto
	 *  toString - converte o objeto para string
	 */ 
	
	public static void main(String[] args) {
		Triangle tr = new Triangle();
		tr.a = 22.9;
		tr.b = 12.3;
		tr.c = 111.2;
		
		System.out.println(tr);
	}
	
}
