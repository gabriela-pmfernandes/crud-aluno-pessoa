package model;

import java.time.LocalDate;

import util.Contador;

public class Aluno extends Pessoa{
	private Integer id;
	private Double notaFinalCurso;
	private LocalDate data;
	
	public Aluno(String nome, String telefone, int diaNascimento, int mesNascimento, int anoNascimento, Double notaFinalCurso, LocalDate data) {
		super(nome, telefone, diaNascimento, mesNascimento, anoNascimento);
		this.id = Contador.proximoId();
		this.notaFinalCurso = notaFinalCurso;
		this.data = LocalDate.now();
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

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Aluno [notaFinalCurso=" + notaFinalCurso + ", data=" + data + ", nome=" + nome + ", telefone="
				+ telefone + ", diaNascimento=" + diaNascimento + ", mesNascimento=" + mesNascimento
				+ ", anoNascimento=" + anoNascimento + "]";
	}
	
	
	
	
	
	
}
