package one.digitalinnovation;

import java.util.logging.Logger;

public class BancoDeDados {
    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        LOGGER.info("Iniciou conexão.");
    }

    public static void finalizarConexao() {
        LOGGER.info("Finalizou conexão.");
    }

    public static void inserirDados(Pessoa p) {
        LOGGER.info("Inseriu dados de Pessoa: " + p.getNome());
    }

    public static void removerDados(Pessoa p) {
        LOGGER.info("Removeu dados de Pessoa: " + p.getNome());
    }
}
