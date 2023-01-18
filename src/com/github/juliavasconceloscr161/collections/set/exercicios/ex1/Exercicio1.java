package com.github.juliavasconceloscr161.collections.set.exercicios.ex1;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("Vermelho");
        coresArcoIris.add("Laranja");
        coresArcoIris.add("Amarelo");
        coresArcoIris.add("Verde");
        coresArcoIris.add("Azul");
        coresArcoIris.add("Azul-escuro");
        coresArcoIris.add("Violeta");

        System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra:");
        for(String cor: coresArcoIris){
            System.out.println(cor);
        }

        System.out.print("A quantidade de cores que o arco-íris tem: ");
        System.out.println(coresArcoIris.size());

        System.out.println("Exiba as cores em ordem alfabética:");
        Set<String> coresArcoIris2 = new TreeSet<>();
        coresArcoIris2.addAll(coresArcoIris);
        for(String cor: coresArcoIris2){
            System.out.println(cor);
        }

        System.out.println("Exiba as cores na ordem inversa da que foi informada:");
        Set<String> coresArcoIris3 = new LinkedHashSet<>();
        coresArcoIris3.add("Vermelho");
        coresArcoIris3.add("Laranja");
        coresArcoIris3.add("Amarelo");
        coresArcoIris3.add("Verde");
        coresArcoIris3.add("Azul");
        coresArcoIris3.add("Azul-escuro");
        coresArcoIris3.add("Violeta");

        List<String> coresArcoIris4 = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIris4);
        for(String cor: coresArcoIris4){
            System.out.println(cor);
        }

        System.out.println("Exiba todas as cores que começam com a letra ”V”:");
        Iterator<String> iterator = coresArcoIris.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if(next.startsWith("V")){
                System.out.println(next);
            }
        }

        System.out.println("Remova todas as cores que não começam com a letra “V”:");
        Iterator<String> iterator2 = coresArcoIris.iterator();
        while (iterator2.hasNext()){
            String next = iterator2.next();
            if(next.startsWith("V")){
                iterator2.remove();
            }
        }
        for(String cor: coresArcoIris){
            System.out.println(cor);
        }

        System.out.println("Limpe o conjunto ");
        coresArcoIris.clear();

        System.out.println("Confira se está vazio: " + coresArcoIris.isEmpty());

    }

}
