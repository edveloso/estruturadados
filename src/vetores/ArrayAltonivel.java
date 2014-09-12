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
			if (k + 1 == array.length) { // o buraco
				array[k] = 0;
				break;
			}
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

	// sequencial, binária - procura uma chave
	public boolean pesquisar(int valor) {
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

	// busca binária
	public boolean buscaBinaria(int valor) {
		int mid;
		int init = 0;
		int fin = array.length;
		int cont = 0;
		while (init <= fin) {
			System.out.println("passada" + cont++);
			mid = (init + fin) / 2;
			if (array[mid] == valor)
				return true;
			if (valor > array[mid])
				init = mid + 1;
			else
				fin = mid - 1;
		}
		return false;
	}

	// ordenação da bolha bubbleSort
	public void ordenacaoBolha() {
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1])
					troca(j, j + 1);
			}
		}
	}

	private void troca(int a, int p) {
		int temp = array[a];
		array[a] = array[p];
		array[p] = temp;
	}

	// ordenação insertion sort
	public void ordenacaoInsertionSort() {
		//
		int in, out;
		for (out = 1; out < array.length; out++) { // out é a linha divisória
			int temp = array[out]; // remove item marcado
			in = out; // começa deslocamento em out
			while (in > 0 && array[in - 1] >= temp) { // até que seja menor,
				array[in] = array[in - 1]; // desloca um item
				--in; // vai a uma posição a esquerda
			}
			array[in] = temp; // insere o item marcado
		}
	}

	// ordenação selection sort
	

}
