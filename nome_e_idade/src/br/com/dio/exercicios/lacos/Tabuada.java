package br.com.dio.exercicios.lacos;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

 /*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

        Scanner scan = new Scanner(System.in);
        int n, i, m, r;
        r = 0;
        m = 1;
        n = 0;

        System.out.println("Insira o número que deseja fazer uma tabuada: ");
        n = scan.nextInt();

        for(i = 0; i < 10; i = i + 1){

            r = n * m;
            System.out.println(n + " x " + m + "= " + r);
            m = m + 1;

        }


    }

}//fim do programa

