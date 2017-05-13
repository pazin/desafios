package br.com.desafio.numeros;

public class Vizinhos{
	
	private Integer valorTeste;
	private Integer vizinhoEsquerda;
	private Integer vizinhoDireita;

	public Vizinhos()
	{
		super();
		this.valorTeste = 0;
		this.vizinhoEsquerda = 0;
		this.vizinhoDireita = 0;
	}

	public Vizinhos(Integer valorTeste, Integer esquerda, Integer direita )
	{
		super();
		this.valorTeste = valorTeste;
		this.vizinhoEsquerda = esquerda;
		this.vizinhoDireita = direita;
	}
	
	public Vizinhos analisa(Integer atual){
		
		if ( this.valorTeste.compareTo( atual ) >= 0 )
			this.vizinhoEsquerda = atual;

		if ( this.valorTeste.compareTo( atual ) <= 0 && this.vizinhoDireita <= this.valorTeste )
			this.vizinhoDireita = atual;
		
		return this;
	}

	public Integer getValorTeste()
	{
		return valorTeste;
	}

	public void setValorTeste( Integer valorTeste )
	{
		this.valorTeste = valorTeste;
	}

	public Integer getVizinhoEsquerda()
	{
		return vizinhoEsquerda;
	}

	public void setVizinhoEsquerda( Integer vizinhoEsquerda )
	{
		this.vizinhoEsquerda = vizinhoEsquerda;
	}

	public Integer getVizinhoDireita()
	{
		return vizinhoDireita;
	}

	public void setVizinhoDireita( Integer vizinhoDireita )
	{
		this.vizinhoDireita = vizinhoDireita;
	}

	
}