package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void pessoaTest(){
        Pessoa pessoa = new Pessoa("Maria", "Silva");

        assertAll( "Asserções de Pessoa",
                () -> assertEquals("Maria",pessoa.getNome()),
                () -> assertEquals("Silva", pessoa.getSobrenome())
        );
    }
}