package com.github.juliavasconceloscr161.collections.list;

import java.util.*;

public class MetodosList1 {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(3d);
        notas.add(5.0);
        notas.add(7.8);
        notas.add(7.0);
        notas.add(9d);
//        System.out.println(notas.toString());
        System.out.println(notas);

        System.out.println("Exiba a posição da nota 8.5: " + notas.indexOf(8.5));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);

        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for(Double nota: notas){
            System.out.print(nota + " ");
        }

        System.out.println("\nExiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Exiba a soma dos valores: " + soma);

        //notas.size -> Retorna quantidade de elementos
        System.out.println("Média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 7.0: ");
        notas.remove(7d);
        System.out.println(notas);
        System.out.println("Remova a posição 7: ");
        notas.remove(1);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 8){
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

        //LinkedList
        LinkedList<Double> notas2 = new LinkedList<Double>();
        notas2.add(6.0);
        notas2.add(8.5);
        notas2.add(3d);
        notas2.add(5.0);
        notas2.add(7.8);
        notas2.add(7.0);
        notas2.add(9d);


        System.out.println(notas2.getFirst());

        System.out.println(notas2.removeFirst());

        System.out.println(notas2);



    }
}
