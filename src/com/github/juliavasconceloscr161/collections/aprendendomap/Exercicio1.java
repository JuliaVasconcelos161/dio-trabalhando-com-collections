package com.github.juliavasconceloscr161.collections.aprendendomap;

import com.github.juliavasconceloscr161.collections.aprendendomap.Estado;

import java.util.HashSet;
import java.util.Set;

public class Exercicio1 {
    public static void main(String[] args) {
        Set<Estado> estadosNordeste = new HashSet<>(){{
            add (new Estado("PE",9616621));
            add (new Estado("AL", 3351543));
            add (new Estado("CE", 9187103));
        }};
        System.out.println(estadosNordeste);

        estadosNordeste.add(new Estado("RN", 3534265));
        System.out.println(estadosNordeste);
    }
}
