package br.com.fiap.healthtrack;

import java.io.Serializable;
import java.util.Random;

/**
 * Classe que abstrai o Feed
 *
 * @author Ryan Sczayka Nunes - RM 82046
 * @author Joabe Chaves - RM 85071
 * @author Pedro Perro Salgado de Mendon�a - RM 85731
 * @author Joao Vitor de Sousa Escudeiro - RM 77997
 * @author Lucas Alonso Cyrillo
 * @version 1.0
 * */

public class Feed implements Serializable{
	
	private static final long serialVersionUID = 1L;

	/**
	 *c�digo do Feed gerado automaticamente
	 * */
	private int codFeed;
	/**
	 *T�tulo do Feed
	 * */
	private String titleFeed;
	/**
	 *Descri��o do Feed
	 * */
	private String descFeed;
	/**
	 *endere�o URL da imagem do Feed
	 * */
	private String urlImg;
	/**
	 *informa se o Feed � favoritado
	 * */
	private boolean favorito;
	/**
	 *gerador do c�digo do Feed
	 * */
	private Random gerador = new Random();

	/**
	 *M�todo construtor de Feed vazio, com os parametros em default
	 * */
	
	public Feed() {
		this.codFeed = gerador.nextInt(100);
	}

	/**
	 *M�todo construtor de Classe com os atributos como parametro
	 * */
	public Feed(String titleFeed, String descFeed, String urlImg, boolean favorito) {
		this.codFeed = gerador.nextInt(100);
		this.titleFeed = titleFeed;
		this.descFeed = descFeed;
		this.urlImg = urlImg;
		this.favorito = favorito;
	}
	/**
	 *Imprime no console as informa��es do Feed
	 * */
	public void getFeed() {
		System.out.println("C�digo do Feed: " + codFeed);
		System.out.println("Titulo do Feed: " + titleFeed);
		System.out.println("Descri�ao do Feed: " + descFeed);
		System.out.println("URL do Feed: " + urlImg);
		System.out.println("Favorito do Feed: " + favorito);
	}

	/**
	 * Retorna o c�digo do Feed
	 */

	public int getCodFeed() {
		return codFeed;
	}
	/**
	 *retorna o T�tulo do Feed
	 * */
	public String getTitleFeed() {
		return titleFeed;
	}
	/**
	 *cadastra ou altera o t�tulo do Feed
	 * */
	public void setTitleFeed(String titleFeed) {
		this.titleFeed = titleFeed;
	}
	/**
	 *retorna a descri��o do Feed
	 * */
	public String getDescFeed() {
		return descFeed;
	}
	/**
	 *cadastra o altera a descri��o do Feed
	 * */
	public void setDescFeed(String descFeed) {
		this.descFeed = descFeed;
	}
	/**
	 *retorna a URL da imagem do Feed
	 * */
	public String getUrlImg() {
		return urlImg;
	}
	/**
	 *cadastra ou altera a url da imagem do Feed
	 * */
	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}
	/**
	 *retorna se o Feed � ou nao favoritado
	 * */
	public boolean isFavorito() {
		return favorito;
	}
	/**
	 *altera o estado de favorito
	 * */
	public void setFavorito(boolean favorito) {
		this.favorito = favorito;
	}
}
