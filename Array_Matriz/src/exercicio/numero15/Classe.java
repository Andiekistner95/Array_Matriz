/*
 * Criar um array com os valores 10, 8, 6, 4, 2 utilizando esta sequencia de inser��o.
   Criar um outro array de mesmo tamanho. Utilizando for, pegar todos os valores
   presentes no primeiro array e inserir no segundo array de forma decrescente (2, 4, 6,
   8, 10). Desta forma os dois arrays ter�o os mesmo valores s� que nas posi��es
   inversas. Imprimir o segundo array para verificar se o algoritmo funcionou.
 */
package exercicio.numero15;

public class Classe {
	public static void main(String[] args) {

		int[] a = new int[5];
		int[] b = new int[5];
		int tam = a.length - 1;

		a[0] = 10;
		a[1] = 8;
		a[2] = 6;
		a[3] = 4;
		a[4] = 2;

		//for (int aux = 0; aux < a.length; aux++) {
		//System.out.print(a[aux] + " ");
		//}
		//System.out.println();

		for (int aux = 0; aux < a.length; aux++) {
			b[aux] = a[tam];
			tam--;

			System.out.print(b[aux] + " ");
		}
	}
}
