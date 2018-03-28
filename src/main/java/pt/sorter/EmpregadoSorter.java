package pt.sorter;

import pt.entidades.Empregado;
import pt.entidades.Matricula;
import pt.entidades.Pessoa;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpregadoSorter {

    public static void main(String[] args) {
        EmpregadoSorter sorter = new EmpregadoSorter();

        System.out.println("ASC");

        sorter.ordenarAsc();

        System.out.println("DESC");

        sorter.ordenarDesc();

        System.out.println("ASC JAVA8");

        sorter.ordernarAscJava8();

        System.out.println("DESC JAVA8");

        sorter.ordernarDescJava8();
    }

    public void ordenarAsc() {
        List<Empregado> empregados = criarListaEmpregado();

        Collections.sort(empregados, new MatriculaAscendingSorter());

        for (Empregado empregado : empregados) {
            System.out.println(empregado);
        }
    }

    public void ordenarDesc() {
        List<Empregado> empregados = criarListaEmpregado();

        Collections.sort(empregados, new MatriculaDescendingSorter());

        for (Empregado empregado : empregados) {
            System.out.println(empregado);
        }
    }

    public void ordernarAscJava8() {
        criarListaEmpregado()
            .stream()
            .sorted(Comparator.comparing(Empregado::getMatricula))
            .forEach(System.out::println);
    }

    public void ordernarDescJava8() {
        criarListaEmpregado()
            .stream()
            .sorted(Comparator.comparing(Empregado::getMatricula).reversed())
            .forEach(System.out::println);
    }

    private List<Empregado> criarListaEmpregado() {
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
