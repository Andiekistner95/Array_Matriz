/*
 * Criar um array de 10 posições, e popular este array apenas com múltiplos de 10, ou
   seja, na posição 0 deverá ter o valor 10, na posição 1 o valor 20, e assim por diante.
 */
package exercicio.numero18;

public class Classe {
	public static void main(String[] args) {

		int[] a = new int[10];
		int valores = 10;
		
		for (int aux = 0; aux < a.length; aux++) {
			a[aux] = valores;	
			valores = valores + 10;
				
				System.out.println(a[aux]);
			}
		}
	}