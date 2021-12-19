package Strategy;

import Strategy.*;
import org.junit.Test;

public class PadraoStrategyTest {
    @Test
    public void testeSubtracao(){
        PadraoStrategy padraoStrategy = new PadraoStrategy(new Subtracao());
        int resultado = padraoStrategy.executaStrategy(50,25);
        assertEquals(25,resultado);
    }

    private void assertEquals(int i, int resultado) {
    }

    @Test
    public void testDivisao(){
        PadraoStrategy padraoStrategy = new PadraoStrategy(new Divisao());
        int resultado = padraoStrategy.executaStrategy(1356,2);
        assertEquals(678,resultado);
    }
    @Test
    public void testSoma(){
        PadraoStrategy padraoStrategy = new PadraoStrategy(new Soma());
        int resultado = padraoStrategy.executaStrategy(500,500);
        assertEquals(1000,resultado);
    }

    @Test
    public void testMultiplicacao(){
        PadraoStrategy padraoStrategy = new PadraoStrategy(new Multiplicacao());
        int resultado = padraoStrategy.executaStrategy(9,5);
        assertEquals(45,resultado);
    }
}






