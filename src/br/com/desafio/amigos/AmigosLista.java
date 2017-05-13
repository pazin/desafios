package br.com.desafio.amigos;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;

public class AmigosLista {
	
	public static void main( String[] args )
	{
		
		PerfilTwitter t1 = new PerfilTwitter( "Pazin", Arrays.asList( "Jonas", "Bispo", "Brandão", "Tsai", "Arruda" ) );
		PerfilTwitter t2 = new PerfilTwitter( "Donatello", Arrays.asList( "Diogo", "Bispo", "Tsai", "Arruda" ) );
		PerfilTwitter t3 = new PerfilTwitter( "Pimenta", Arrays.asList( "Denise", "Bispo", "Vinicius", "Tsai", "Anderson" ) );
		
		List<PerfilTwitter> perfis = Arrays.asList( t1, t3, t2 );



		
	}

}
