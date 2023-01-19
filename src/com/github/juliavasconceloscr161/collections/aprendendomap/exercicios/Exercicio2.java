package com.github.juliavasconceloscr161.collections.aprendendomap.exercicios;

/*Faça um programa que simule um lançamento de dados.
Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi inserido.*/

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Exercicio2 {
    public static void main(String[] args) {
        Map<Integer, Integer> lacamentoDados = new LinkedHashMap<>();
        Random random = new Random();

        for(int i = 0; i < 100; i++){
            lacamentoDados.put(i + 1, random.nextInt(6) + 1);
        }

        for (Map.Entry<Integer, Integer> lacamento: lacamentoDados.entrySet()){
            System.out.println(lacamento.getKey() + " - " + lacamento.getValue());
        }

        Map<Integer, Integer> valorInseridoVezesIsercao = new TreeMap<>();
        Integer quantidade1 = 0;
        Integer quantidade2 = 0;
        Integer quantidade3 = 0;
        Integer quantidade4 = 0;
        Integer quantidade5 = 0;
        Integer quantidade6 = 0;
        for (Map.Entry<Integer, Integer> lacamento: lacamentoDados.entrySet()) {
            switch (lacamento.getValue()) {
                case 1: {
                    quantidade1++;
                    valorInseridoVezesIsercao.put(1, quantidade1);
                    break;
                }
                case 2: {
                    quantidade2++;
                    valorInseridoVezesIsercao.put(2, quantidade2);
                    break;
                }
                case 3: {
                    quantidade3++;
                    valorInseridoVezesIsercao.put(3, quantidade3);
                    break;
                }
                case 4: {
                    quantidade4++;
                    valorInseridoVezesIsercao.put(4, quantidade4);
                    break;
                }
                case 5: {
                    quantidade5++;
                    valorInseridoVezesIsercao.put(5, quantidade5);
                    break;
                }
                case 6: {
                    quantidade6++;
                    valorInseridoVezesIsercao.put(6, quantidade6);
                    break;
                }
            }
        }

        System.out.println("\nValor lançado e vezes que ele foi lançado: ");
        System.out.println("Caso o valor nunca tenha sido lançado, ele não aparecerá na lista abaixo.");
        for (Map.Entry<Integer, Integer> valorInsercao: valorInseridoVezesIsercao.entrySet()){
            System.out.println(valorInsercao.getKey() + " - " + valorInsercao.getValue());
        }


    }
}
