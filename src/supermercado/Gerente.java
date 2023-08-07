package supermercado;

public class Gerente {
	private String nome;
	private String senha;
	private boolean idGerente;
	
	public Gerente(String nome, String senha, boolean idGerente){
		setNome(nome);
		setSenha(senha);
		this.idGerente = idGerente;
	}
	
	public void setNome(String nome){
		if(nome != null){
			this.nome = nome;
		}else{
			System.out.println("O nome não pode ser vazio");
		}
	}
	
	public void setSenha(String senha){
			if(senha != null){
				this.senha = senha;
			}else{
				System.out.println("A senha não pode ser vazio");
			}
		}
	
	public boolean idGerente(){
		return idGerente;
	}
	
	public boolean autenticar(String nome, String senha){
		return this.nome.equals(nome) && this.senha.equals(senha);
		
	}

	public static void main(String[] args) {
		Gerente gerente1 = new Gerente("Sueliton Silva","minhaSenha", true);
		
		String nomeGerente = "Sueliton Silva";
        	String senhaGerente = "minhaSenha";
        
        	if(gerente1.autenticar(nomeGerente, senhaGerente)){
           		 System.out.println("Gerente autenticado com sucesso!");
        	}else{
            		 System.out.println("Autenticação falhou. Verifique o nome e a senha.");
        	}
	}

}
