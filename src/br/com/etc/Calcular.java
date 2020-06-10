package br.com.etc;

import java.util.Scanner;

public class Calcular {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Qual é seu altura: ");
        double altura = scanner.nextDouble();


        System.out.println("Resultado: " + calcularIMC(peso, altura));
    }

    public static double calcularIMC(double peso, double altura) {

        return peso / Math.pow(altura, 2);

    }
}
