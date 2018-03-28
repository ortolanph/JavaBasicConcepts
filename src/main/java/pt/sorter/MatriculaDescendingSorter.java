package pt.sorter;

import pt.entidades.Empregado;

import java.util.Comparator;

public class MatriculaDescendingSorter implements Comparator<Empregado> {

    @Override
    public int compare(
        Empregado empregado1,
        Empregado empregado2) {

        return empregado2
            .getMatricula()
            .compareTo(empregado1.getMatricula());
    }
}
