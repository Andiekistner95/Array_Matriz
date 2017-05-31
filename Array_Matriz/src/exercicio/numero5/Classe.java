/*
 * Criar um array do tipo double, colocando os seguintes valores no array 1.0, 3.0, 5.0, 7.0.
 */
package exercicio.numero5;

public class Classe {
	public static void main(String[] args) {

		double[] teste = new double[4];

		teste[0] = 1.0d;
		teste[1] = 3.0d;
		teste[2] = 5.0d;
		teste[3] = 7.0d;

		for (int aux = 0; aux < 4; aux++) {
			System.out.println("números: " + teste[aux]);
		}
	}
}

