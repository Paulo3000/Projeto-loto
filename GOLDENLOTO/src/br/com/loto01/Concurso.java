package br.com.loto01;

import java.util.Date;
import java.util.Set;

public class Concurso {

	
	private  String id;
	private Date date;
	private Date dataSorteio;
	private int numerosSorteados;
	private Set<Integer>listaAposta;
	
	
	
	public enum status{
		EM_ANDAMENTO,
		FINALIZADO,
		CANCELADO;
		
		
	}
	
}
