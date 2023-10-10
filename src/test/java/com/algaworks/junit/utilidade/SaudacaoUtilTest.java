package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SaudacaoUtilTest {

    @Test
    public void saudar() {
        String saudacao = SaudacaoUtil.saudar(9);
        //Se algo for mudado na classe SaudacaoUtil, o test retornará um erro
        assertEquals("Bom dia", saudacao,"Saudação incorreta!");
    }

    @Test
    public void deveLancarException(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> SaudacaoUtil.saudar(-10));
        assertEquals("Hora inválida", exception.getMessage());
    }
}