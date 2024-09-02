package one.digitalinnovation;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void validarCalculoIdade() {
        Pessoa p = new Pessoa(LocalDate.of(2000, 3, 10), "Pedro");
        Assertions.assertEquals(24, p.getIdade());
    }
}