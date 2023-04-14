package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import funcionario.Funcionario;

public class FuncionarioTeste {
    private Funcionario funcionario;

    @Test
    public void testContrutorValido() {
        funcionario = new Funcionario("Samuel", 40, 60);

        assertEquals("Samuel", funcionario.getNome());
        assertEquals(40, funcionario.getHotasTrabalhadas());
        assertEquals(60, funcionario.getValorHora(), 0);

    }

    @Test
    public void testConstrutorInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            funcionario = new Funcionario("Samuel", 45, 120);
        });
    }

    @Test
    public void testValorHoraValido() {
        funcionario = new Funcionario();
        funcionario.setValorHora(80);
        assertEquals(80, funcionario.getValorHora(), 0);
    }

    @Test
    public void testValorHoraValidoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            funcionario = new Funcionario();
            funcionario.setValorHora(320);
            // funcionario.getValorHora();
        });
    }

    @Test
    public void testCalcularPagamentoValido() {
        funcionario = new Funcionario("Samuel", 40, 60);

        assertEquals(2400, funcionario.calcularPagamento(), 0);
    }

    @Test
    public void testCalcularPagamentoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            funcionario = new Funcionario("Samuel", 10, 60);

            funcionario.calcularPagamento();
        });
    }

    @Test
    public void testHorasTrabalhadasValido() {
        funcionario = new Funcionario();

        funcionario.setHotasTrabalhadas(20);

        assertEquals(20, funcionario.getHotasTrabalhadas());
         
    }

    @Test
    public void testHorasTrabalhadasInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            funcionario = new Funcionario(); 
            funcionario.setHotasTrabalhadas(70);
        });
    }






    

}