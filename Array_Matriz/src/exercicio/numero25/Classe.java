/*
 * Criar uma matriz com 3 linhas e 3 colunas. Popular esta matriz da forma tradicional
   (matriz[0][0] = 1;) com os valores desejados. Utilizando for, efetuar a soma dos
   valores de cada linha e imprimir apenas os valores somados da linha. Ou seja,
   conforme matriz abaixo:
3 3 3
2 2 2
1 1 1
   Imprimir no console, deve aparecer o seguinte resultado:
Soma da linha 0: 9
Soma da linha 1: 6
Soma da linha 2: 3
 */
package exercicio.numero25;

public class Classe {
	public static void main(String[] args) {

		int[][] matriz = new int[3][3];

		matriz[1][0] = 3;
		matriz[1][1] = 3;
		matriz[1][2] = 3;

		matriz[2][0] = 2;
		matriz[2][1] = 2;
		matriz[2][2] = 2;

		matriz[3][0] = 1;
		matriz[3][1] = 1;
		matriz[3][2] = 1;

		int soma;

		for (int aux = 0; aux < matriz.length; aux++) {

		}
	}
}