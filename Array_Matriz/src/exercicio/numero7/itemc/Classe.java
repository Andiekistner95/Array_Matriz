/*
 * Imprimir todos os valores do array menos que tenha o valor “C”
 */
package exercicio.numero7.itemc;

public class Classe {
	public static void main(String[] args) {

		String[] teste = new String[6];

		teste[0] = "A";
		teste[1] = "B";
		teste[2] = "C";
		teste[3] = "D";
		teste[4] = "E";
		teste[5] = "F";

		for (int aux = 0; aux < 6; aux++) {
			//if (aux != 2) {
			if(teste[aux] != "C"){
				
				System.out.println(teste[aux]);
			}
		}
	}
}