package org.samuelcursine;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a frequência do aluno em %: ");
        int frequencia = sc.nextInt();

        System.out.println("Digite a média final do aluno: ");
        float media = sc.nextFloat();

        if (frequencia >= 75) {
            if (media >= 7 && media <= 10) {
                System.out.println("O aluno foi aprovado");
            }
            else if (media >= 5 && media > 7) {
                System.out.println("O aluno está de recuperação");
            }
            else if (media < 5) {
                System.out.println("O aluno está reprovado");
            }
            else {
                System.out.println("Insira uma nota válida");
            }
        }
        else {
            System.out.println("O aluno está reprovado por frequencia");
        }


    }
}
