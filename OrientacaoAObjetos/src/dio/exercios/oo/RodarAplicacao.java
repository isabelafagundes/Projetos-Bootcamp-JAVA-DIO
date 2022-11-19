package dio.exercios.oo;

import com.sun.security.jgss.GSSUtil;

public class RodarAplicacao {
    public static void main(String[] args) {
    Carro carro1 = new Carro();

    carro1.setCor("Preto");
    carro1.setModelo("Gol");
    carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(7.00));
        System.out.println("------------------------------------");
        Carro carro2 = new Carro("Prata", "Uno", 66);
        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(7.20));

    }//fim do main

}//fim do programa