package com.github.juliavasconceloscr161.collections.set.exercicios.ex2;
/*Crie uma classe LinguagemFavorita que possua os atributos
nome, anoDeCriacao e ide. Em seguida, crie um conjunto com
3 linguagens e faça um programa que ordene esse conjunto
por:
Ordem de Inserção
Ordem Natural (nome)
IDE
Ano de criação e nome
Nome, ano de criacao e IDE
Ao final, exiba as linguagens no console, um abaixo da outra.*/

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio2 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagensFavoritas = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java", 1991, "IntelliJ"));
            add(new LinguagemFavorita("C#", 2000, "Visual Studio Community"));
            add(new LinguagemFavorita("TypeScript",2012,"Visual Studio Code"));
        }};

        System.out.println("Ordem de Inserção:");
        for (LinguagemFavorita lg: linguagensFavoritas){
            System.out.println(lg.getNome() + " - " + lg.getAnoCriacao() + " - " + lg.getIde());
        }

        System.out.println("\nOrdem Natural (nome):");
        Set<LinguagemFavorita> linguagensFavoritas2 = new TreeSet<>(linguagensFavoritas);
        for (LinguagemFavorita lg: linguagensFavoritas2){
            System.out.println(lg.getNome() + " - " + lg.getAnoCriacao() + " - " + lg.getIde());
        }

        System.out.println("\nOrdem IDE:");
        Set<LinguagemFavorita> linguagensFavoritas3 = new TreeSet<>(new ComparatorIDE());
        linguagensFavoritas3.addAll(linguagensFavoritas);
        for (LinguagemFavorita lg: linguagensFavoritas3){
            System.out.println(lg.getNome() + " - " + lg.getAnoCriacao() + " - " + lg.getIde());
        }

        System.out.println("\nOrdem ano de criação e nome:");
        Set<LinguagemFavorita> linguagensFavoritas4 = new TreeSet<>(new ComparatorAnoNome());
        linguagensFavoritas4.addAll(linguagensFavoritas);
        for (LinguagemFavorita lg: linguagensFavoritas4){
            System.out.println(lg.getNome() + " - " + lg.getAnoCriacao() + " - " + lg.getIde());
        }

        System.out.println("\nOrdem nome, ano de criacao e IDE:");
        Set<LinguagemFavorita> linguagensFavoritas5 = new TreeSet<>(new ComparatorNomeAnoIDE());
        linguagensFavoritas5.addAll(linguagensFavoritas);
        for (LinguagemFavorita lg: linguagensFavoritas5){
            System.out.println(lg.getNome() + " - " + lg.getAnoCriacao() + " - " + lg.getIde());
        }
    }
}
