/*
 * Criar um array de 10 posi��es, e popular o array com os valores 1, 2, 3, 4, 5 a partir
   da posi��o 4 utilizando for. Para colocar os valores 1, 2, 3, 4, 5 utilizando uma
   vari�vel.
 */
package exercicio.numero13;

public class Classe {
	public static void main(String[] args) {

		int[] num = new int[10];
		int numero = 1;

		for (int aux = 0; aux < num.length; aux++) {
			if (aux > 4) {
				num[aux] = numero;
				numero++;
			} else {
				num[aux] = aux + 1;
			}
			System.out.println(num[aux]);
		}
	}
}
