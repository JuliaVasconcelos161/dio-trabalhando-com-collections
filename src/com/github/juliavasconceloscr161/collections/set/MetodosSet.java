package com.github.juliavasconceloscr161.collections.set;

import java.util.*;

public class MetodosSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 5.5, 6d, 8d, 7d));
        System.out.println(notas);

        //Não é possível trabalhar com posição dentro do Set, pois ele armazena de forma aleatória
//        System.out.println("Exiba a posição da nota 5.5");
//        System.out.println("Adicione a nota 8.0 na posição 4");


        //Não é possível
//        System.out.println("Substitua a nota 8.0 pela nota 6.0");


        System.out.println("Confira se a nota 5.0 está no conjunto:" + notas.contains(5d));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a soma dos valores");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);
        System.out.println("Exiba a média das notas: " + soma/ notas.size());

        System.out.println("Remova a nota 6.0");
        notas.remove(6d);
        System.out.println(notas);

        //Não tem como
        //System.out.println("Remova a nota na posição 0:");

        System.out.println("Remova as notas menores que 7:");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7){
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informadas:");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(1d);
        notas2.add(2d);
        notas2.add(6d);
        notas2.add(9d);
        notas2.add(5d);
        notas2.add(3d);
        notas2.add(1d);//Set não permite elementos iguais
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        //Só é possível adicionar o notas2, pois é composto por Doubles, e ele tem o comparable
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("apague todo o conjunto");
        notas.clear();
        System.out.println("Confira se o conjunto 1 está vazio " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazio " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio " + notas3.isEmpty());

    }
}
