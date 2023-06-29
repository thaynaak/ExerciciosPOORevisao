package com.jovemprogramador.cursojavatarde.lista04;

public class Calculadora {
	public double num1;
	public double num2;
	public double resultado;

	Calculadora() {

	}

//	public Calculadora(double num1, double num2) {
//		this.num1 = num1;
//		this.num2 = num2;
//	}

	public double getNum1() {
		return num1;
	}

	public double getNum2() {
		return num2;
	}
	public void setNum1(double novoNum1) {
		num1 = novoNum1;
	}

	public void setNum2(double novoNum2) {
		num2 = novoNum2;
	}

	double somar() {
		resultado = num1 + num2;
		return resultado;
	}

	double diminuir() {
		resultado = num1 - num2;
		return resultado;
	}

	double multiplicar() {
		resultado = num1 * num2;
		return resultado;
	}

	double dividir() {
		resultado = num1 / num2;
		return resultado;
	}
	double pontenciar() {
		resultado = Math.pow (num1,num2);
		return resultado;
	}
}
