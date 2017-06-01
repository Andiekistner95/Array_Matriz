/*
 * Crie um array int com 3 posições e peça para o usuário digitar um valor, e insira o
   valor na primeira posição do array, peça para o usuário digitar outro valor e insira o
   valor na segunda posição do array, peça para o usuário digitar outro valor e insira o
   valor terceira prosição do array.
 */
package exercicio.numero20;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] lista1 = new int[3];

		System.out.println("Digite um valor");
		lista1[0] = scanner.nextInt();

		System.out.println("Digite um valor");
		lista1[1] = scanner.nextInt();

		System.out.println("Digite um valor");
		lista1[2] = scanner.nextInt();

		for (int aux = 0; aux < lista1.length; aux++) {
			System.out.println("Valor: " + lista1[aux]);
			scanner.close();
		}
	}
}
