package pt.comparing;

public class ComparandoStrings {

    private static final String CHAVE_DE_FENDA = "CHAVE DE FENDA";

    private static final String MARTELO = "MARTELO";

    private static final String PAQUIMETRO = "PAQUIMETRO";

    private static final String FITA_METRICA = "FITA_METRICA";

    public static void main(String[] args) {
        if(CHAVE_DE_FENDA == CHAVE_DE_FENDA) {
            System.out.println("Ferramentas iguais");
        } else {
            System.out.println("Ferramentas diferentes");
        }

        if(isChaveDeFenda(PAQUIMETRO)) {
            System.out.println("É chave de fenda");
        } else {
            System.out.println("Não é chave de fenda");
        }

        if(isChaveDeFenda(CHAVE_DE_FENDA)) {
            System.out.println("É chave de fenda");
        } else {
            System.out.println("Não é chave de fenda");
        }

        if(compararFerramentas(MARTELO, MARTELO)) {
            System.out.println("Ferramentas iguais");
        } else {
            System.out.println("Ferramentas diferentes");
        }

        if(compararFerramentas(MARTELO, FITA_METRICA)) {
            System.out.println("Ferramentas iguais");
        } else {
            System.out.println("Ferramentas diferentes");
        }
    }

    public static boolean compararFerramentas(String ferramenta1, String ferramenta2) {
        return ferramenta1 == ferramenta2;
    }

    public static boolean isChaveDeFenda(String ferramenta) {
        return ferramenta == CHAVE_DE_FENDA;
    }
}
