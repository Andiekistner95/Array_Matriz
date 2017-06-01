/*
 * Criar um array com 10 posi��es. Inserir nas posi��es 2, 4, 5, 7 os respectivos
   valores �A�, �B�, �C�, �D�. Com for ou while, inserir a letra �W� nas posi��es do array
   no qual n�o tem valor (verificar a posi��o do array com null para validar se possui
   valor ou n�o na posi��o do array, array[i] == null). Imprimir o array para verificar se o
   algoritmo funcionou. Fazer o exerc�cio utilizando for ou while.
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