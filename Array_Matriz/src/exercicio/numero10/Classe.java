/*
 * Criar um array do tipo int de 6 posi��es, com os valores 1, 3, 5, 7, 9, 11. Imprimir
   todas as posi��es menos a �ltima posi��o (verificar se � a �ltima posi��es e n�o
   verificar se � o de valor 11).
 */
package exercicio.numero10;

public class Classe {
	public static void main(String[] args) {

		int[] teste = new int[6];

		teste[0] = 1;
		teste[1] = 3;
		teste[2] = 5;
		teste[3] = 7;
		teste[4] = 9;
		teste[5] = 11;

		for (int aux = 0; aux < 6; aux++) {

			if (aux != teste.length - 1) {

				System.out.println(teste[aux]);
			}
		}
	}
}