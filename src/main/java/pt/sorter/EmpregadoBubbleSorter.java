package pt.sorter;

import common.sorting.SortingAlgorithm;
import pt.entidades.Empregado;

import java.util.Collections;
import java.util.List;

import static pt.sorter.ListEmpregadoHelper.criarListaEmpregado;

public class EmpregadoBubbleSorter {

    public static void main(String[] args) {
        EmpregadoBubbleSorter sorter = new EmpregadoBubbleSorter();

        List<Empregado> empregados = sorter.ordenar();

        System.out.println("ASC");

        for(Empregado empregado : empregados) {
            System.out.println(empregado);
        }

        System.out.println("DESC");

        Collections.reverse(empregados);

        for(Empregado empregado : empregados) {
            System.out.println(empregado);
        }
        }

    public List<Empregado> ordenar() {
        SortingAlgorithm<Empregado> bubbleSorter = new BubbleSortEmpregado();
        return bubbleSorter.sort(criarListaEmpregado());
    }

}
