package com.jovemprogramador.cursojavatarde.lista04;

import java.util.Scanner;

public class CalculadoraTeste {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculadora calculo = new Calculadora();

		System.out.println("Digite o primeiro numero: ");
		calculo.setNum1(scan.nextDouble());
		
		System.out.println("Digite o segundo numero: ");
		calculo.setNum2(scan.nextDouble());
		
		calculo.somar();
		System.out.println("O resultado da soma é: " + calculo.resultado);
		
		System.out.println("Digite o primeiro numero: ");
		calculo.setNum1(scan.nextDouble());
		
		System.out.println("Digite o segundo numero: ");
		calculo.setNum2(scan.nextDouble());
		
		calculo.diminuir();
		
		System.out.println("O resultado da subtração é: " + calculo.resultado);
		System.out.println("Digite o primeiro numero: ");
		calculo.setNum1(scan.nextDouble());
		
		System.out.println("Digite o segundo numero: ");
		calculo.setNum2(scan.nextDouble());
		
		calculo.multiplicar();
		System.out.println("O resultado da multiplicação é: " + calculo.resultado);
		
		System.out.println("Digite o primeiro numero: ");
		calculo.setNum1(scan.nextDouble());
		
		System.out.println("Digite o segundo numero: ");
		calculo.setNum2(scan.nextDouble());
		
		calculo.dividir();
		System.out.println("O resultado da divisão é: " + calculo.resultado);
		
		System.out.println("Digite o primeiro numero: ");
		calculo.setNum1(scan.nextDouble());
		
		System.out.println("Digite o segundo numero: ");
		calculo.setNum2(scan.nextDouble());
		
		calculo.pontenciar();
		System.out.println("O resultado da potenciação é: " + calculo.resultado);
		
	scan.close();}
}