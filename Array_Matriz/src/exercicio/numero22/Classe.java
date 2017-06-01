/*
 * Crie um array de 5 posições com os valores 1, 3, 5, 7, 9. Peça para o usuário digitar
   um valor. Se o valor digitado pelo usuário estiver no array, imprima “Achei o valor”,
   caso contrário, não achei o valor. (o System.out.println deve estar fora do for).
 */
package exercicio.numero22;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean encontrado = false;
		int[] lista1 = new int[5];

		lista1[0] = 1;
		lista1[1] = 3;
		lista1[2] = 5;
		lista1[3] = 7;
		lista1[4] = 9;

		System.out.println("Digite um número");
		int numero = scanner.nextInt();
		int aux = 0;

		while ((encontrado == false) && aux < lista1.length) {
			if (lista1[aux] == numero) {
				encontrado = true;
			}
			aux++;
		}
		if (encontrado) {
			System.out.println("Acheio o valor");
		} else {
			System.out.println("Não achei o valor");

		}
		scanner.close();
	}
}