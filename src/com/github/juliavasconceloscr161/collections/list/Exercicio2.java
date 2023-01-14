package com.github.juliavasconceloscr161.collections.list;

/*Utilizando listas, faça um programa que faça 5 perguntas para uma
pessoa sobre um crime. As perguntas são:

"Telefonou para a vítima?"

"Esteve no local do crime?"

"Mora perto da vítima?"

"Devia para a vítima?"

"Já trabalhou com a vítima?"

Se a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
"Assassina". Caso contrário, ela será classificado como "Inocente".*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();
        int quantidadeSim = 0;
        int quantidadeNao = 0;

        System.out.println("Telefonou para a vítima?");
        String resposta = sc.next();
        respostas.add(resposta);
        System.out.println("Esteve no local do crime?");
        resposta = sc.next();
        respostas.add(resposta);
        System.out.println("Mora perto da vítima?");
        resposta = sc.next();
        respostas.add(resposta);
        System.out.println("Devia para a vítima?");
        resposta = sc.next();
        respostas.add(resposta);
        System.out.println("Já trabalhou com a vítima?");
        resposta = sc.next();
        respostas.add(resposta);

        System.out.println(respostas);

        for(String r: respostas) {
            if(r.equalsIgnoreCase("Sim")) {
                quantidadeSim++;
            }
        }

        switch (quantidadeSim) {
            case 2: {
                System.out.println("Suspeita");
                break;
            }
            case 3,4: {
                System.out.println("Cúmplice");
                break;
            }
            case 5: {
                System.out.println("Assassina");
                break;
            }
            default: {
                System.out.println("Inocente");
                break;
            }
        }
    }
}
