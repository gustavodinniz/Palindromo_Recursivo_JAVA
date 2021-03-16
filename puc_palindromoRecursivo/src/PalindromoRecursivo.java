
public class PalindromoRecursivo {

	public static String identificarPalindromo(String mensagem) {
		return identificarPalindromo(mensagem, mensagem.length() - 1);
	}

	private static String identificarPalindromo(String mensagem, int i) {

		String inverso = "";
		for (i = (mensagem.length() - 1); i >= 0; i--) {
			inverso += mensagem.charAt(i);
		}
		if (inverso.replaceAll(" ", "").equals(mensagem.replaceAll(" ", ""))) {
			MyIO.println("SIM");
		} else {
			MyIO.println("NAO");
		}
		return inverso;

	}

	public static void main(String[] args) {

		String testepalindromo;
		String inverso = "";
		String mensagem = MyIO.readLine("");

		while (!(mensagem.equals("FIM"))) {

			testepalindromo = identificarPalindromo(mensagem);
			inverso = "";
			mensagem = MyIO.readLine("");

		}

	}

}
