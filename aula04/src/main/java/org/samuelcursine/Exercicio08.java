package org.samuelcursine;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o limite de velocidade da via: ");
        int vmax =  sc.nextInt();

        System.out.println("Digite a velocidade do veículo: ");
        int vcarro =  sc.nextInt();


        if (vcarro <= vmax){
            System.out.println("Sem infração");
        }

        else if (vcarro > vmax && vcarro <= (vmax + (vmax * 0.2))) {
            System.out.println("Infração média");
        }

        else if (vcarro > (vmax + (vmax * 0.2)) && vcarro <= (vmax + (vmax * 0.5))) {
            System.out.println("Infração grave");

        }

        else {
            System.out.println("Infração gravíssima");
        }

    }
}
