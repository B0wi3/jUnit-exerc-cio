package one.digitalInnovation.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    public void validaCenarioDeExcecao() {
        Conta contaOrigem = new Conta("1234567", 0);
        Conta contaDestino = new Conta("12345", 100);

        Transferencia transferencia = new Transferencia();

        assertThrows(IllegalArgumentException.class, () ->
                transferencia.transfere(contaOrigem, contaDestino, -1));
    }
}
