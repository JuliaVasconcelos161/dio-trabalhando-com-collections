package com.github.juliavasconceloscr161.collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
          add(new Gato("Jon", 12, "preto"));
          add(new Gato("Simba", 6, "branco"));
          add(new Gato("Jon", 18, "amarelo"));
        }};
        System.out.println(meusGatos);

        System.out.println("Ordem de Inserção:");
        System.out.println(meusGatos);

        System.out.println("Ordem aleatória:");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem natural (Nome)");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem natural (idade)");
//        Collections.sort(meusGatos,new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("Ordem natural (cor)");
        Collections.sort(meusGatos,new ComparatorCor());
//        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("Ordem Nome/Cor/Idade");
        Collections.sort(meusGatos,new ComparatorNomeCorIdade());
//        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }
}
