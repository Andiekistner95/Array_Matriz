/*
 * Criar um array de 10 posi��es, e popular este array apenas com m�ltiplos de 10, ou
   seja, na posi��o 0 dever� ter o valor 10, na posi��o 1 o valor 20, e assim por diante.
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