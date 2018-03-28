package pt.entidades;

public class Empregado {
    private final Pessoa pessoa;
    private final Matricula matricula;
    private final String ramal;

    private Empregado(Pessoa pessoa, Matricula matricula, String ramal) {
        this.pessoa = pessoa;
        this.matricula = matricula;
        this.ramal = ramal;
    }

    public static Empregado novoEmpregado(Pessoa pessoa, Matricula matricula, String ramal) {
        return new Empregado(pessoa, matricula, ramal);
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public String getRamal() {
        return ramal;
    }

    @Override public String toString() {
        StringBuilder builder = new StringBuilder();

        builder
            .append(matricula.toString()).append('\t')
            .append(pessoa.getNome()).append('\t')
            .append(ramal);

        return builder.toString();
    }
}
