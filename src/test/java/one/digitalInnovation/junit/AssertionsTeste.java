package one.digitalInnovation.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDateTime;

public class AssertionsTeste {

    @Test
    public void validaLancamento() {
        int[] lancUm = {10, 20, 30, 40};
        int [] lancDois = {10, 20, 30, 40};

        Assertions.assertArrayEquals(lancUm, lancDois);
    }

    @Test
    public void validaSeNulo() {
        Pessoa pessoa = null;

        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDateTime.now());

        Assertions.assertNotNull(pessoa);
    }
}
