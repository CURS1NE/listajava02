package org.samuelcursine;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o saldo da conta: R$ ");
        double saldo = sc.nextDouble();

        System.out.print("Digite o limite diário de saque: R$ ");
        double limiteDiario = sc.nextDouble();

        System.out.print("Digite o valor do saque solicitado: R$ ");
        double valorSaque = sc.nextDouble();

        if (saldo < valorSaque) {
            System.out.println("Saldo insuficiente!");
        } else {
            if (valorSaque > limiteDiario) {
                System.out.println("O valor solicitado ultrapassa o limite diário de saque");
            } else {
                saldo = saldo - valorSaque;
                System.out.println("Saque realizado com sucesso!");
                System.out.printf("Novo saldo: R$ %.2f%n", saldo);
            }
        }

    }
}