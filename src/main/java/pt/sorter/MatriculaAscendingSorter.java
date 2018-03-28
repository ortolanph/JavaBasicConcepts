package pt.sorter;

import pt.entidades.Empregado;

import java.util.Comparator;

public class MatriculaAscendingSorter implements Comparator<Empregado> {

    @Override
    public int compare(
        Empregado empregado1,
        Empregado empregado2) {

        return empregado1
            .getMatricula()
            .compareTo(empregado2.getMatricula());
    }
}
