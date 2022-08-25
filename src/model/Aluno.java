package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import util.Contador;
import util.NormalizaData;

public class Aluno extends Pessoa{
	private Integer id;
	private Double notaFinalCurso;
	private LocalDateTime data;
	
	public Aluno(String nome, String telefone, int diaNascimento, int mesNascimento, int anoNascimento, Double notaFinalCurso, LocalDateTime data) {
		super(nome, telefone, diaNascimento, mesNascimento, anoNascimento);
		this.id = Contador.proximoId();
		this.notaFinalCurso = notaFinalCurso;
		this.data = LocalDateTime.now();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getNotaFinalCurso() {
		return notaFinalCurso;
	}

	public void setNotaFinalCurso(Double notaFinalCurso) {
		this.notaFinalCurso = notaFinalCurso;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Aluno[Id: " + this.getId() + " Nome: " + this.getNome() + " Telefone: " + this.getTelefone() + " Data de Nascimento: " 
				+this.getDiaNascimento() + "/" + this.getMesNascimento() + "/" + this.getAnoNascimento() 
				+ " Nota Final do Curso: " + this.getNotaFinalCurso() + " Data de Cadastro: " + NormalizaData.formata(getData()) + "Data da Última Atualização: "+ NormalizaData.formata(getData()) + "]";
	}
	
	
	
	
	
	
}
