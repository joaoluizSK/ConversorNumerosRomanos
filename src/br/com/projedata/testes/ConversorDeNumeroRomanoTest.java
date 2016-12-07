package br.com.projedata.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.projedata.conversor.ConversorDeNumeroRomano;

public class ConversorDeNumeroRomanoTest {
	
	@Test
	public void deveEntenderOSimboloI(){
		ConversorDeNumeroRomano conversor = new ConversorDeNumeroRomano();
		int numero = conversor.converter("I");
		assertEquals(1, numero);
	}

}
