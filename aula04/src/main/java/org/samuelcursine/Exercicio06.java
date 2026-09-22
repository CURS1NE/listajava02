package org.samuelcursine;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double frete = 0.0;
        Double total = 0.0;

        System.out.println("Digite o valor da compra: ");
        Double compra = sc.nextDouble();

        if (compra < 199.0) {
            frete = 24.90;
        }

        total = compra + frete;

        System.out.println("Valor da compra: R$" + compra);
        System.out.println("Valor do frete: R$" + frete);
        System.out.println("Total a ser pago: R$" + total);


    }

}
