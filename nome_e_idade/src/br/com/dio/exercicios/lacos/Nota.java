package br.com.dio.exercicios.lacos;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        /*
    Faça um programa que peça uma nota, entre zero e dez.
    Mostre uma mensagem caso o valor seja inválido
    e continue pedindo
    até que o usuário informe um valor válido.
    */

     Scanner scan = new Scanner(System.in);

     int nota;
        System.out.println("Nota (de zero a dez) : ");
        nota = scan.nextInt();

     while(nota < 0 | nota > 10){
         System.out.println("Insira uma nota válida! Digite novamente...");
         nota = scan.nextInt();
     }

    }
}
