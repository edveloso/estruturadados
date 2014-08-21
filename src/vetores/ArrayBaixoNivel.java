 
package vetores;


//objetivo é começar a conhecer a estrutura de dados mais elaborado
//Pagina 36: Aprender que estrutura de dados tem tudo a ver com interfaces
//

/**
 * TODO 
 * @author edveloso
 *1 Criar uma classe que tenha tenha um vetor privado
 *2 que no construtor informe a capacidade ;
 *3 e criar um método que adiciona os valores na 
 *posicão correta
 * 
 *4 e um outro para recuperar os valores 
 *
 *5 crie uma classe arrayapp para inserir 
 *tres valores e  
 *listar todos os valores deste array 
 */
public class ArrayBaixoNivel {

	private int[] array;
	
	public ArrayBaixoNivel(int capacidade) {
		array = new int[capacidade];
	}
	
	public void set(int pos, int valor){
		array[pos] = valor;
	}
	
	public int get(int pos){
		return array[pos];
	}

	public static void main(String[] args) {
		ArrayBaixoNivel lowArray = new ArrayBaixoNivel(3);
		lowArray.set(0, 10);
		lowArray.set(1, 2);
		lowArray.set(2, 14);
		for( int i = 0; i < 3; i++){
			System.out.println(lowArray.get(i)); 
		}
	}
	
}


