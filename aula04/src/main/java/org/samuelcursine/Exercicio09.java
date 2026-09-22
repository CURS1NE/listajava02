package org.samuelcursine;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double bonus = 0.0;
        int percentual = 0;

        System.out.println("Digite o saláio do funcionário: ");
        Double salario =  sc.nextDouble();

        System.out.println("Digite o tempo de casa: ");
        int anoDeCasa =  sc.nextInt();

        if (anoDeCasa >= 1 && anoDeCasa <= 3) {
        percentual = 5;
        bonus =  salario * 0.05;
        }

        else if (anoDeCasa > 3 && anoDeCasa <= 10){
            percentual = 10;
            bonus = salario * 0.1;
        }

        else if (anoDeCasa > 10){
            percentual = 15;
            bonus = salario * 0.15;
        }

        System.out.println("Percentual de bonus: " + percentual + "%");
        System.out.println("Valor de bônus: R$" + bonus);

    }
}