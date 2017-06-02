/*
 * Criar uma matriz com 3 linhas e 3 colunas. Popular esta matriz da forma tradicional
   (matriz[0][0] = 1;) com os valores desejados. Utilizando for, efetuar a soma dos
   valores de cada coluna e imprimir apenas os valores somados da coluna. Ou seja,
   conforme matriz abaixo:
3 3 3
2 2 2
1 1 1
   Imprimir no console deve aparecer o seguinte resultado:
Soma da coluna 0: 6
Soma da coluna 1: 6
Soma da coluna 2: 6
 */
package exercicio.numero26;

public class Classe {
	public static void main(String[] args) {

		int[][] matriz = new int[3][3];

		matriz[0][0] = 3; 
		matriz[0][1] = 2;
		matriz[0][2] = 3;

		matriz[1][0] = 2;
		matriz[1][1] = 2;
		matriz[1][2] = 4;

		matriz[2][0] = 5;
		matriz[2][1] = 1;
		matriz[2][2] = 1;

		int soma;

		for (int aux = 0; aux < matriz.length; aux++) {
			soma = matriz[0][aux] + matriz[1][aux] + matriz[2][aux];
			System.out.println("soma dos valores da coluna " + aux + " :" + soma);
			soma = 0;
		}
	}
}
