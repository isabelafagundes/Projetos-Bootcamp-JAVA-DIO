package br.com.dio.exercicios.lacos;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota, notamaior, i, soma;
        float m;
        m = 0.0f;
        soma = 0;
        i = 0;

        System.out.println("Digite 5 notas:");
        notamaior = scan.nextInt();

        do{
        nota = scan.nextInt();
        soma = soma + nota;
        if(nota > notamaior) notamaior = nota;
        i = i + 1;

        }while(i < 4);

        m = soma / 5;
        System.out.println("A média é: " + m);
        System.out.println("A maior nota é: " + notamaior);





    }
}
