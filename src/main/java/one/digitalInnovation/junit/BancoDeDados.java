package one.digitalInnovation.junit;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        //Algo
        LOGGER.info("Conexão estabelecida.");
    }

    public static void finalizarConexao() {
        //Algo
        LOGGER.info("Conexão terminada.");
    }

    public static void insereDados(Pessoa pessoa) {
        //Algo
        LOGGER.info("Inseriu dados");
    }

    public static void removeDados(Pessoa pessoa) {
        //Algo
        LOGGER.info("Removeu dados");
    }
}
