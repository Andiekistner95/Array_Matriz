/*
 * Criar um array do tipo int, com valores de 0 à 5.
   a. Imprimir todos os valores do array
 */
package exercicio.numero6.itema;

public class Classe {
	public static void main(String[] args) {

		int[] teste = new int[6];

		teste[0] = 0;
		teste[1] = 1;
		teste[2] = 2;
		teste[3] = 3;
		teste[4] = 4;
		teste[5] = 5;

		for (int aux = 0; aux < 6; aux++) {
			System.out.println("números: " + teste[aux]);
		}
	}
}
