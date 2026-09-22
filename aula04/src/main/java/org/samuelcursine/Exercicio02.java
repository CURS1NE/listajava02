package org.samuelcursine;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num =  sc.nextInt();

        if (num > 0) {
            System.out.println("O número é positivo");
        }

        if (num % 2 == 0) {
            System.out.println("O número é par");
        }

        if (num % 5 == 0) {
            System.out.println("O número é multiplo de 5");
        }

        if (Math.abs(num) > 10 && Math.abs(num) < 99) {
            System.out.println("O número tem dois digitos");
        }




    }
}