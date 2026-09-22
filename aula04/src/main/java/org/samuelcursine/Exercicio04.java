package org.samuelcursine;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num1 =  sc.nextInt();

        System.out.println("Digite outro numero inteiro: ");
        int num2 =  sc.nextInt();

        if (num2 == 0) {
            System.out.println("Não foi possível realizar a verificação");
        }

        else if (num1 % num2 == 0) {
           System.out.println("O " + num1 + " é divisivel por " + num2);
        }

        else {
            System.out.println("O "+ num1 + " não é divisivel por " + num2);
        }


    }
}
