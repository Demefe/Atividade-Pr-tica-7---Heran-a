package br.edu.fatecpg.atividade7heranca.model;

public class Calculadora implements OperacaoMatematica {
	
	@Override
	public double somar(double a, double b) {
		double soma = a+b;
		System.out.println(soma);
		return soma;
	}
	@Override
	public double subtrair(double a, double b) {
		double subtracao = a-b;
		System.out.println(subtracao);
		return subtracao;
	}
	@Override
	public double multiplicarr(double a, double b) {
		double multiplicacao = a*b;
		System.out.println(multiplicacao);
		return multiplicacao;
	}
	@Override
	public double dividir(double a, double b) {
		double divisao = a/b;
		System.out.println(divisao);
		return divisao;
	}
}
