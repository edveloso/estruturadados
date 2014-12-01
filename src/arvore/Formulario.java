package arvore;

public class Formulario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArvoreBinaria arvore = new ArvoreBinaria();
		Nodo nodoJ = arvore.criaSemFilhos('j');
		Nodo nodoK = arvore.criaSemFilhos('k');
		Nodo nodoL = arvore.criaSemFilhos('l');
		Nodo nodoP = arvore.criaSemFilhos('p');
		Nodo nodoD = arvore.criaComFilhos('d', nodoJ, nodoK);;
		Nodo nodoE = arvore.criaComFilhos('e', nodoL, nodoP);
		Nodo raiz = arvore.criaComFilhos('a', nodoD, nodoE);
		arvore.imprimePosOrdem(raiz);
		
	}

}
