/*
 * Criar um array do tipo int de 6 posições. Criar um for para popular o array com os
   valores 0, 1, 2, 3, 4, 5.
 */
package exercicio.numero9;

public class Classe {
	public static void main(String[] args) {

		int[] teste = new int[6];

		for (int aux = 0; aux < 6; aux++) {
			teste[aux] = aux;
			
			System.out.println(teste[aux]);
		}
	}
}
