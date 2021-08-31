package br.com.zup;

import java.util.Scanner;

public class Lista07Ex04 {
    public static void main(String[] args) {
        // 4. Faça um programa que leia n números inteiros positivos e calcule a soma desses números.
        Scanner leitorNumeros = new Scanner (System.in);
        System.out.println("Digite a quantidade de numeros desejada: ");

        // Variaveis
        int soma = 0;
        int numeros = leitorNumeros.nextInt();

        for (int i = 0; i < numeros; i = i + 1) {
            System.out.println("Digite o numero " + (i+1) +"°:");
            int numero = leitorNumeros.nextInt();
            soma += numero;
        }
        System.out.println("A soma dos números digitados é: " + soma);
    }
}
