/*
 * Criar um array com os valores 10, 8, 6, 4, 2 utilizando esta sequencia de inserção.
   Criar um outro array de mesmo tamanho. Utilizando for, pegar todos os valores
   presentes no primeiro array e inserir no segundo array. Desta forma os dois arrays
   terão os mesmo valores nas mesmas posições. Imprimir o segundo array para
   verificar se o algoritmo funcionou.
 */
package exercicio.numero14;

public class Classe {
	public static void main(String[] args) {

		int[] a = new int[5];
		int[] b = new int[5];

		a[0] = 10;
		a[1] = 8;
		a[2] = 6;
		a[3] = 4;
		a[4] = 2;

		for (int aux = 0; aux < a.length; aux++) {
			b[aux] = a[aux];

			System.out.print(b[aux] + " ");
		}
	}
}
