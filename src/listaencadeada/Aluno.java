package listaencadeada;

public class Aluno  {

	private int matricula;
	private String nome;

	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", "
				+ (nome != null ? "nome=" + nome : "") + "]";
	}

	public boolean equals(Aluno aluno){
		return this.matricula == aluno.getMatricula();
	}
	
	

}
