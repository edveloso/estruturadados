package vetores;

public class ArrayAlunos {

	// define o array
	private Aluno[] array;

	// define o número de elementos
	private int elementoAtual;

	// ao criar o array informa a capacidade e também a quantidade de elementos
	// preenchidos
	public ArrayAlunos(int capacidade) {
		array = new Aluno[capacidade];
		elementoAtual = 0;
	}

	public void insere(Aluno aluno) {
		if (elementoAtual == array.length)
			return;
		array[elementoAtual] = aluno;
		elementoAtual++;
	}
	
	public void display(){
		for(Aluno aluno : array){
			if(aluno == null) break;
			System.out.print(aluno.id);
			System.out.println(" - "+aluno.nome);
		}
	}
	
	
	// ordenação insertion sort
		public void ordenacaoInsertionSort() {
			//
			int in, out;
			for (out = 1; out < array.length; out++) { // out é a linha divisória
				Aluno aluno = array[out];
				int temp = aluno.id; // remove item marcado
				in = out; // começa deslocamento em out
				while (in > 0 && array[in - 1].id >= temp) { // até que seja menor,
					array[in] = array[in - 1]; // desloca um item
					--in; // vai a uma posição a esquerda
				}
				array[in] = aluno; // insere o item marcado
			}
		}
	
	
	
	
	
	
	
	
	

}
