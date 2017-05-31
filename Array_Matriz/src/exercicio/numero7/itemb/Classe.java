/*
 * Imprimir todos os valores do array de forma contrário, ou seja, “F”, “E”, “D”...
 */
package exercicio.numero7.itemb;

public class Classe {
	public static void main(String[] args) {

		String[] teste = new String[6];

		teste[0] = "A";
		teste[1] = "B";
		teste[2] = "C";
		teste[3] = "D";
		teste[4] = "E";
		teste[5] = "F";

		for (int aux = 5; aux >= 0; aux--) {
			System.out.println(teste[aux]);
		}
	}
}
