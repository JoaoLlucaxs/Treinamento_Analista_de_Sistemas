package Exercicio_Terreno;

import java.util.Locale;
import java.util.Scanner;

public class Resultado {
    public static void main(String[] args) {
        //Problema "terreno"
        //Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma
        //casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida,
        //o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com
        //duas casas decimais, conforme exemplo.

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // aceitar ponto números flutuantes

        double largura , comprimento , valorMetroQuadrado;

        System.out.println("Informe a largura do terreno : ");
        largura = sc.nextDouble();

        System.out.println("Informe o comprimento do terreno : ");
        comprimento = sc.nextDouble();

        System.out.println("Informe o valor do Metro quadrado para realizarmos o cálculo : ");
        valorMetroQuadrado = sc.nextDouble();

        Terreno terreno = new Terreno(largura,comprimento,valorMetroQuadrado);
        double calculoTotal = terreno.resultadoAreaTerrenoTotal();
        double valorTerreno = terreno.precoTotalTerreno();

        System.out.println("Área do terreno : " + calculoTotal);
        System.out.println("Preço do terreno : " + valorTerreno );

        sc.close();
    }
}
