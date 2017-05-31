/*
 * Criar um array do tipo String, com valor de “A”, “B”, “C”, “D”, “E”, “F”
   a. Imprimir todos os valores do array
 */
package exercicio.numero7.itema;

public class Classe {
	public static void main(String[] args) {

		String[] teste = new String[6];

		teste[0] = "A";
		teste[1] = "B";
		teste[2] = "C";
		teste[3] = "D";
		teste[4] = "E";
		teste[5] = "F";

		for (int aux = 0; aux < teste.length; aux++) {
			System.out.println(teste[aux]);
		}
	}
}
