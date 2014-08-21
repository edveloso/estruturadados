package vetores;



/**
 * Objetivo é 
 * perceber array é o mais baixo nivel de 
 * estruturas para guardar dados relacionados 
 * na memória
 * 
 * 
 * @author edveloso
 *
 */
//Primeiro
public class Vetor {

	public static void main(String[] args) {
		
		//TODO para criar um vetor com N posições
		//TODO iniciar o array
		int[] intArray2 = {2, 5,4,7,8};
		int i;
		
		System.out.format("Existem %d elementos \ne são eles: ", intArray2.length);
		
		//TODO Mostrar esses valores
		for(i = 0; i < intArray2.length; i++){
			System.out.format("%d, ",intArray2[i]);
		}
		
		System.out.println(""); 
		long time = System.nanoTime();
		
		
		//TODO pesquisar se existe um elemento (key) no array
		for(i = 0; i < intArray2.length; i++){
			if(Integer.parseInt(args[0]) == intArray2[i]){
				System.out.println("O elemento pesquisado foi encontrado");
				break;
			}		
		}
		
		System.out.format("tempo para encontrar os elementos %d\n", (System.nanoTime() - time)/1000);
		
		if(i == intArray2.length)
			System.out.println("elemento não pôde ser encontrado");
		
		
		
	}

}
