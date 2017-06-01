/*
 * Criar um array do tipo boolean com 3 posições, com os valores true, false, true.
   Utilizando for, verifique se comparado todos os valores boleanos do array com o
   operador ou (||) é verdadeiro, caso sim imprima “1”, caso contrário “2”.
 */
package exercicio.numero12;

public class Classe {
	public static void main(String[] args) {

		boolean[] teste = new boolean[3];

		teste[0] = true;
		teste[1] = false;
		teste[2] = true;

		boolean todostrue = true;

		for (int aux = 0; aux < teste.length; aux++) {
			for (int aux2 = 0; aux2 < teste.length; aux2++) {
				if (aux != aux2 && !(teste[aux] || teste[aux2])) {
					todostrue = false;
				}
			}
		}
		if (todostrue) {
			System.out.println("1");
		} else {
			System.out.println("2");
		}
	}
}