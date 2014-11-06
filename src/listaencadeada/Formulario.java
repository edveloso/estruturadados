package listaencadeada;

public class Formulario {

	
	public static void main(String[] args) {
		
		Lista<Aluno> lista = new Lista<Aluno>();
		lista.criaLista();
		Aluno aluno = new Aluno("jose", 123);
		lista.add(new Aluno("maria", 43534));
		lista.add(aluno);
		Aluno ida = new Aluno("idaleila", 9879778);
		lista.add(ida);
		lista.print();
		lista.remover(ida);
		
		System.out.println("removendo.......");
		System.out.println(" ======  ====== ====== ==== ");
		lista.print();
		No<Aluno> noAchado = lista.pesquisa(aluno); 
		
		System.out.println("");
		System.out.println(" ======  ====== ====== ==== ");
		if(noAchado != null);
			//System.out.println(noAchado.getInfo());
		else {
			//System.out.println("não encontrado");
		}
		
		
//		
//		Lista<String> listaduplamenteencadeada = new Lista<String>();
//		listaduplamenteencadeada.add("primeiro");
//		listaduplamenteencadeada.add("segundo");
//		listaduplamenteencadeada.print();
//		
		
	}
	
}
