package com.github.juliavasconceloscr161.collections.streamAPI;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExemplosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "1", "3", "4", "9", "7");
        System.out.println("Imprima todos os elementos dessa lista de String: ");

//        Utilizando Classe Anônima
//        numerosAleatorios.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        Utilizando expressão lambda
//        numerosAleatorios.stream().forEach(s -> System.out.println(s));

//        Utilizando Reference Method
//        numerosAleatorios.stream().forEach(System.out::println);

//        Sem utilizar stream(), pois o proprio List já tem forEach
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros e coloque dentro de um Set: ");
//        numerosAleatorios.stream()
//                .limit(5)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);
        Set<String> collectedSet = numerosAleatorios.stream().limit(5).collect(Collectors.toSet());
        for(String s: collectedSet){
            System.out.println(s);
        }

        System.out.println("Transforme essa lista String em uma lista de números inteiros");
//        numerosAleatorios.stream()
//                .map(new Function<String, Integer>() {
//                    @Override
//                    public Integer apply(String s) {
//                        return Integer.parseInt(s);
//                    }
//                });
        List<Integer> collectedList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Pegue os números pares e maiores que dois e coloque em uma lista");
//        List<Integer> numerosParesMaiores2 =  numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(new Predicate<Integer>() {
//                    @Override
//                    public boolean test(Integer i) {
//                        if(i % 2 == 0 && i > 2){
//                            return true;
//                        }
//                        return false;
//                    }
//                }).collect(Collectors.toList());
        List<Integer> numerosParesMaiores2 =  numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(numerosParesMaiores2);

        System.out.println("Exiba a média dos números: ");
//        numerosAleatorios.stream()
//                .mapToInt(new ToIntFunction<String>() {
//                    @Override
//                    public int applyAsInt(String s) {
//                        return Integer.parseInt(s);
//                    }
//                });

//        numerosAleatorios.stream()
//                .mapToInt(s -> Integer.parseInt(s));

//        numerosAleatorios.stream()
//                .mapToInt(Integer::parseInt)
//                .average()
//                .ifPresent(new DoubleConsumer() {
//                    @Override
//                    public void accept(double value) {
//
//                    }
//                });

//        numerosAleatorios.stream()
//                .mapToInt(Integer::parseInt)
//                .average()
//                .ifPresent(v -> System.out.println(v));
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os números ímpares: ");
        List<Integer> numerosAleatoriosInteger2 = numerosAleatorios.stream()
                .map(Integer::parseInt).collect(Collectors.toList());

//        numerosAleatoriosInteger2.removeIf(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                if(integer % 2 != 0){
//                    return true;
//                }
//                return false;
//            }
//        });

       numerosAleatoriosInteger2.removeIf(i -> (i % 2 != 0));
       System.out.println(numerosAleatoriosInteger2);

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o resto: ");
        numerosAleatorios.stream()
                .skip(3)
                .forEach(System.out::println);



        System.out.print("Retirando os números repetidos da lista, quantos números ficam? ");
        List<Integer> numerosAleatoriosInteger3 = numerosAleatorios.stream()
                .map(Integer::parseInt).collect(Collectors.toList());
        Long quantidadeNumerosUnicos = numerosAleatoriosInteger3.stream()
                .distinct()
                .count();
        System.out.println(quantidadeNumerosUnicos);

        System.out.print("Mostre o menor valor da lista: ");
        numerosAleatoriosInteger3.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);

        System.out.print("Mostre o maior valor da lista: ");
        numerosAleatoriosInteger3.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);

        System.out.print("Some apenas os pares: ");
        Integer soma = numerosAleatoriosInteger3.stream()
                .filter(i -> (i % 2 == 0))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(soma);

        System.out.println("Mostre a lista na ordem numérica: ");
        List<Integer> numerosOrdemNatural = numerosAleatoriosInteger3.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(numerosOrdemNatural);

        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5: ");
        Map<Boolean, List<Integer>> collectNumerosMultiplos3E5 = numerosAleatoriosInteger3.stream()
                .collect(Collectors.groupingBy(i -> ((i % 2 != 0) && (i % 3 == 0 || i % 5 == 0))));
        System.out.println(collectNumerosMultiplos3E5);

    }
}
