package com.github.juliavasconceloscr161.collections.aprendendomap.exercicios;
/*Dada a população estimada de alguns estados do NE brasileiro, faça:
Estado = PE - População = 9.616.621
Estado = AL - População = 3.351.543
Estado = CE - População = 9.187.103
Estado = RN - População = 3.534.265
Crie um dicionário e relacione os estados e suas populações;
Substitua a população do estado do RN por 3.534.165;
Confira se o estado PB está no dicionário, caso não adicione: PB -
4.039.277;
Exiba a população PE;
Exiba todos os estados e suas populações na ordem que foi
informado;
Exiba os estados e suas populações em ordem alfabética;
Exiba o estado com o menor população e sua quantidade;
Exiba o estado com a maior população e sua quantidade;
Exiba a soma da população desses estados;
Exiba a média da população deste dicionário de estados;
Remova os estados com a população menor que 4.000.000;
Apague o dicionário de estados;
Confira se o dicionário está vazio.*/
import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário e relacione os estados e suas populações:");
        Map<String, Integer> populacaoEstadosNE = new HashMap<>(){{
           put("PE", 9616621);
           put("AL", 3351543);
           put("CE", 9187103);
           put("RN", 3534265);
        }};
        for(Map.Entry<String, Integer> entry: populacaoEstadosNE.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nSubstitua a população do estado do RN por 3.534.165: ");
        populacaoEstadosNE.put("RN", 3534165);
        for(Map.Entry<String, Integer> entry: populacaoEstadosNE.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nConfira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277 " + populacaoEstadosNE.containsKey("PB"));
        if(!populacaoEstadosNE.containsKey("PB")){
            populacaoEstadosNE.put("PB", 4039277);
        }
        for(Map.Entry<String, Integer> entry: populacaoEstadosNE.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nExiba todos os estados e suas populações na ordem que foi informado:");
        Map<String, Integer> populacaoEstadosNE2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        for(Map.Entry<String, Integer> entry: populacaoEstadosNE2.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nExiba os estados e suas populações em ordem alfabética:");
        Map<String, Integer> populacaoEstadosNE3 = new TreeMap<>(populacaoEstadosNE);
        for(Map.Entry<String, Integer> entry: populacaoEstadosNE3.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.print("\nExiba o estado com o menor população e sua quantidade: ");
        Integer estadoMenorPopulacao = Collections.min(populacaoEstadosNE.values());
        for(Map.Entry<String, Integer> entry: populacaoEstadosNE.entrySet()){
            if(estadoMenorPopulacao == entry.getValue()){
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }

        System.out.print("\nExiba o estado com o maior população e sua quantidade: ");
        Integer estadoMaiorPopulacao = Collections.max(populacaoEstadosNE.values());
        for(Map.Entry<String, Integer> entry: populacaoEstadosNE.entrySet()){
            if(estadoMaiorPopulacao == entry.getValue()){
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }

        System.out.print("\nExiba a soma da população desses estados: ");
        Integer soma = 0;
        Iterator<Integer> iterator = populacaoEstadosNE.values().iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            soma+= next;
        }
        System.out.println(soma);

        System.out.println("\nExiba a média da população deste dicionário de estados: " + soma/populacaoEstadosNE.size());

        System.out.println("\nRemova os estados com a população menor que 4.000.000:");
        Iterator<Integer> iterator1 = populacaoEstadosNE.values().iterator();
        while(iterator1.hasNext()){
            Integer next = iterator1.next();
            if(next < 4000000){
                iterator1.remove();
            }
        }
        for(Map.Entry<String, Integer> entry: populacaoEstadosNE.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nApague o dicionário de estados ");
        populacaoEstadosNE.clear();
        System.out.println("Confira se o dicionário está vazio: " + populacaoEstadosNE.isEmpty());

    }
}
