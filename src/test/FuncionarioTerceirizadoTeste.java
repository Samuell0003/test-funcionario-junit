package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import funcionario.FuncionarioTerceirizado;

public class FuncionarioTerceirizadoTeste {
    private FuncionarioTerceirizado funcionarioTerceirizado;

    @Test
    public void testConstrutorValido() {
        funcionarioTerceirizado = new FuncionarioTerceirizado("Samuel", 30, 90, 700);

        assertEquals("Samuel", funcionarioTerceirizado.getNome());
        assertEquals(30, funcionarioTerceirizado.getHotasTrabalhadas());
        assertEquals(90, funcionarioTerceirizado.getValorHora(), 0);
        assertEquals( 700, funcionarioTerceirizado.getDespesasAdicionais(), 0);
    }

    @Test
    public void testConstrutorInvalido() {
        assertThrows(IllegalArgumentException.class, () -> { 
            funcionarioTerceirizado = new FuncionarioTerceirizado("Samuel", 40, 70, 1800);
        });
    }

    @Test
    public void testDespesasAdicionaisValido() {
        funcionarioTerceirizado = new FuncionarioTerceirizado();
        funcionarioTerceirizado.setDespesasAdicionais(200);
    }
    @Test
    public void testDespesasAdicionaisInvalido() {
        assertThrows(IllegalArgumentException.class, () -> { 
            funcionarioTerceirizado = new FuncionarioTerceirizado();
            funcionarioTerceirizado.setDespesasAdicionais(3000);
        });
    }
}
