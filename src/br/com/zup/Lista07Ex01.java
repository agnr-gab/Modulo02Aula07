package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Lista07Ex01 {
    public static void main(String[] args) {
        //1 - Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1, 2 vezes. A primeira vez com "for" e a segunda com "while".

        for (int i = 1; i <= 100; i = i + 1) {
            System.out.println(i);
        }
        List<Integer> numbers = new ArrayList<Integer>();
        int result = 0;
        int i = 1;
        while (true) {
            result = i++;
            if (result > 100) {
                break;
            }
            numbers.add(result);
        }

        System.out.println(numbers);
    }
}
