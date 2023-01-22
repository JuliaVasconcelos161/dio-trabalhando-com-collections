package com.github.juliavasconceloscr161.collections.streamAPI;

import com.github.juliavasconceloscr161.collections.aprendendomap.exercicios.exercicio3.ComparatorNumeroTelefone;
import com.github.juliavasconceloscr161.collections.aprendendomap.exercicios.exercicio3.ComparatorOrdemNomeContato;
import com.github.juliavasconceloscr161.collections.aprendendomap.exercicios.exercicio3.Contato;

import java.util.*;
import java.util.function.Function;

public class RefatorandoEx3Map {
    public static void main(String[] args) {
        Map<Integer, Contato> agenda = new HashMap<>(){{
            put(1, new Contato("Gil", 555599875));
            put(9, new Contato("Anna", 666699857));
            put(6, new Contato("Elton", 447785691));
        }};

        System.out.println("Agenda: ");
        for(Map.Entry<Integer, Contato> entry: agenda.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + " - " + entry.getValue().getNumero());
        }

        System.out.println("\nOrdem inserção: ");
        Map<Integer, Contato> agenda2 = new LinkedHashMap<>(){{
            put(1, new Contato("Gil", 555599875));
            put(2, new Contato("Anna", 666699857));
            put(3, new Contato("Elton", 447785691));
        }};
        for(Map.Entry<Integer, Contato> entry: agenda2.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + " - " + entry.getValue().getNumero());
        }

        System.out.println("\nOrdem id: ");
        Map<Integer, Contato> agenda3 = new TreeMap<>(agenda);
        for(Map.Entry<Integer, Contato> entry: agenda3.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + " - " + entry.getValue().getNumero());
        }

        System.out.println("\nOrdem número telefone: ");
//        Set<Map.Entry<Integer, Contato>> agenda4 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>(){
//            @Override
//            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2){
//                return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
//            }
//        });
//        Set<Map.Entry<Integer, Contato>> agenda4 = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, Integer>() {
//            @Override
//            public Integer apply(Map.Entry<Integer, Contato> cont) {
//                return cont.getValue().getNumero();
//            }
//        }));

        Set<Map.Entry<Integer, Contato>> agenda4 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumero()));
        agenda4.addAll(agenda.entrySet());
        for(Map.Entry<Integer, Contato> entry: agenda4){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + " - " + entry.getValue().getNumero());
        }

//        System.out.println("\nOrdem nome contato: ");
//        Set<Map.Entry<Integer, Contato>> agenda5 = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, String>() {
//            @Override
//            public String apply(Map.Entry<Integer, Contato> cont) {
//                return cont.getValue().getNome();
//            }
//        }));

        System.out.println("\nOrdem nome contato: ");
        Set<Map.Entry<Integer, Contato>> agenda5 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNome()));
        agenda5.addAll(agenda.entrySet());
        for(Map.Entry<Integer, Contato> entry: agenda5){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + " - " + entry.getValue().getNumero());
        }
    }
}
