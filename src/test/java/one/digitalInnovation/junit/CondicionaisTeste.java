package one.digitalInnovation.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class CondicionaisTeste {

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "Pichau")
    public void validarSomenteNoUserPichau() {
        assertEquals(10, 5 + 5);
    }
}
