package model.entities;

public class Visitante {
	private String nome;
	private Integer cpf;
	private String email;
	private Veiculo veiculo;

	public Visitante() {
	}

	public Visitante(String nome, Integer cpf, String email, Veiculo veiculo) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.veiculo = veiculo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
}
