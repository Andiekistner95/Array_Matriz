/*
 * Criar um array do tipo int com 5 posições;
 */
package exercicio.numero3;

public class Classe {
	public static void main(String[] args) {

		int[] teste = new int[5];

		teste[0] = 3;
		teste[1] = 2;
		teste[2] = 1;
		teste[3] = 4;
		teste[4] = 5;

		for (int aux = 0; aux < 5; aux++) {
			System.out.println("números: " + teste[aux]);
		}

	}
}
