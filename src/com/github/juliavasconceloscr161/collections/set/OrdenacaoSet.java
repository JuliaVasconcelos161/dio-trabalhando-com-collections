package com.github.juliavasconceloscr161.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class OrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("Ordem aleatória");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("You", "Suspense",50));
            add(new Serie("Gilmore Girls", "Romance",40));
            add(new Serie("Wandinha", "Fantasia",40));
        }};

        for(Serie serie: minhasSeries){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\nOrdem de Inserção");
        Set<Serie> minhasSeries2 = new LinkedHashSet<>(){{
            add(new Serie("You", "Suspense",50));
            add(new Serie("Gilmore Girls", "Romance",40));
            add(new Serie("Wandinha", "Fantasia",40));
        }};
        for(Serie serie: minhasSeries2){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\nOrdem Natural (Tempo de Episódio)");
        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries2);
        System.out.println(minhasSeries3);

        System.out.println("\nOrdem Natural (Nome/Gênero/TempoEpisodio)");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries4.addAll(minhasSeries);
        for(Serie serie: minhasSeries4){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\nOrdem Natural (Gênero)");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorGenero());
        minhasSeries5.addAll(minhasSeries);
        for(Serie serie: minhasSeries5){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\nOrdem Natural (TempoEpisodio)");
        Set<Serie> minhasSeries6 = new TreeSet<>(new ComparatorTempoEpisodio());
        minhasSeries6.addAll(minhasSeries);
        for(Serie serie: minhasSeries6){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
    }
}
