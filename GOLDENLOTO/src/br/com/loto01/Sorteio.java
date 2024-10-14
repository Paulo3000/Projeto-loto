package br.com.loto01;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Sorteio {

	private Set<Integer> numerosGerados = new HashSet<>();
	private Random rand = new Random();
	Concurso concurso = new Concurso();



	
	
	public void realizandoUmSorteio() {

		System.out.printf("Os númeos sorteados do concurso 01254 foram:\n ");

		for (int i = 0; i <= 15; i++) {

			numerosGerados.add(rand.nextInt(1, 25));
		}

		for (int item : numerosGerados) {

			System.out.printf(" " + item);
		}

	}

}
