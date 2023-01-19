package com.github.juliavasconceloscr161.collections.aprendendomap;

import java.util.Comparator;
import java.util.Map;

public class ComparatorNomeAutor implements Comparator<Map .Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getAutor().compareToIgnoreCase(l2.getValue().getAutor());
    }
}
