class Pais {

    String nome;
    NoFronteira inicioFronteiras; // início da lista ligada

    public Pais(String nome) {
        this.nome = nome;
        this.inicioFronteiras = null; // lista começa vazia
    }

    public void adicionarFronteira(Pais pais) {

        NoFronteira novoNo = new NoFronteira(pais);

        novoNo.proximoNo = inicioFronteiras; 
        inicioFronteiras = novoNo;
    }

    public void removerFronteira(String nomePais) {

        NoFronteira atual = inicioFronteiras;
        NoFronteira anterior = null;

        while (atual != null) {

            if (atual.paisVizinho.nome.equals(nomePais)) {

                if (anterior == null) {
                    inicioFronteiras = atual.proximoNo;
                } else {
                    anterior.proximoNo = atual.proximoNo;
                }

                return;
            }

            anterior = atual;
            atual = atual.proximoNo;
        }
    }

    public void listarFronteiras() {

        NoFronteira atual = inicioFronteiras;

        System.out.println("Fronteiras do " + nome + ":");

        while (atual != null) {
            System.out.println(atual.paisVizinho.nome);
            atual = atual.proximoNo;
        }
    }

    public boolean fazFronteiraCom(String nomePais) {

        NoFronteira atual = inicioFronteiras;

        while (atual != null) {

            if (atual.paisVizinho.nome.equals(nomePais)) {
                return true;
            }

            atual = atual.proximoNo;
        }

        return false;
    }
}