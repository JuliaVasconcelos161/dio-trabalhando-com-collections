package com.github.juliavasconceloscr161.collections.aprendendomap;

import java.util.Objects;

public class Estado {
    private String nome;
    private Integer populacao;

    public Estado(String nome, int populacao) {
        this.nome = nome;
        this.populacao = populacao;
    }

    public String getNome() {
        return nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "nome='" + nome + '\'' +
                ", populacao=" + populacao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estado estado = (Estado) o;
        return populacao == estado.populacao && Objects.equals(nome, estado.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, populacao);
    }
}

