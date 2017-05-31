/*
 * Criar um array do tipo String com 10 posições;
 */
package exercicio.numero1;

public class Classe {
	public static void main(String[] args) {

		String[] teste = new String[10];

		teste[0] = "A";
		teste[1] = "B";
		teste[2] = "C";
		teste[3] = "1";
		teste[4] = "2";
		teste[5] = "3";
		teste[6] = "olá";
		teste[7] = "hello";
		teste[8] = "hallo";
		teste[9] = "fim";

		for (int aux = 0; aux < teste.length; aux++) {
			System.out.println(teste[aux]);
		}
	}
}
