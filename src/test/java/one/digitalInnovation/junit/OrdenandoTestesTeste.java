package one.digitalInnovation.junit;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrdenandoTestesTeste {

    @Order(4)
    @Test
    public void validaFluxoA() {
        Assertions.assertTrue(true);
    }

    @Order(3)
    @Test
    public void validaFluxoB() {
        Assertions.assertTrue(true);
    }

    @Order(2)
    @Test
    public void validaFluxoC() {
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    public void validaFluxoD() {
        Assertions.assertTrue(true);
    }
}
