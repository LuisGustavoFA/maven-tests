package one.digitalinnovation;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ListaTest {

    @Mock
    private List<String> lista;

    @Test
    void adicionarItemNaLista() {
        Mockito.when(lista.get(0)).thenReturn("B");
        Assertions.assertEquals("B", lista.get(0));
    }
}