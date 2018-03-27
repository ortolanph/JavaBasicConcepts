package pt.entidades;

import java.time.LocalDate;

public class Matricula implements Comparable<Matricula> {
    private final LocalDate dataMatricula;

    private final int sequencial;

    private static final String FORMATO_MATRICULA = "%04d%02d-%03d";

    private Matricula(LocalDate dataMatricula, int sequencial) {
        this.dataMatricula = dataMatricula;
        this.sequencial = sequencial;
    }

    public static Matricula novaMatricula(LocalDate dataMatricula, int sequencial) {
        return new Matricula(dataMatricula, sequencial);
    }

    public LocalDate getDataMatricula() {
        return this.dataMatricula;
    }

    public int getSequencial() {
        return this.sequencial;
    }

    @Override
    public String toString() {
        return String.format(
            FORMATO_MATRICULA,
            dataMatricula.getYear(),
            dataMatricula.getMonthValue(),
            sequencial);
    }

    @Override
    public int compareTo(Matricula another) {
        return hashCode() - another.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if(other == null) return false;
        if(!(other instanceof Matricula)) return false;

        Matricula anotherMatricula = (Matricula)other;

        if(!dataMatricula.equals(anotherMatricula.getDataMatricula())) return false;
        if(sequencial != anotherMatricula.getSequencial()) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int matricula = (dataMatricula.getYear() * 100) + dataMatricula.getMonthValue();
        matricula = (matricula * 1000) + sequencial;
        return matricula;
    }
}
