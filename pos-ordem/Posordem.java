class No {
    String valor;
    No esquerdo, direito;

    No(String valor) {
        this.valor = valor;
    }
}

public class ArvoreBinaria {
    public static void posOrdem(No no) {
        if (no != null) {
            posOrdem(no.esquerdo);
            posOrdem(no.direito);
            System.out.print(no.valor + " ");
        }
    }

    public static void main(String[] args) {
        No raiz = new No("A");
        raiz.esquerdo = new No("B");
        raiz.direito = new No("C");
        raiz.esquerdo.esquerdo = new No("D");
        raiz.esquerdo.direito = new No("E");
        raiz.direito.direito = new No("F");

        posOrdem(raiz);
    }
}
