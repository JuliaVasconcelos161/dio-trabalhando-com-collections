package com.github.juliavasconceloscr161.collections.aprendendomap;

import java.util.*;

public class ExemplosMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos:");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
           put("gol", 16.1);
           put("uno", 18.5);
           put("mobi", 14.5);
           put("hb20", 14.5);
           put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares);

        System.out.println("\nSubstitua o valor do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("\nConfira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("\nExiba o consumo do uno: " + carrosPopulares.get("uno"));

//        Não tem método que possa mostrar
//        System.out.println("Exiba o terceiro modelo adicionado: ");
        System.out.println("\nExiba os modelos: ");
        Set<String> modelos =  carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("\nExiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("\nExiba o modelo mais econômico ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        for(Map.Entry<String, Double> entry: entries){
            if(entry.getValue().equals(consumoMaisEficiente)){
                String modeloEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println("\nExiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        for(Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)){
                String modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        System.out.print("\nExiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("\nExiba a média dos consumos: " + soma/carrosPopulares.size());

        System.out.println("\nRemova os modelos com consumo igual a 14.5: ");
        Iterator<Double> iterator2 = carrosPopulares.values().iterator();
        while(iterator2.hasNext()){
            if(iterator2.next() == 14.5){
                iterator2.remove();
            }
        }

        System.out.println(carrosPopulares);

        System.out.println("\nExiba todos os carros na ordem que foram informados");
        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{
            put("gol", 16.1);
            put("uno", 18.5);
            put("mobi", 14.5);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares2);

        System.out.println("\nExiba ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares3 = new TreeMap<>();
        carrosPopulares3.putAll(carrosPopulares2);
        System.out.println(carrosPopulares3);

        System.out.println("\nApague o dicionário de carros: ");
        carrosPopulares.clear();

        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());



    }
}
