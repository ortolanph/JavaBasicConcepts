package pt.comparing;

import pt.entidades.Pessoa;

import java.time.LocalDate;
import java.time.Month;

public class ComparandoObjetos {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.setId(1);
        pessoa1.setNome("James Arthur Gosling");
        pessoa1.setDataNascimento(LocalDate.of(1955, Month.MAY, 19));
        pessoa1.setCelular("404-555-0182");
        pessoa1.setTelefone("515-555-0151");

        Pessoa pessoa2 = new Pessoa();

        pessoa2.setId(1);
        pessoa2.setNome("James Arthur Gosling");
        pessoa2.setDataNascimento(LocalDate.of(1955, Month.MAY, 19));
        pessoa2.setCelular("404-555-0182");
        pessoa2.setTelefone("515-555-0151");

        if(pessoa1 == pessoa2) {
            System.out.println("Mesma pessoa!");
        } else {
            System.out.println("Pessoas diferentes!");
        }

        if(pessoa1.equals(pessoa2)) {
            System.out.println("Mesma pessoa!");
        } else {
            System.out.println("Pessoas diferentes!");
        }
    }

}
