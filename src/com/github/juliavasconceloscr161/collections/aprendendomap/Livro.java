package com.github.juliavasconceloscr161.collections.aprendendomap;

import java.util.Objects;

public class Livro {
    private String autor;
    private Integer paginas;

    public Livro(String autor, Integer paginas) {
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(autor, livro.autor) && Objects.equals(paginas, livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autor, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
