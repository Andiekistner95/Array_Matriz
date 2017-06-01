/*
 * Crie um array de 6 posições com os valores 1, 2, 3, 4, 5, 6. Percorra o array
   procurando um valor par, se encontado deve ser perguntado para o usuário um novo
   valor para substituir o valor presente no array.
 */
package exercicio.numero23;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numero = new int[6];

		for (int aux = 0; aux < numero.length; aux++) {
			numero[aux] = aux + 1;
			System.out.print(numero[aux] + " ");
		}
		System.out.println();
		for(int aux2 = 0; aux2 < numero.length; aux2++){
			if(numero[aux2] % 2 == 0){	
		System.out.println("Digite um número para substituir o valor presente " + numero[aux2]);
			numero[aux2] = scanner.nextInt();
			}
		}
		for (int aux = 0; aux < numero.length; aux++) {
			System.out.print(numero[aux] + " ");
		}
		scanner.close();
	}
}
