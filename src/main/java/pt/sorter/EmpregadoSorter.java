package pt.sorter;

import pt.entidades.Empregado;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static pt.sorter.ListEmpregadoHelper.criarListaEmpregado;

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


}
