package br.edu.fatecpg.atividade7heranca.view;
import java.util.Scanner;
import br.edu.fatecpg.atividade7heranca.model.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("---Exercicio 1---");
		Calculadora c1 = new Calculadora();
		c1.somar(1, 3);
		c1.subtrair(30, 10);
		c1.multiplicarr(5, 5);
		c1.dividir(100, 5);
		
		System.out.println("\n---Exercicio 2---");
		
		PagamentoCartao pc1 = new PagamentoCartao(100);
		pc1.calcularPagamento();
		System.out.println(pc1.emitirRecibo());
		
		PagamentoDinheiro pd1 = new PagamentoDinheiro(100);
		pd1.calcularPagamento();
		System.out.println(pd1.emitirRecibo());
		
		System.out.println("\n---Exercicio 3	---");

		SistemaDeSeguranca s1 = new SistemaDeSeguranca();
		Scanner sc = new Scanner(System.in);
		
		while(s1.isAutenticacao()==false) {
		System.out.print("Usuário: ");
		String usuario = sc.nextLine();
		System.out.print("Senha: ");
		String senha = sc.nextLine();
			
		s1.login(usuario,senha);
		}
		s1.logout();
		
	  }
	}

