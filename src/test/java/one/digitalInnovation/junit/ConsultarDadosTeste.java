package one.digitalInnovation.junit;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosTeste {

    @BeforeAll
    public static void configuraConexao() {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    public void insereDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("Joao", LocalDateTime.of(2000, 1, 1, 1, 1, 1)));
    }

    @AfterEach
    public void removeDadosDeTeste() {
        BancoDeDados.removeDados(new Pessoa("Joao", LocalDateTime.of(2000, 1, 1, 1, 1, 1)));

    }

    @Test
    public void validaDadosRetornados() {
        Assertions.assertTrue(true);
    }

    @Test
    public void validaDadosRetornados2() {
        Assertions.assertNull(null);
    }

    @AfterAll
    public static void terminaConexao() {
        BancoDeDados.finalizarConexao();
    }
}
