package br.com.zup;

import java.util.Scanner;

public class LevelUPDesafio {
    public static void main(String[] args) {
        //LEVEL UP. Faça um programa que some os números ímpares contidos em um intervalo definido pelo usuário. O usuário define o valor inicial do intervalo e o valor final deste intervalo e o programa deve somar todos os números ímpares contidos neste intervalo. Caso o usuário digite um intervalo inválido (começando por um valor maior que o valor final) deve ser escrito uma mensagem de erro na tela, “Intervalo de valores inválido” e o programa termina.

       /* 1- pedir para o usuario definir o intervalo.
        -começo e fim dos numeros
        -se o usuario digitar o intervalo invalido (verificar se o valor final < valor inicial) encerrar o programa “Intervalo de valores inválido” <- ficar dentro do else
        criar o for dentro do if

        2- o que é um numero impar (verificar se o numero é impar) //% 2 != 0

        3- se o numero for impar somar a var soma */
            /*valorInicial = valorInicial % 2 != 0;
            valorFinal = valorFinal % 2 != 0;
            soma = valorInicial - valorFinal;
            System.out.println("A soma é: " +soma);*/

        Scanner leitorImpares = new Scanner (System.in);

        //variaveis
        double valorInicial;
        double valorFinal;
        double soma = 0;

        System.out.println("Insira o valor inicial:");
        valorInicial = leitorImpares.nextDouble();
        System.out.println("Insira o valor final:");
        valorFinal = leitorImpares.nextDouble();

        //Se o usuario digitar um intervalo invalido
        if (valorFinal < valorInicial) {
            System.out.println("Intervalo de valores inválido");
        } if (valorInicial % 2 != 0) {
                for (valorInicial = 0; valorInicial >= valorFinal; valorInicial += 2);
                soma += valorInicial;
            }
            System.out.println("a soma dos numeros ímpares é: " + valorInicial);

        }

    }