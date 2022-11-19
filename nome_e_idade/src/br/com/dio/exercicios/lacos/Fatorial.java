package br.com.dio.exercicios.lacos;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, i, multiplicacao, n2;


        System.out.println("Insira o número que deseja ver seu fatorial: ");
        n = scan.nextInt();

        multiplicacao = 1;

        for(i = n; i >= 1; i = i - 1){


            multiplicacao = multiplicacao * i;


        }
        System.out.println(n + "! = " + multiplicacao );

    }



}
