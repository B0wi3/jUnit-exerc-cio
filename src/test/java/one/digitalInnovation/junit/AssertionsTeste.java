package one.digitalInnovation.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

public class AssertionsTeste {

    @Test
    public void validaLancamento() {
        int[] lancUm = {10, 20, 30, 40};
        int [] lancDois = {10, 20, 30, 40};

        assertArrayEquals(lancUm, lancDois);
    }

    @Test
    public void validaSeNulo() {
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDateTime.now());

        assertNotNull(pessoa);
    }

    @Test
    public void validaInteiro() {
        int valor = 5;
        int outroValor = 5;

        assertEquals(valor, outroValor);
    }
}
