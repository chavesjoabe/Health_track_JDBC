package br.com.fiap.healthtrack;

import java.io.Serializable;
import java.util.Random;

/**
 * Classe que abstrai o Refeições
 *
 * @author Ryan Sczayka Nunes - RM 82046
 * @author Joabe Chaves - RM 85071
 * @author Pedro Perro Salgado de Mendonça - RM 85731
 * @author Joao Vitor de Sousa Escudeiro - RM 77997
 * @author Lucas Alonso Cyrillo
 * @version 1.0
 * */

public class Refeicao implements Serializable {

	/**
	 * código da refeição, gerado automaticamente
	 * */
	private int codRefeicao;
	/**
	 *Código do usuário relacionado
	 * */
	private int codUsuario;
	/**
	 *tipo de refeição
	 * */
	private String tipoRefeicao;
	/**
	 *valor calórico da refeiçao
	 * */
	private double calorias;
	/**
	 *data que a refeição foi feita
	 * */
	private String dataRefeicao;
	/**
	 *gerador de código de refeição
	 * */
	private Random gerador = new Random();

	/**
	 *Método construtor de refeição com os atributos em default
	 * */
	public Refeicao() {
		this.codRefeicao =  gerador.nextInt(100);
	}

	/**
	 *Método construtor de refeição com os atributos passados pelos parametros
	 * */
	public Refeicao(int codUsuario, String tipoRefeicao, double calorias, String dataRefeicao) {
		this.codRefeicao =  gerador.nextInt(100);
		this.codUsuario = codUsuario;
		this.tipoRefeicao = tipoRefeicao;
		this.calorias = calorias;
		this.dataRefeicao = dataRefeicao;
	}
	/**
	 *retorna o tipo de refeição
	 * */
	public String getTipoRefeicao() {
		return tipoRefeicao;
	}
	/**
	 *cadastra ou altera o tipo de refeição
	 * */
	public void setTipoRefeicao(String tipoRefeicao) {
		this.tipoRefeicao = tipoRefeicao;
	}
	/**
	 *retorna o valor calórico da refeição
	 * */
	public double getCalorias() {
		return calorias;
	}
	/**
	 *cadastra ou altera o valor calórico da refeição
	 * */
	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}
	/**
	 *retorna a data que a refeição foi feita
	 * */
	public String getDataRefeicao() {
		return dataRefeicao;
	}
	/**
	 *cadastra ou altera a data que a refeição foi feita
	 * */
	public void setDataRefeicao(String dataRefeicao) {
		this.dataRefeicao = dataRefeicao;
	}
}
