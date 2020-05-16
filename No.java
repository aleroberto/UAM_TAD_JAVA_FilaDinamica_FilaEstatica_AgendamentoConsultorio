public class No {

    String dado;
    No proxNo;

    public No(String dado) {
        this.dado = dado;
        this.proxNo = null;
    }

    void inserir(String novo) {
        No novoNo = new No(novo);
        novoNo.proxNo = null;
    }
}
