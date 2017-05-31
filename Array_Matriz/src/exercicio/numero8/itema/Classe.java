/*
 * Criar um array do tipo int, com os seguintes valores 1, 2, 3, 4, 5.
   a. Imprimir todos os valores do array até chegar a metade do array.
 */
package exercicio.numero8.itema;

public class Classe {
	public static void main(String[] args) {

		int[] teste = new int[5];

		teste[0] = 1;
		teste[1] = 2;
		teste[2] = 3;
		teste[3] = 4;
		teste[4] = 5;

		for (int aux = 0; aux < 6; aux++) {

			if(aux <= teste.length / 2){
				
				System.out.println(teste[aux]);
			}
		}
	}
}