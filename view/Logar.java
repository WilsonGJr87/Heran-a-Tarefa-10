package view;

import model.ex3.*;
import java.util.Scanner;

public class Logar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SistemaDeSeguranca seguranca = new SistemaDeSeguranca("admin","123456");

        String user;
        String senha;

        boolean logged = false;

        do 
        {
            System.out.print("Digite o usuário: ");
            user = scan.next();
            System.out.print("Digite a senha: ");
            senha = scan.next();
            System.out.println("================================");
        }
        while (!seguranca.login(user,senha));

        seguranca.logout();

    }
}