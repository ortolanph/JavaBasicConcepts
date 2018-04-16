package pt.sorter;

import pt.entidades.Empregado;
import pt.entidades.Matricula;
import pt.entidades.Pessoa;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class ListEmpregadoHelper {
    public static List<Empregado> criarListaEmpregado() {
        List<Empregado> empregados = new ArrayList<>();

        empregados.add(
            Empregado.novoEmpregado(
                criarPessoa(
                    1,
                    "John Lennon",
                    LocalDate.of(1940, Month.OCTOBER, 9),
                    "",
                    ""),
                Matricula.novaMatricula(LocalDate.of(1960, Month.DECEMBER, 1), 1),
                "1111"
            ));

        empregados.add(
            Empregado.novoEmpregado(
                criarPessoa(
                    1,
                    "Ringo Starr",
                    LocalDate.of(1940, Month.JULY, 7),
                    "",
                    ""),
                Matricula.novaMatricula(LocalDate.of(1960, Month.APRIL, 1), 1),
                "4444"
            ));

        empregados.add(
            Empregado.novoEmpregado(
                criarPessoa(
                    1,
                    "Paul McCartney",
                    LocalDate.of(1942, Month.JUNE, 18),
                    "",
                    ""),
                Matricula.novaMatricula(LocalDate.of(1960, Month.DECEMBER, 1), 2),
                "2222"
            ));

        empregados.add(
            Empregado.novoEmpregado(
                criarPessoa(
                    1,
                    "George Harrison",
                    LocalDate.of(1943, Month.FEBRUARY, 25),
                    "",
                    ""),
                Matricula.novaMatricula(LocalDate.of(1960, Month.MARCH, 1), 1),
                "3333"
            ));

        return empregados;
    }

    private static Pessoa criarPessoa(
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
