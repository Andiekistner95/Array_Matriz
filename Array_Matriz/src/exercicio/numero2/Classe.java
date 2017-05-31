/*
 * Criar um array do tipo boolean com 3 posições;
 */
package exercicio.numero2;

public class Classe {
	public static void main(String[] args) {

		boolean[] teste = new boolean[3];

		teste[0] = false;
		teste[1] = true;
		teste[2] = false;

		for (int aux = 0; aux < 3; aux++) {
			System.out.println(teste[aux]);
		}
	}
}
