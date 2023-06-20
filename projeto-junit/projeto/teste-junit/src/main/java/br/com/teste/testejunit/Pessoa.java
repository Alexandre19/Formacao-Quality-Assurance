package br.com.teste.testejunit;

import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private LocalDate nascimento;

    public Pessoa(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;

    }
}
