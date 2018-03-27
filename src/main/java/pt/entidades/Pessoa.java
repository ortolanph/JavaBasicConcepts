package pt.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private int id;
    private String nome;
    private LocalDate dataNascimento;
    private String telefone;
    private String celular;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public boolean equals(Object other) {
        if(other == null) return false;
        if(!(other instanceof Pessoa)) return false;

        Pessoa anotherPessoa = (Pessoa)other;

        if(id != anotherPessoa.getId()) return false;
        if(!nome.equals(anotherPessoa.getNome())) return false;
        if(!dataNascimento.equals(anotherPessoa.getDataNascimento())) return false;
        if(!telefone.equals(anotherPessoa.getTelefone())) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int hash = 31;

        hash += id;
        hash += nome.hashCode();
        hash += dataNascimento.hashCode();
        hash += telefone.hashCode();

        return hash;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder
            .append("Pessoa {")
            .append(" id: ").append(id)
            .append(", nome: ").append(nome)
            .append(", dataNascimento: ").append(dataNascimento.format(DateTimeFormatter.ISO_DATE))
            .append(", telefone: ").append(telefone)
            .append(", celular: ").append(celular)
            .append("}");

        return builder.toString();
    }
}
