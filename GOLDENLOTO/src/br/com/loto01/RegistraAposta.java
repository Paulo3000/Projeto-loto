package br.com.loto01;

import java.util.ArrayList;
import java.util.List;

public class RegistraAposta {     

   
	private List<Integer>numerosEscolhidos;
	
	
	public  RegistraAposta() {
		numerosEscolhidos = new ArrayList<>();
	}
	
	public List<Integer> getNumerosEscolhidos(){
		return numerosEscolhidos;
	}
	
	public void setNumerosEscolhidos(List<Integer> numerosEscolhidos) {
		
		this.numerosEscolhidos.clear();
		this.numerosEscolhidos.addAll(numerosEscolhidos);
		//System.out.println("Númerors escolhidos"+ this.numerosEscolhidos);
	}
   
	
	  
	
	
	
	public void recuperaValorApostado() {
		for(Integer item: numerosEscolhidos) {
			//System.out.println(item);
		}
	}
}
