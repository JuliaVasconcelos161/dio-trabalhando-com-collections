package com.github.juliavasconceloscr161.collections.aprendendomap.exercicios.exercicio3;
/*Dadas as seguintes informações de id e contato, crie uma dicionário, ordene
 * esse dicionário exibindo(Nome id - Nome contato)
 * id = 1 - Contato = nome Simba, numero: 12345689
 */
import java.util.*;

public class Exercicio3 {
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
        Set<Map.Entry<Integer, Contato>> agenda4 = new TreeSet<>(new ComparatorNumeroTelefone());
        agenda4.addAll(agenda.entrySet());
        for(Map.Entry<Integer, Contato> entry: agenda4){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + " - " + entry.getValue().getNumero());
        }

        System.out.println("\nOrdem nome contato: ");
        Set<Map.Entry<Integer, Contato>> agenda5 = new TreeSet<>(new ComparatorOrdemNomeContato());
        agenda5.addAll(agenda.entrySet());
        for(Map.Entry<Integer, Contato> entry: agenda5){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + " - " + entry.getValue().getNumero());
        }



    }
}
