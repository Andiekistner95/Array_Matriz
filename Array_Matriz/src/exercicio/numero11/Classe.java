/*
 * Criar um array do tipo boolean de 6 posi��es. Utilizando um for, popular o array
   aonde as posi��es forem pares colocar o valor true, e nas posi��es �mpares o valor
   false.
 */
package exercicio.numero11;

public class Classe {
	public static void main(String[] args) {

		boolean[] teste = new boolean[6];

		for (int aux = 0; aux < 6; aux++) {

			if (aux % 2 == 0) {
				teste[aux] = true;
			} else {
				teste[aux] = false;
			}
			System.out.println(teste[aux]);
		}
	}
}