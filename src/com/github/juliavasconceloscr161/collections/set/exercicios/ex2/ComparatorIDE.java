package com.github.juliavasconceloscr161.collections.set.exercicios.ex2;

import java.util.Comparator;

public class ComparatorIDE implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita lg1, LinguagemFavorita lg2) {
        return lg1.getIde().compareToIgnoreCase(lg2.getIde());
    }
}
