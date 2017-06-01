/*
 * Criar um array com 10 posições. Inserir nas posições 2, 4, 5, 7 os respectivos
   valores “A”, “B”, “C”, “D”. Com for ou while, inserir a letra “W” nas posições do array
   no qual não tem valor (verificar a posição do array com null para validar se possui
   valor ou não na posição do array, array[i] == null). Imprimir o array para verificar se o
   algoritmo funcionou. Fazer o exercício utilizando for ou while.
 */
package exercicio.numero16;

public class Classe {
	public static void main(String[] args) {

		String[] a = new String[10];

		a[2] = "A";
		a[4] = "B";
		a[5] = "C";
		a[7] = "D";

		for (int aux = 0; aux < 10; aux++) {
			if (a[aux] == null) {
				System.out.println("W");
			} else {
				System.out.println(a[aux]);
			}
		}
	}
}