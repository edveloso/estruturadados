package arvore;

public class ArvoreBinaria {

	public Nodo criaComFilhos(char c, Nodo esq, Nodo dir){
		return new Nodo(c, esq, dir);
	}
	
	public Nodo criaSemFilhos(char c){
		return new Nodo(c, null, null);
	}
	
	public boolean vazia(Nodo n){
		return n == null;
	}
	
	public void imprimePreOrdem(Nodo n){
		if(!vazia(n)){
			System.out.print(n.getC()+ " ");
			imprimePreOrdem(n.getEsq());
			imprimePreOrdem(n.getDir());
		}
	}
	
	public void imprimeEmOrdem(Nodo n){
		if(!vazia(n)){
			imprimeEmOrdem(n.getEsq());
			System.out.print(n.getC()+ " ");
			imprimeEmOrdem(n.getDir());
		}
	}
	
	public void imprimePosOrdem(Nodo n){
		if(!vazia(n)){
			imprimePosOrdem(n.getEsq());
			imprimePosOrdem(n.getDir());
			System.out.print(n.getC()+ " ");
		}
	}
	
}
