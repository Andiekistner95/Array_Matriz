/*
 * Conforme os moldes do exercício 31 e 32 seguindo os mesmos padrões, só que
agora somar os valores conforme exemplos abaixo:
3 2 3
2 2 3
1 1 2
Soma dos número ímpares da linha 0: 6
Soma dos números pares da linha 0: 2
Soma dos número ímpares da linha 1: 3
Soma dos números pares da linha 1: 4
Soma dos número ímpares da linha 2: 2
Soma dos números pares da linha 2: 2
 */
package exercicio.numero27;

public class Classe {
	public static void main(String[] args) {

		int[][] matriz = new int[3][3];

		matriz[0][0] = 3;		matriz[0][1] = 2;		matriz[0][2] = 1;

		matriz[1][0] = 2;		matriz[1][1] = 2;		matriz[1][2] = 1;

		matriz[2][0] = 3;		matriz[2][1] = 3;		matriz[2][2] = 2;

		int somaPar = 0;
		int somaImpar = 0;

		for (int aux = 0; aux < matriz.length; aux++) {
			if (matriz[0][aux] % 2 != 0) {
				somaImpar = somaImpar + matriz[0][aux];
				

			} else if (matriz[0][aux] % 2 == 0) {
				somaPar = somaPar + matriz[0][aux];
				
			}
		}
		
		System.out.println("soma dos valores da impares da linha " + 0 + " : " + somaImpar);
		System.out.println("soma dos valores da pares da linha " + 0 + " : " + somaPar);
		somaPar = 0;
		somaImpar = 0;

		for (int aux2 = 0; aux2 < matriz.length; aux2++) {
			if (matriz[1][aux2] % 2 != 0) {
				somaImpar = somaImpar + matriz[1][aux2];
				

			} else if (matriz[1][aux2] % 2 == 0) {
				somaPar = somaPar + matriz[1][aux2];
				
			}
		}
		
		System.out.println("soma dos valores da impares da linha " + 1 + " : " + somaImpar);
		System.out.println("soma dos valores da pares da linha " + 1 + " : " + somaPar);
		
		somaPar = 0;
		somaImpar = 0;
		
		for (int aux3 = 0; aux3 < matriz.length; aux3++) {
			if (matriz[2][aux3] % 2 != 0) {
				somaImpar = somaImpar + matriz[2][aux3];
				
			} else if (matriz[2][aux3] % 2 == 0) {
				somaPar = somaPar + matriz[2][aux3];
				
			}
		}
		
		System.out.println("soma dos valores da impares da linha " + 3 + " : " + somaImpar);
		System.out.println("soma dos valores da pares da linha  " + 3 + " : " + somaPar);
	}
}
