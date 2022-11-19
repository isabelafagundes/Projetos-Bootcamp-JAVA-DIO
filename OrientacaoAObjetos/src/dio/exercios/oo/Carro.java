package dio.exercios.oo;

class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;


    Carro(){

    }

    public Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    String getCor() {
        return cor;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    String getModelo() {
        return modelo;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    double totalValorTanque(double valorGasolina) {

        return capacidadeTanque * valorGasolina;
    }





}//fim do programa
