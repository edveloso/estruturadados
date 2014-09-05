package vetores;

public class Formulario {


	public static void main(String[] args) {

		/**
		 *  1) Crio um formulário. No método main instancie a classe 
		 *  ArrayAltonível com a capacidade de 10 elementos. 
     	Insira 5 elementos, mostre na tela usuando a interface da classe. 
    		Remova dois elementos e veja como ficou o seu valor interno usando 
    		o método display.

		 */
		
		ArrayAltonivel aan = new ArrayAltonivel(7);
		aan.insere(7);
		aan.insere(6);
		aan.insere(5);
		aan.insere(4);
		aan.insere(3);
		aan.insere(2);
		aan.insere(1);
		
		//Crie um método para ordenar 
		//os valores de um array
		//metodo da bolha
		//BubbleSort		
		aan.ordenacaoBolha();
		aan.display();  
		System.out.println(aan.buscaBinaria(7));
		
		
		//Crie um método de ordenação usando 
		//o algoritmo de ordenação por
		//inserção (InsersertionSort)
		
		
		
	}

}







