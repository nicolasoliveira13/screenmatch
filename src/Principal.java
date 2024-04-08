public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Top Gun: Maverick";
        meuFilme.anoDeLancamento = 2022;
        meuFilme.duracaoEmMinutos = 130;
        meuFilme.plano = "Ace";

        meuFilme.avalia(8);
        meuFilme.avalia(7);
        meuFilme.avalia(10);

        meuFilme.exibeFichaTecnica();
    }
}