package br.com.fiap.healthtrack;

import java.util.Random;
import java.io.Serializable;

/**
 * Classe que abstrai uma Atividade
 *
 * @author Ryan Sczayka Nunes - RM 82046
 * @author Joabe Chaves - RM 85071
 * @author Pedro Perro Salgado de Mendonça - RM 85731
 * @author Joao Vitor de Sousa Escudeiro - RM 77997
 * @author Lucas Alonso Cyrillo
 * @version 1.0
 * */

public class Atividade implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/**
	 * numero do código da atividade gerado automaticamente
	 * */
	private int codAtividade;
	/**
	 * Código do Usuário da Atividade
	 * */
	private int codUsuario;
	/**
	 * Nome da atividade
	 * */
	private String nomeAtividade;
	/**
	 *tempo de duração da atividade
	 * */
	private double duracaoAtividade;
	/**
	 * gerador do código da atividade
	 * */
	private Random gerador = new Random();

	/**
	 *Método construtor de Classe com os atributos default, somente com o código de atividade
	 * */
	public Atividade() {
		this.codAtividade = gerador.nextInt(100);
	}
	/**
	 *Método construtor de Classe com os atributos preenchidos no parametro da classe
	 * */
	public Atividade(int codUsuario, String nomeAtividade, double duracaoAtividade) {
		this.codAtividade = gerador.nextInt(100);
		this.codUsuario = codUsuario;
		this.nomeAtividade = nomeAtividade;
		this.duracaoAtividade = duracaoAtividade;
	}
	/**
	 *exibe no console todos os atributos da Classe
	 * */
	public void getAtividade() {
		System.out.println("Código da atividade: " + codAtividade);
		System.out.println("Código do usuário: " + codUsuario);
		System.out.println("Nome da atividade: " + nomeAtividade);
		System.out.println("Duraçao da atividade: " + duracaoAtividade);
	}
	/**
	 *retorna o nome da atividade cadastrado
	 * */
	public String getNomeAtividade() {
		return nomeAtividade;
	}
	/**
	 *cadastra ou altera o nome da Atividade
	 * */
	public void setNomeAtividade(String nomeAtividade) {
		this.nomeAtividade = nomeAtividade;
	}
	/**
	 *exibe o periodo de duração da atividade cadastrada
	 * */
	public double getDuracaoAtividade() {
		return duracaoAtividade;
	}
	/**
	 *cadastra ou altera a duração da atividade
	 * */
	public void setDuracaoAtividade(double duracaoAtividade) {
		this.duracaoAtividade = duracaoAtividade;
	}
}
