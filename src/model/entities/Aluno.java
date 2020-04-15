package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Usuario {
	private String curso;
	private String nome;
	
	private List<Veiculo> veiculos = new ArrayList<>();
	
	public Aluno() {
	}

	public Aluno(String curso, String nome, Integer id, String senha) {
		super(id, senha);
		this.curso = curso;
		this.nome = nome;
		
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Veiculo> getVeiculo() {
		return veiculos;
	}
	
	public void addQuantVeiculos(Veiculo veiculo) {
		veiculos.add(veiculo);
	}
	public void removeQuantVeiculos(Veiculo veiculo) {
		veiculos.remove(veiculo);
	}

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", nome=" + nome + ", veiculos=" + veiculos + "]";
	}

}
