package org.samuelcursine;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade =  sc.nextInt();

        if (idade >= 16) {
            System.out.println("Você pode votar!");
        }

        if (idade >= 18) {
            System.out.println("Você pode dirigir!");
        }

        if (idade >= 60) {
            System.out.println("Você é idoso!");
        }



    }

}
