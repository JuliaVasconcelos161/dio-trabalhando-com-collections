package com.github.juliavasconceloscr161.collections.aprendendomap.exercicios.exercicio3;

import java.util.Comparator;
import java.util.Map;

public class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contato>> {


    @Override
    public int compare(Map.Entry<Integer, Contato> o1, Map.Entry<Integer, Contato> o2) {
        int nome = o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
        if(nome != 0){
            return nome;
        }
        return o1.getValue().getNumero().compareTo(o2.getValue().getNumero());
    }
}
