package org.samuelcursine;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Digite um numero: ");
        Double num1 = sc.nextDouble();

        System.out.println("Digite outro numero: ");
        Double num2 = sc.nextDouble();

        System.out.println("=============================");
        System.out.println("1- Soma");
        System.out.println("2- Subtracao");
        System.out.println("3- Multiplicacao");
        System.out.println("4- Divisao");
        System.out.println("=============================");


        System.out.println("Digite a operacao desejada: ");
        int opcao = sc.nextInt();



        switch (opcao) {
            case 1 -> System.out.println("O resultado da soma é: " + (num1 + num2) );
            case 2 -> System.out.println("O resultado da subtração é: " + (num1 - num2) );
            case 3 -> System.out.println("O resultado da multiplicação é: " + (num1 * num2) );
            case 4 -> {
                if (num2 == 0) {
                    System.out.println("Não foi possível concluir a divisão");
                }
                else {
                    System.out.println("O resultado da divisão é: " + (num1 / num2) );
                }
                ;
            }
            default -> System.out.println("Erro. Por gentileza inserir um número válido");
        }


    }
}
