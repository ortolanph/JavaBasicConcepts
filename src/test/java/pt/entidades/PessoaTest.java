package pt.entidades;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.*;

public class PessoaTest {
    @Test
    public void testarReflexividade() throws Exception {
        Pessoa pessoa = criarPessoa(
            1,
            "Pessoa",
            LocalDate.of(2017, Month.JANUARY, 1),
            "12345678",
            null);

        assertTrue(pessoa.equals(pessoa));
    }

    @Test
    public void testarSimetria() throws Exception {
        Pessoa pessoa1 = criarPessoa(
            1,
            "Pessoa",
            LocalDate.of(2017, Month.JANUARY, 1),
            "12345678",
            null);

        Pessoa pessoa2 = criarPessoa(
            1,
            "Pessoa",
            LocalDate.of(2017, Month.JANUARY, 1),
            "12345678",
            "912345678");

        assertTrue(pessoa1.equals(pessoa2));
        assertTrue(pessoa2.equals(pessoa1));
    }

    @Test
    public void testarTransitividade() throws Exception {
        Pessoa pessoa1 = criarPessoa(
            1,
            "Pessoa",
            LocalDate.of(2017, Month.JANUARY, 1),
            "12345678",
            null);

        Pessoa pessoa2 = criarPessoa(
            1,
            "Pessoa",
            LocalDate.of(2017, Month.JANUARY, 1),
            "12345678",
            "912345678");

        Pessoa pessoa3 = criarPessoa(
            1,
            "Pessoa",
            LocalDate.of(2017, Month.JANUARY, 1),
            "12345678",
            "987654321");

        assertTrue(pessoa1.equals(pessoa2));
        assertTrue(pessoa2.equals(pessoa3));
        assertTrue(pessoa1.equals(pessoa3));
    }

    @Test
    public void testarHashCode() throws Exception {
        Pessoa pessoa1 = criarPessoa(
            1,
            "Pessoa",
            LocalDate.of(2017, Month.JANUARY, 1),
            "12345678",
            null);

        Pessoa pessoa2 = criarPessoa(
            1,
            "Pessoa",
            LocalDate.of(2017, Month.JANUARY, 1),
            "12345678",
            "912345678");

        assertTrue(pessoa1.equals(pessoa2));
        assertTrue(pessoa1.hashCode() == pessoa2.hashCode());
    }

    private Pessoa criarPessoa(
        int id,
        String nome,
        LocalDate dataNascimento,
        String telefone,
        String celular) {

        Pessoa pessoa = new Pessoa();

        pessoa.setId(id);
        pessoa.setNome(nome);
        pessoa.setDataNascimento(dataNascimento);
        pessoa.setTelefone(telefone);
        pessoa.setCelular(celular);

        return pessoa;
    }
}
