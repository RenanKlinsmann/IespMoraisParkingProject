package model.entities;

public class Funcionario extends Usuario {

	private String funcao;
	private String nome;

	public Funcionario() {
	}

	public Funcionario(String funcao, String nome, Integer id, String senha) {
		super(id, senha);
		this.funcao = funcao;
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
