package CollectionExercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioCollectionSetNumeros {

	public static void main(String[] args) {
		
		int num;
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> valores = new HashSet<Integer>();
		
		for(int x=0;x<10;x++) {
			System.out.println("Digite o numero");
			num = leia.nextInt();
			valores.add(num);
		}
		System.out.println("\nListar dados do Set:" + valores);
				
		
		
	}

}

