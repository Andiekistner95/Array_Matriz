/*
 * Criar um array do tipo int, colocando os seguintes valores no array 10, 9, 8, 7.
a. Imprimir o tamanho deste array
 */
package exercicio.numero4;

public class Classe {
	public static void main(String[] args) {

		int[] teste = new int[4];

		teste[0] = 10;
		teste[1] = 9;
		teste[2] = 8;
		teste[3] = 7;
		System.out.println(teste.length);
	}
}
