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

    public static String calcularIMC(double peso, double altura) {

        double resultado = (int) (peso / Math.pow(altura, 2));

        if (resultado < 20){
            return "Você está magro demais, pode comer até umas horas" ;
        }else  if(resultado >= 20 && resultado <= 24){
            return "Você está normal, pode comer moderadamente" ;
        }else  if(resultado >= 25 && resultado <= 29){
            return "Você está acima do peso!" ;
        }else  if(resultado >= 30 && resultado <= 34){
            return "Você está obeso!" ;
        }else  if(resultado > 34){
            return "Você está muito obeso!" ;
        }

        return null;

    }
}
