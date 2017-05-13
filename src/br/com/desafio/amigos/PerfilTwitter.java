package br.com.desafio.amigos;

import java.util.List;

public class PerfilTwitter {

	private String nome;
	
	private List<String> amigos;

	public String getNome()
	{
		return nome;
	}

	public void setNome( String nome )
	{
		this.nome = nome;
	}

	public List<String> getAmigos()
	{
		return amigos;
	}

	public void setAmigos( List<String> amigos )
	{
		this.amigos = amigos;
	}

	public PerfilTwitter( String nome, List<String> amigos )
	{
		super();
		this.nome = nome;
		this.amigos = amigos;
	}

	@Override
	public String toString()
	{
		return String.format( "PerfilTwitter [nome=%s, amigos=%s]", nome, amigos );
	}
}
