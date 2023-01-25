package com.mycompany.atividade2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaiorIdadeTest {
    
    public MaiorIdadeTest() {
    }

    @Test
    public void testChecar() {
        assertEquals("Não pode votar", MaiorIdade.checar(2010));
        assertEquals("Voto facultativo", MaiorIdade.checar(2006));
        assertEquals("Voto facultativo", MaiorIdade.checar(2007));
        assertEquals("Voto facultativo", MaiorIdade.checar(1953));
        assertEquals("Voto facultativo", MaiorIdade.checar(1949));
        assertEquals("Voto obrigatório", MaiorIdade.checar(1999));
        assertEquals("Voto obrigatório", MaiorIdade.checar(2004));
    }
    
}
