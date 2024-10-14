package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GeradorConcurso {

	LocalDate dataAtual = LocalDate.now();
	DateTimeFormatter formatoNumerico = DateTimeFormatter.ofPattern("yyMMdd"); 
	private String converter;

	public String  mostrarConcurso() {

		converter = dataAtual.format(formatoNumerico);	
		return converter;

	}

}
