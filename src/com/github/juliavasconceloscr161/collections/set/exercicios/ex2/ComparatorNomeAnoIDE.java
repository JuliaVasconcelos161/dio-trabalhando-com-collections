package com.github.juliavasconceloscr161.collections.set.exercicios.ex2;

import java.util.Comparator;

public class ComparatorNomeAnoIDE implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita lg1, LinguagemFavorita lg2) {
        int nome = lg1.getNome().compareToIgnoreCase(lg2.getNome());
        int ano = lg1.getAnoCriacao().compareTo(lg2.getAnoCriacao());
        if(nome != 0){
            return nome;
        }else if(ano != 0){
            return ano;
        }
        return lg1.getIde().compareToIgnoreCase(lg2.getIde());
    }
}
