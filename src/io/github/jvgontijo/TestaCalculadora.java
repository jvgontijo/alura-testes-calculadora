package io.github.jvgontijo;

import io.github.jvgontijo.model.Calculadora;

public class TestaCalculadora {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(10, 5);
		System.out.println(soma);
		
		soma = calc.somar(0, 5);
		System.out.println(soma);
		
		soma = calc.somar(10, -5);
		System.out.println(soma);
		
		soma = calc.somar(-10, -5);
		System.out.println(soma);
		
		soma = calc.somar(0, 0);
		System.out.println(soma);
	}
}
