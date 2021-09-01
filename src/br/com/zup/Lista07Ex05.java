package br.com.zup;

public class Lista07Ex05 {
    public static void main(String[] args) {
        //5. Escreva um programa que declare um inteiro, inicialize-o com 0, e incremente-o de 1000 em 1000, imprimindo seu valor na tela, até que seu valor seja 100000 (cem mil).

        for (int i = 0; i <= 100000; i = i + 1000) {
            System.out.println(i);
        }
    }
}
