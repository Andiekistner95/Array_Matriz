/*
 * Criar um array com 10 posições, com valores de 1 a 10 sequenciais. Criar um array
   de 5 posições. Popular o segundo array somente com os valores ímpares do
   primeiro array utilizando for. Imprimir o segundo array para verificar se o algoritmo
   funcionou.
 */
package exercicio.numero17;

public class Classe {
	public static void main(String[] args) {

		int[] a = new int[10];
		int[] b = new int[5];
		int posicao = 0;
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 6;
		a[6] = 7;
		a[7] = 8;
		a[8] = 9;
		a[9] = 10;

		for (int aux = 0; aux < a.length; aux++) {
			if (a[aux] % 2 != 0) {
				b[posicao] = a[aux];
				posicao++;
			}	
		}
		for ( int aux = 0; aux < b.length; aux++ ){
			System.out.println(b[aux]);
		}
	}
}