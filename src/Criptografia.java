
public class Criptografia {

	Transposicao t = new Transposicao();
	Vigenere v = new Vigenere();

	public char[] criptografar(char[] palavra, char[] chave) {

		char[] criptografado;
		char[] frase = String.copyValueOf(palavra).toUpperCase().toCharArray();

		criptografado = cripVigenere(cripTransposicao(frase, chave), chave);

		return criptografado;
	}

	public char[] descriptografar(char[] palavra, char[] chave) {
		char[] descriptografado;

		descriptografado = decripTransposicao(decripVigenere(palavra, chave), chave);
		
		String frase = String.copyValueOf(descriptografado).substring(chave.length, palavra.length);
		return frase.toCharArray();
	}

	private char[] decripTransposicao(char[] palavra, char[] chave) {
		char[] descriptografado;

		descriptografado = t.descriptografar(palavra, chave);

		return descriptografado;
	}

	private char[] decripVigenere(char[] palavra, char[] chave) {
		char[] descriptografado;

		int tamanhoPalavra = palavra.length;

		String chaveVigenere = String.copyValueOf(chave).toUpperCase();

		if (tamanhoPalavra < chaveVigenere.length()) {

			descriptografado = v.descriptografar(palavra, chaveVigenere.substring(0, tamanhoPalavra).toCharArray());

		} else if (tamanhoPalavra > chaveVigenere.length()) {

			while (tamanhoPalavra > chaveVigenere.length()) {
				chaveVigenere = chaveVigenere + chaveVigenere;
			}

			descriptografado = v.descriptografar(palavra, chaveVigenere.substring(0, tamanhoPalavra).toCharArray());

		} else {
			descriptografado = v.descriptografar(palavra, chaveVigenere.toCharArray());
		}

		return descriptografado;
	}

	private char[] cripTransposicao(char[] palavra, char[] chave) {

		char[] criptografado;

		String chaveVigenere = String.copyValueOf(chave).toUpperCase();
		criptografado = t.criptografar(palavra, chaveVigenere.toCharArray());

		// System.out.println("+transposicao: " + String.copyValueOf(criptografado));
		return criptografado;
	}

	private char[] cripVigenere(char[] palavra, char[] chave) {

		char[] criptografado;

		int tamanhoPalavra = palavra.length;

		String chaveVigenere = String.copyValueOf(chave).toUpperCase();

		if (tamanhoPalavra < chaveVigenere.length()) {

			criptografado = v.criptografar(palavra, chaveVigenere.substring(0, tamanhoPalavra).toCharArray());

		} else if (tamanhoPalavra > chaveVigenere.length()) {

			while (tamanhoPalavra > chaveVigenere.length()) {
				chaveVigenere = chaveVigenere + chaveVigenere;
			}

			criptografado = v.criptografar(palavra, chaveVigenere.substring(0, tamanhoPalavra).toCharArray());

		} else {
			criptografado = v.criptografar(palavra, chaveVigenere.toCharArray());
		}

		// System.out.println("Vigenere: " + String.copyValueOf(criptografado));
		return criptografado;
	}
}
