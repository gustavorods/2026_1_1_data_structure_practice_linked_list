public class Principal {

    public static void main(String[] args) {

        Pais alemanha = new Pais("Alemanha");
        Pais franca = new Pais("Franca");
        Pais belgica = new Pais("Belgica");
        Pais holanda = new Pais("Holanda");

        alemanha.adicionarFronteira(franca);
        alemanha.adicionarFronteira(belgica);
        alemanha.adicionarFronteira(holanda);

        alemanha.listarFronteiras();

        System.out.println();

        if (alemanha.fazFronteiraCom("Franca")) {
            System.out.println("Alemanha faz fronteira com Franca");
        } else {
            System.out.println("Alemanha nao faz fronteira com Franca");
        }
    }
}