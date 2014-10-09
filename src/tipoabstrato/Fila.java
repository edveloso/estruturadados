package tipoabstrato;

public class Fila {

	// define o array
	private int[] array;
	
	private int head;

	// define o número de elementos
	private int elementoAtual;

	// ao criar o array informa a capacidade e também a quantidade de elementos
	// preenchidos
	public Fila(int capacidade) {
		array = new int[capacidade];
		elementoAtual = 0;
		head = 0;
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

	//deleta o primeiro da fila e vai incrementando até chegar ao número de 
	//elementoAtual
	public int delete() {
		if ( head > elementoAtual)
			return -1;
		return array[head++];
	}
	
	public int front(){
		return array[head];
	}

	public boolean empty(){
		return elementoAtual == head;
	}

}
