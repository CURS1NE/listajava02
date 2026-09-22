package org.samuelcursine;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String admin = "Samuel";
        String senha = "java123" ;


        System.out.println("Digite o nome de usuário: ");
        String user = sc.nextLine();

        System.out.println("Digite a senha: ");
        String uSenha = sc.nextLine();


        if (user.equalsIgnoreCase(admin)) {
            if (uSenha.equals(senha)) {
                System.out.println("Acesso liberado! ");
            }

            else {
                System.out.println("Senha incorreta! Tente novamente");
            }
        }
        else {
            System.out.println("Usuário não encontrado, tente novamente!");
        }






    }
}
