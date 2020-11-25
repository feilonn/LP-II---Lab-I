package execaoErro;

public class Login {
	private String usuario;
	private String senha;
	
	public Login(String usuario, String senha) {
		this.usuario = usuario;
		setSenha(senha);
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean fazerLogin(String usuario, String senha) {
		if(usuario.equals(this.usuario) && senha.equals(this.senha)) {
			System.out.println("Acesso permitido!");
			return true;
		}else {
			try {
				if(usuario.equals(this.usuario) == false && senha.equals(this.senha) == false) {
					throw new Exception("Usuario e Senha Incorretos!");
				}
				if(usuario.equals(this.usuario) == false) {
					throw new Exception("Usuario Incorreto!");
				}else if(senha.equals(this.senha) == false) {
					throw new Exception("Senha Incorreta!");
				}
			}
			catch(Exception e){
				System.out.println("Erro!"+e.getMessage());
			}
		}
		return false;
	}
}
