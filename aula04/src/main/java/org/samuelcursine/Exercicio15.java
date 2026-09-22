package org.samuelcursine;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o tipo de veículo (1 - Carro | 2 - Moto): ");
        int tipoVeiculo = scanner.nextInt();

        double tarifaHora;

        switch (tipoVeiculo) {
            case 1 -> tarifaHora = 8.00;
            case 2 -> tarifaHora = 5.00;
            default -> {
                System.out.println("Opção inválida!");

                return;
            }
        }


        System.out.print("Digite a quantidade de horas no estacionamento: ");
        int horas = scanner.nextInt();

        double valorTotal = tarifaHora * horas;


        System.out.print("Possui cupom de desconto? (sim/nao): ");
        String temCupom = scanner.next();

        if (temCupom.equalsIgnoreCase("sim")) {
            if (valorTotal >= 50.00) {
                valorTotal -= valorTotal * 0.20; // 20% de desconto
                System.out.println("Cupom aplicado com sucesso (20% de desconto)!");
            } else {
                System.out.println("O cupom vale apenas para compras de R$ 50,00 ou mais.");
            }
        }


        if (horas > 12) {
            System.out.println("Aviso: Permanência longa.");
        }
        if (horas > 24) {
            System.out.println("Aviso: Cobrança de diária aplicável.");
        }


        if (horas <= 2) {
            System.out.println("Classificação da permanência: Curta");
        } else if (horas <= 6) {
            System.out.println("Classificação da permanência: Média");
        } else {
            System.out.println("Classificação da permanência: Longa");
        }


        System.out.printf("Valor final a pagar: R$ %.2f%n", valorTotal);
    }
}
