package br.com.fiap.healthtrack;

import java.util.Random;
import java.io.Serializable;

/**
 * Classe que abstrai uma Atividade
 *
 * @author Ryan Sczayka Nunes - RM 82046
 * @author Joabe Chaves - RM 85071
 * @author Pedro Perro Salgado de Mendon�a - RM 85731
 * @author Joao Vitor de Sousa Escudeiro - RM 77997
 * @author Lucas Alonso Cyrillo
 * @version 1.0
 * */

public class Atividade implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/**
	 * numero do c�digo da atividade gerado automaticamente
	 * */
	private int codAtividade;
	/**
	 * C�digo do Usu�rio da Atividade
	 * */
	private int codUsuario;
	/**
	 * Nome da atividade
	 * */
	private String nomeAtividade;
	/**
	 *tempo de dura��o da atividade
	 * */
	private double duracaoAtividade;
	/**
	 * gerador do c�digo da atividade
	 * */
	private Random gerador = new Random();

	/**
	 *M�todo construtor de Classe com os atributos default, somente com o c�digo de atividade
	 * */
	public Atividade() {
		this.codAtividade = gerador.nextInt(100);
	}
	/**
	 *M�todo construtor de Classe com os atributos preenchidos no parametro da classe
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
		System.out.println("C�digo da atividade: " + codAtividade);
		System.out.println("C�digo do usu�rio: " + codUsuario);
		System.out.println("Nome da atividade: " + nomeAtividade);
		System.out.println("Dura�ao da atividade: " + duracaoAtividade);
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
	 *exibe o periodo de dura��o da atividade cadastrada
	 * */
	public double getDuracaoAtividade() {
		return duracaoAtividade;
	}
	/**
	 *cadastra ou altera a dura��o da atividade
	 * */
	public void setDuracaoAtividade(double duracaoAtividade) {
		this.duracaoAtividade = duracaoAtividade;
	}
}
