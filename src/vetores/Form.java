package vetores;

public class Form {

	public static void main(String[] args) {
		
		ArrayAlunos arrayAluno = new ArrayAlunos(3);
		Aluno aluno = new Aluno();
		aluno.id = 10;
		aluno.nome = "jose";
		
		Aluno aluno1 = new Aluno();
		aluno1.id = 5;
		aluno1.nome = "amadeu";
		
		Aluno aluno2 = new Aluno();
		aluno2.id = 80;
		aluno2.nome = "zoraide";
		
		arrayAluno.insere(aluno);
		arrayAluno.insere(aluno1);
		arrayAluno.insere(aluno2);
		
		arrayAluno.display();
		System.out.println("==========");
		
		arrayAluno.ordenacaoInsertionSort();
		arrayAluno.display();
		
		
		
	}
	
}
