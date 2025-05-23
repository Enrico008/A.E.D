class No {
    String valor;
    No esquerdo, direito;

    No(String valor) {
        this.valor = valor;
    }
}

public class ArvoreBinaria {
    public static void emOrdem(No no) {
        if (no != null) {
            emOrdem(no.esquerdo);
            System.out.print(no.valor + " ");
            emOrdem(no.direito);
        }
    }

    public static void main(String[] args) {
        No raiz = new No("A");
        raiz.esquerdo = new No("B");
        raiz.direito = new No("C");
        raiz.esquerdo.esquerdo = new No("D");
        raiz.esquerdo.direito = new No("E");
        raiz.direito.direito = new No("F");

        emOrdem(raiz);
    }
}

