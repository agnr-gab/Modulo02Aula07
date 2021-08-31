package br.com.zup;

import java.util.Scanner;

public class Lista07Ex02 {
    public static void main(String[] args) {
        //2. Faça um programa que leia números inteiros e imprima sua média.

        Scanner leitorNumeros = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros desejada: ");

        //variaveis
        int numeros;
        numeros = leitorNumeros.nextInt();
        int soma = 0;
        int media = 0;

        for (int i = 0; i < numeros; i = i + 1) {
            System.out.println("Digite o " + (i + 1) + "° valor: ");
            int numero = leitorNumeros.nextInt();
            soma += numero;
        }
        media = soma / numeros;
        System.out.println("A média dos numeros digitados é: " + media);
    }
}
