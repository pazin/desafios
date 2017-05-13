package br.com.desafio.numeros;

import java.util.Arrays;
import java.util.List;

public class NumerosEntre {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList( 1, 3, 7, 9, 20, 50, 90 );
		
		Integer valorTeste = 11;
		
		/**
		 * Será feito com reduce
		 * 
		 * O problema é fazer um : 	reduce de Stream<T> -> T
		 * virar um : 				reduce de Stream<T> -> U
		 * 
		 * Porque temos que reduzir uma lista de Integer para apenas uma instância de Vizinhos
		 */
		
		Vizinhos result = numeros.stream()
				.reduce( new Vizinhos(valorTeste, 0, 0), 
						(viz, i) -> viz.analisa(i), 
						(viz1, viz2) -> viz1);   // Esse terceiro termo (BinaryOperator) é inútil mas tem que ser fornecido para poder converter de um "reduce de Stream<T> -> T" para um "reduce de Stream<T> -> U"  
		
		System.out.println(result);
	}

}
