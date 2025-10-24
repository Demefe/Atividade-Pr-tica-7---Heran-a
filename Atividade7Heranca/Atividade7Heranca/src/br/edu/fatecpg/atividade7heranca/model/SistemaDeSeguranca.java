package br.edu.fatecpg.atividade7heranca.model;

public class SistemaDeSeguranca implements Autenticavel {
	
	private String loginCorreto = "admin"	;
	private String senhaCorreta = "1234";
	private boolean autenticacao = false;
	
	public boolean isAutenticacao() {
		return autenticacao;
	}
	
	
	public void login(String usuario, String senha) {
		
		if(usuario.equals(loginCorreto) && senha.equals(senhaCorreta)) {
			System.out.println("Seja Bem vindo(a)!");
			autenticacao = true;
			
		}else {
			System.out.println("Login ou senha incorretos. Tente novamente");
		}		
	}

	public void logout() {
		 autenticacao = false;
	     System.out.println("Logout efetuado.");
	}
}
