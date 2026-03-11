public class NoFronteira {

    Pais paisVizinho;      // país que faz fronteira
    NoFronteira proximoNo; // referência para o próximo nó

    public NoFronteira(Pais paisVizinho) {
        this.paisVizinho = paisVizinho;
        this.proximoNo = null;
    }
}