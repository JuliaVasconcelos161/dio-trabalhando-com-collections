package com.github.juliavasconceloscr161.collections.aprendendomap;

import java.util.*;

public class OrdenandoMap {
    public static void main(String[] args) {
        System.out.println("Ordem aleatória: ");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Procura-se um Marido", new Livro("Rissi, Carina",476));
            put("Corte de Espinhos e Rosas", new Livro("Maas, Sarah J.", 434));
            put("Minha Vida Fora de Série", new Livro("Pimenta, Paula",408));
        }};

        for(Map.Entry<String, Livro> livro: meusLivros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getAutor() + " - " + livro.getValue().getPaginas());
        }

        System.out.println("\nOrdem Inserção:");
        Map<String, Livro> meusLivros2 = new LinkedHashMap<>(){{
            put("Procura-se um Marido", new Livro("Rissi, Carina",476));
            put("Corte de Espinhos e Rosas", new Livro("Maas, Sarah J.", 434));
            put("Minha Vida Fora de Série", new Livro("Pimenta, Paula",408));
        }};

        for(Map.Entry<String, Livro> livro: meusLivros2.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getAutor() + " - " + livro.getValue().getPaginas());
        }

        System.out.println("\nOrdem alfabética Livros");
        Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros);
        for(Map.Entry<String, Livro> livro: meusLivros3.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getAutor());
        }

        System.out.println("\nOrdem alfabética Autores");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNomeAutor());
        meusLivros4.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livro> livro: meusLivros4){
            System.out.println(livro.getKey() + " - " + livro.getValue().getAutor());
        }

        System.out.println("\nOrdem número de páginas");
        Set<Map.Entry<String, Livro>> meusLivros5 = new TreeSet<>(new ComparatorPaginas());
        meusLivros5.addAll(meusLivros4);
        for(Map.Entry<String, Livro> livro: meusLivros5){
            System.out.println(livro.getKey() + " - " + livro.getValue().getAutor() + " - " + livro.getValue().getPaginas());
        }
    }
}
