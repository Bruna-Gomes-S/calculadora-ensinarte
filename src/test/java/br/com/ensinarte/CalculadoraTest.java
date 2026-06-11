package br.com.ensinarte;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    public void testCalcularTotalPontos() {
        assertEquals(15.0, calc.calcularTotalPontos(7.5, 7.5));
        assertEquals(10.0, calc.calcularTotalPontos(10.0, 0.0));
    }

    @Test
    public void testCalcularQuantoFaltaParaPassar() {
        assertEquals(1.5, calc.calcularQuantoFaltaParaPassar(7.0, 5.5));
        assertEquals(0.0, calc.calcularQuantoFaltaParaPassar(6.0, 6.0));
    }

    @Test
    public void testCalcularNotaComPeso() {
        assertEquals(8.0, calc.calcularNotaComPeso(10.0, 0.8));
        assertEquals(0.0, calc.calcularNotaComPeso(0.0, 0.5));
    }

    @Test
    public void testCalcularMediaAcademicaSucesso() {
        assertEquals(7.5, calc.calcularMediaAcademica(15.0, 2));
    }

    @Test
    public void testCalcularMediaComZeroAvaliacoes() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.calcularMediaAcademica(15.0, 0);
        });
    }
}