package Exercicio_MediaIdade;

import java.util.Locale;
import java.util.Scanner;

// Problema "idades"
//Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os
//nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo.

public class Resultado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       scanner.useLocale(Locale.US);

       String nome1 = "" , nome2= "";
       int idade1 = 0 , idade2 = 0;

       int count = 2;
       for (int contador = 1; contador <= count ; contador++){

           if(contador == 1){
               System.out.println("Informe o nome da pessoa  : " + contador);
                nome1=scanner.nextLine();

                System.out.println("Informe a idade da pessoa : " + contador);
                idade1 = scanner.nextInt();
               scanner.nextLine(); // Consome o restante da linha após a idade.

           }else if (contador == 2){
               System.out.println("Informe o nome da pessoa  : " + contador);
               nome2=scanner.nextLine();

               System.out.println("Informe a idade da pessoa : " + contador);
               idade2 = scanner.nextInt();
           }
       }

       double resultado= calculoMedia(idade1, idade2);

       System.out.println("A idade média de : " + nome1 +  " e " + nome2 + " é = " + resultado);

       scanner.close();
    }

    static double calculoMedia(int idade1 , int idade2){
        return (double) (idade1 + idade2) / 2; // casting para double
    }
}
