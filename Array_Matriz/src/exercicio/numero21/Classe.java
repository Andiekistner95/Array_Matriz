/*
 * Crie um array com 10 posi��es e pe�a para o usu�rio digitar um n�mero e colocar
   este n�mero no array. Enquanto o array n�o tiver chego no final dever� sempre
   perguntar para o usu�rio um pr�ximo n�mero e inserir no array. Dever� ser utilizar
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