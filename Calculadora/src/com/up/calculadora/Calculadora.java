package com.up.calculadora;

import java.util.ArrayList;

/**
 * Classe para executar as a��es da calculadora.
 * 
 * @author 1829203
 *
 */
public class Calculadora {
	
	/**
	 * Calcula a soma entre dois n�meros
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static double soma(int a, int b) {
		return a + b;
	}
	
	/**
	 * Calcula a subtra��o entre dois n�meros
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static double subtracao(int a, int b) {
		return a - b;
	}
	
	/**
	 * Calcula a multiplica��o entre dois n�meros
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static double multiplicacao(int a, int b) {
		return a * b;
	}
	
	/**
	 * Calcula a divis�o entre dois n�meros
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static double divisao(double a, double b) {
		return a / b;
	}
	
	/**
	 * Realiza o c�lculo de potencia��o
	 * 
	 * @param a base
	 * @param b expoente
	 * @return
	 */
	public static double potenciacao(int a, int b) {
		return Math.pow(a, b);
	}
	
	/**
	 * Calcula a ra�z quadrada de um n�mero
	 * 
	 * @param a
	 * @return
	 */
	public static double raizQuadrada(int a) {
		return Math.sqrt(a);
	}
	
	/**
	 * Calcula as ra�zes de uma equa��o do segundo grau (Baskara)
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static double[] bhaskara(double a, double b, double c) {
		
		double delta = Math.pow(b, 2) -4 * a * c;
		
		if(delta < 0) {
			// N�o tem ra�zes reais
			double[] vazio = {};
			return vazio;
		}
		
		if(delta == 0) {
			// Apenas uma ra�z real
			double raiz = (-b) / (2 * a);
			double[] umaRaiz = {raiz};
			return umaRaiz;
		}
		
		// Duas ra�zes reais
		double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
		double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
		double[] raizes = {raiz1, raiz2};
		return raizes;
	}
	
	// Funcionalidades solicitadas pelo professor para exercitar testes de desvio
	
	public static int doisValores(int n1, int n2) {
		int res;
		if (n1 % 2 != 0 || n2 % 2 != 0) {
			res = n1 * n2;
			if(res > 10) {
				return res;
			}
			else {
				return res += 10; 
			}
		}
		else {
			res = n1 + n2;
			if(res > 5) {
				return res += 5;
			}
			else {
				return res;
			}
		}
	}

	public static String calcularPoligonos(int l, ArrayList<Integer> t) {
		if(l >= 3) {
		if (l == 3) {
			int x = t.get(0);
			int y = t.get(1);
			int z = t.get(2);

			if (x == y && x == z) {
				return "O Poligono � um Triangulo Equilatero";
			} else if (x == y || x == z) {
				return "O Poligono � um Triangulo Isosceles";
			} else {
				return "O Poligono � um Triangulo Escaleno";
			}
		} else if (l == 4) {
			int v = t.get(0);
			int x = t.get(1);
			int y = t.get(2);
			int z = t.get(3);

			if (v == x && y == z && z == v) {
				return "O Poligono � um Quadrado";
			} else {
				return "O Poligono tem quatro lados";
			}
		} else {
			return "O Poligono tem " + l + " lados";
		}
		}else {
			return "N�o � um poligono";
		}

	}

	public static Integer calcularPerimetro(ArrayList<Integer> tamanhos) {
		Integer perimetro = 0;
		for (int t : tamanhos) {
			perimetro += t;
		}
		return perimetro;
	}

	public static void angulo() {
		double n1 = Console.recuperaDecimal("\nInforme o valor do �ngulo: ");
		Math.toRadians(n1);
		if (n1 < 90) {
			double res = Math.sin(n1);
			System.out.println("Valor do seno: " + res);
		} else {
			double res = Math.cos(n1);
			System.out.println("Valor do cosseno: " + res);
		}
		double res = Math.tan(n1);
		if (res != 1) {
			System.out.println("Valor da tangente: " + res);
		}
	}
	
}