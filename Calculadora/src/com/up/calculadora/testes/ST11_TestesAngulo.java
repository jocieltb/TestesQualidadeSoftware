package com.up.calculadora.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.up.calculadora.Calculadora;

class ST11_TestesAngulo {

	@Test
	void CT01() {
		assertEquals(1, Calculadora.doisValores(1, 1));
	}

}
