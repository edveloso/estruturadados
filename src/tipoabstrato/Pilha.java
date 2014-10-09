package tipoabstrato;

public class Pilha {

	// define o array
	private Integer[] array;

	private Integer head;

	// define o número de elementos
	private int elementoAtual;

	// ao criar o array informa a capacidade e também a quantidade de elementos
	// preenchidos
	public Pilha(int capacidade) {
		array = new Integer[capacidade];
		elementoAtual = 0;
		head = 0;
	}

	public int tamanho() {
		return (head + 1);
	}

	public boolean vazia() {
		return (head < 0);
	}

	public void empilha(int value) {
		if (tamanho() == array.length)
			return;
		array[++head] = value;
	}

	public int desempilha() {
		int elemento;
		if (vazia())
			return -1;
		elemento = array[head];
		array[head] = null; // Libera aray[head] para a // coleta de lixo
		head--;
		return elemento;
	}
}
