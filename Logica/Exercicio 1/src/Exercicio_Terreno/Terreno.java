package Exercicio_Terreno;

import java.util.Objects;

public class Terreno {

    double largura;
    double comprimento;
    double valorMetroQuadrado;

    public Terreno(double largura, double comprimento, double valorMetroQuadrado) {
        this.largura = largura;
        this.comprimento = comprimento;
        this.valorMetroQuadrado = valorMetroQuadrado;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getValorMetroQuadrado() {
        return valorMetroQuadrado;
    }

    public void setValorMetroQuadrado(double valorMetroQuadrado) {
        this.valorMetroQuadrado = valorMetroQuadrado;
    }

    double resultadoAreaTerrenoTotal (){
        return largura * comprimento;
    }

    double precoTotalTerreno(){
        return resultadoAreaTerrenoTotal() * valorMetroQuadrado;
    }
}
