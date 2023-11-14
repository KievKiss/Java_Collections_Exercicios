/*Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String.
O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las
individualmente no ArrayList. 
Em seguida, faça o que se pede: Mostre na tela todas as cores que foram adicionadas. 
Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.
*/

package CollectionExercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionExercicioCores {

	public static void main(String[] args) {
		String cor;
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList <String>();
				
		for(int x = 0; x<5;x++){
			System.out.printf("\n Digite as cores: ");
			cor = leia.nextLine();
			cores.add(cor);
		}
		System.out.printf("\n Listar todas as cores:");
		System.out.println(cores);
		
		Collections.sort(cores);
		
		System.out.printf("\n Ordenar as cores:");
		System.out.println(cores);
		/*Iterator<String>iCores = cores.iterator();
		while(iCores.hasNext());
			System.out.println(iCores.next());*/
		}
	
}
