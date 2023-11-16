package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setup() {
        calculadora = new Calculadora();
    }

    @Test
    void deveSomar(){
        int res = calculadora.somar(4, 2);
        assertThat(res).isEqualTo(6);
//        assertEquals(6, res);
    }

    @Test
    void deveSubtrair() {
        int res = calculadora.subtrait(4, 2);
        assertEquals(2, res);
    }

    @Test
    void deveMultiplicar() {
        var res = calculadora.multiplicar(4, 2);
        assertEquals(8, res);
    }

    @Test
    void deveDividir() {
        var res = calculadora.dividir(4, 2);
        assertEquals(2, res);
    }

    @Test
    void deveDividir_gerarExecaoQuandoDividirPorZero() {
        Throwable exception = catchThrowable(() -> calculadora.dividir(4, 0));
        assertThat(exception).isInstanceOf(ArithmeticException.class).hasMessage("/ by zero");

//        assertThrows(ArithmeticException.class, () -> {
//            calculadora.dividir(4, 0);
//        });
    }

}
