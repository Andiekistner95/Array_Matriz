/*
 * Alterar o valor do início do array para 10.
 */
package exercicio.numero8.itemb;

public class Classe {
	public static void main(String[] args) {

		int[] teste = new int[5];

		teste[0] = 1;
		teste[1] = 2;
		teste[2] = 3;
		teste[3] = 4;
		teste[4] = 5;

		for (int aux = 0; aux < 5; aux++) {

			if (aux == 0) {

				System.out.println(10);
			} else {

				System.out.println(teste[aux]);
			}
		}
	}
}