/*
 * Criar um array com os valores 1, 2, 3, 4, 5. Criar outro array com os valores 5, 4, 3, 2, 1.
   Utilizando for, imprimir em qual é as posições dos arrays que o valor é são iguais, conforme 
   exemplo abaixo:
arrayA posição 0, arrayB posição 4 possuem o valor 1
arrayA posição 1, arrayB posição 3 possuem o valor 2
 */
package exercicio.numero19;

public class Classe {
	public static void main(String[] args) {

		int[] lista1 = new int[5];
		int[] lista2 = new int[5];

		lista1[0] = 1;
		lista1[1] = 2;
		lista1[2] = 3;
		lista1[3] = 4;
		lista1[4] = 5;

		lista2[0] = 5;
		lista2[1] = 4;
		lista2[2] = 3;
		lista2[3] = 2;
		lista2[4] = 1;

		for (int aux = 0; aux < lista1.length; aux++) {
			for (int aux2 = 0; aux2 < lista2.length; aux2++) {
				if (lista1[aux] == lista2[aux2]) {
					System.out.println("ArrayA posição:" + aux + " ArrayB posição: " + aux2 + " possuem o valor: " + lista1[aux]);
				}
			}
		}
	}
}
