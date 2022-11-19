package dio.exercicios;

 class Calculadora implements OperadoresMat {
     public Calculadora() {
         super();
     }

     @Override
     public void soma(double valor1, double valor2) {
         System.out.println("Soma: " + (valor1 + valor2));

     }

     @Override
     public void subtracao(double valor1, double valor2) {
         System.out.println("Subtração: " + (valor1 - valor2));

     }

     @Override
     public void multiplicacao(double valor1, double valor2) {
         System.out.println("Multiplicação: " + (valor1 * valor2));

     }

     @Override
     public void divisao(double valor1, double valor2) {
         System.out.println("Divisão: " + (valor1 / valor2));

     }
 }
