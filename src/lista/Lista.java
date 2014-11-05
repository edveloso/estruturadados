package lista;

public class Lista<T> {

	private No<T> primeiro;

	public void criaLista() {
		primeiro = null;
	}

	public void add(T i) {
		No<T> novo = new No<T>();
		novo.setInfo(i);
		novo.setProximo(primeiro);
		primeiro = novo;
	}

	public No<T> getPrimeiro() {
		return primeiro;
	}

	public No<T> pesquisa(T obj) {
		for (No<T> n = getPrimeiro(); n != null; n = n.getProximo()) {
			if (n.getInfo().equals(obj))
				return n;
		}
		return null;
	}

	public void print() {
		for (No n = getPrimeiro(); n != null; n = n.getProximo()) {
			System.out.println(n.getInfo());
		}

	}

	public void remover(T obj) {
		for (No<T> n = getPrimeiro(); n != null;) {
			if (n.getInfo().equals(obj)) {
				if(n.getProximo() == null)
					n = null;
				n = n.getProximo();
				break;
			}
			n = n.getProximo();
		}
	}

}
