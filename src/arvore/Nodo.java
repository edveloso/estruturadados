package arvore;

public class Nodo {

	private Nodo dir;
	private char c;
	private Nodo esq;

	public Nodo (char c, Nodo esq, Nodo dir){
		this.c = c;
		this.esq = esq;
		this.dir = dir;
	}

	public Nodo getDir() {
		return dir;
	}

	public char getC() {
		return c;
	}

	public Nodo getEsq() {
		return esq;
	}
	
}
