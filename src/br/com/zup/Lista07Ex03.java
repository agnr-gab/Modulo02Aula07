package br.com.zup;

import java.util.Scanner;

public class Lista07Ex03 {
    public static void main(String[] args) {
        //3. Escreva um programa que leia 10 números e escreva o menor valor lido é o maior valor lido.
        Scanner leitorNumeros = new Scanner(System.in);

        //variaveis
        int maior = 0;
        int menor = 0;

        for (int i = 0; i < 10; i = i + 1) {
            System.out.println("Digite o numero " + (i+1) +"°:");
            int numero = leitorNumeros.nextInt();
            if (i == 0) {
                maior = numero; // evitar que o maior numero seja 0
                menor = numero; // evitar que o menor numero seja 0
            }
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }

        }

        System.out.println("O menor numero digitado é: " + menor);
        System.out.println("O maior numero digitado é: " + maior);
    }
}
