package vetores;

/**
 * Objetivo é elevar o nível do interface de uma estrutura de dados definir uma
 * interface para dados relacionados pg39
 * 
 * @author edveloso
 * 
 */

public class ArrayAltonivel {

	// define o array
	private int[] array;

	// define o número de elementos
	private int elementoAtual;

	// ao criar o array informa a capacidade e também a quantidade de elementos
	// preenchidos
	public ArrayAltonivel(int capacidade) {
		array = new int[capacidade];
		elementoAtual = 0;
	}

	// para inserir um novo elemento testa-se se
	// tem capacidade ainda
	// em seguida insere-se o novo elemento
	// finaliza-se com o incremento do elementoAtual
	public void insere(int valor) {
		if (elementoAtual == array.length)
			return;
		array[elementoAtual] = valor;
		elementoAtual++;
	}

	public boolean delete(int valor) {
		// procuro se existe no vetor
		int pos;
		for (pos = 0; pos < array.length; pos++) {
			if (valor == array[pos])
				break;// se tiver para antes de chegar ao final do array
		}

		if (pos == array.length) // caso tenha atingido o final então não existe
			return false;

		for (int k = pos; k < array.length; k++) { // tira o elemento removentod
													// o buraco
			array[k] = array[k + 1];
		}
		elementoAtual--;
		return true;
	}

	public void display() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
	}
	
	public boolean pesquisar(int valor){
		int pos;
		for (pos = 0; pos < array.length; pos++) {
			if (valor == array[pos])
				break;// se tiver para antes de chegar ao final do array
		}

		if (pos == array.length) // caso tenha atingido o final então não existe
			return false;
		else
			return true;
	}

}
