/*
 * Imprimir todos os valores do array de forma decrescente
 */
package exercicio.numero6.itemb;

public class Classe {
	public static void main(String[] args) {

		int[] teste = new int[6];

		teste[0] = 0;
		teste[1] = 1;
		teste[2] = 2;
		teste[3] = 3;
		teste[4] = 4;
		teste[5] = 5;

		// ou (int aux = teste.lenght-1; aux >= 0 ; aux--) (-1 pois o array é de 6)
		for (int aux = 5; aux >= 0 ; aux--) {
			System.out.println("números: " + teste[aux]);
		}
	}
}
