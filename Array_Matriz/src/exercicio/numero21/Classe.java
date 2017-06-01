/*
 * Crie um array com 10 posições e peça para o usuário digitar um número e colocar
   este número no array. Enquanto o array não tiver chego no final deverá sempre
   perguntar para o usuário um próximo número e inserir no array. Deverá ser utilizar
   while ou for.
 */
package exercicio.numero21;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] lista1 = new int[10];

		for (int aux = 0; aux < lista1.length; aux++) {

			System.out.println("Digite um valor");
			lista1[aux] = scanner.nextInt();

		}
		for (int aux2 = 0; aux2 < lista1.length; aux2++) {

			System.out.print(lista1[aux2] + " ");

		}
		scanner.close();
	}
}