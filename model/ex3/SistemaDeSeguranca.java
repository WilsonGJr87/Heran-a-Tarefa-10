package model.ex3;

public class SistemaDeSeguranca implements Autenticavel {

    private String usuario;
    private String senha;
    private boolean logado = false;

    public SistemaDeSeguranca(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public boolean login(String usuario, String senha) {
        if (logado) {
            System.out.println("O usuário já está logado!");
            return false;
        }

        if (this.usuario.equals(usuario) && this.senha.equals(senha))
        {
            logado = true;
            System.out.println("Logado com sucesso!");
            System.out.println("================================");
            System.out.println("Boas vindas, " + usuario + "!");
            return true;
        }
        else
            System.out.println("Usuário ou senha estão incorretos!");
        return false;

    }
    public void logout() {
        if (!logado) {
            System.out.println("É preciso estar logado para dar logout!");
        }

        logado = false;
        System.out.println("Deslogado com sucesso, Até logo!");
    }
}