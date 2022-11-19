package br.com.dio.exercicios.lacos;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

        Scanner scan = new Scanner(System.in);

        int par, impar, num, n, quoc, resto, i;
        i = 0;
        par = 0;
        num = 0;
        impar = 0;
        n  = 0;

        System.out.println("Insira o número de número que deseja escrever: ");
        n = scan.nextInt();

        do{
            System.out.println("Insira um número: ");
            num = scan.nextInt();

            quoc = num / 2;
            resto = num - (quoc * 2);

            if(resto == 0) par = par + 1;
            if(resto == 1) impar = impar + 1;

            i = i + 1;

        }while(i < n);

        System.out.println("A quantidade de números pares que você digitou é: " + par + " e a quantidade de números impares é: " + impar);


    }
}//fim do programa
