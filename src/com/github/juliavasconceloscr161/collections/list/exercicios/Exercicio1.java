package com.github.juliavasconceloscr161.collections.list.exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/* Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista.

Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
– Fevereiro e etc). */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();

        for(int i = 0; i < 6; i++) {
            System.out.println("Insira a temperatura do mês " + (i+1));
            double temperatura = sc.nextDouble();
            temperaturas.add(temperatura);
        }

        double soma = 0;
        Iterator<Double> iterator = temperaturas.iterator();
        while(iterator.hasNext()) {
            double next = iterator.next();
            soma += next;
        }

        double media = soma/temperaturas.size();
        System.out.println("A média das temperaturas é " + media);

        for(int i = 0; i < temperaturas.size(); i++) {
            if(temperaturas.get(i) > media) {
                switch (i) {
                    case 0:
                    {
                        System.out.println("Temperatura: " + temperaturas.get(i) +  "1 - Janeiro");
                        break;
                    }
                    case 1:
                    {
                        System.out.println("Temperatura: " + temperaturas.get(i) +  "2 - Fevereiro");
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Temperatura: " + temperaturas.get(i) +  "3 - Março");
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Temperatura: " + temperaturas.get(i) +  "4 - Abril");
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Temperatura: " + temperaturas.get(i) +  "5 - Maio");
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Temperatura: " + temperaturas.get(i) +  "6 - Junho");
                        break;
                    }
                }
            }
        }
//        for(Double temp: temperaturas) {
//            if(temp > media) {
//                int index = temperaturas.indexOf(temp);
//                switch(index) {
//                    case 0:
//                    {
//                        System.out.println("Temperatura: " + temp +  "1 - Janeiro");
//                        break;
//                    }
//                    case 1:
//                    {
//                        System.out.println("Temperatura: " + temp +  "2 - Fevereiro");
//                        break;
//                    }
//                    case 2:
//                    {
//                        System.out.println("Temperatura: " + temp+  "3 - Março");
//                        break;
//                    }
//                    case 3:
//                    {
//                        System.out.println("Temperatura: " + temp +  "4 - Abril");
//                        break;
//                    }
//                    case 4:
//                    {
//                        System.out.println("Temperatura: " + temp +  "5 - Maio");
//                        break;
//                    }
//                    case 5:
//                    {
//                        System.out.println("Temperatura: " + temp +  "6 - Junho");
//                        break;
//                    }
//                }
//            }
//        }
    }
}
