/*
 * Crie um array de 5 posi��es com os valores 1, 3, 5, 7, 9. Pe�a para o usu�rio digitar
   um valor. Se o valor digitado pelo usu�rio estiver no array, imprima �Achei o valor�,
   caso contr�rio, n�o achei o valor. (o System.out.println deve estar fora do for).
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

		System.out.println("Digite um n�mero");
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
			System.out.println("N�o achei o valor");

		}
		scanner.close();
	}
}