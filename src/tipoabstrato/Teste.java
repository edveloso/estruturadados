package tipoabstrato;

class No {

	private int valor;
	private No proximo;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
}

class Lista {
	private No primeiro;

	public void criarLista() {
		primeiro = null;
	}

	public void add(int i) {
		No novo = new No();
		novo.setValor(i);
		novo.setProximo(primeiro);
		primeiro = novo;
	}

	public No getPrimeiro() {
		return primeiro;
	}

}

public class Teste {

	public static void main(String[] args) {
		
		Lista lista  = new Lista();
		lista.criarLista();
		lista.add(6);
		lista.add(14);
		
		for(No n = lista.getPrimeiro(); n != null; n =  n.getProximo() ){
			System.out.println(n.getValor()); 
		}
		
		
		
	}
	
}
