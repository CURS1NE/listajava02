package org.samuelcursine;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora do dia(0 a 23): ");
        int hora =  sc.nextInt();

        if (hora >= 0 && hora <= 11) {
            System.out.println("Bom dia flor do dia!");

        }

        else if (hora > 11 && hora < 18){
            System.out.println("Boa tarde!");
        }

        else if (hora >= 18 && hora <= 23) {
            System.out.println("Boa noite!");

        }

        else {
            System.out.println("Por favor, insira um número válido(0 a 23)");

        }
    }
}
