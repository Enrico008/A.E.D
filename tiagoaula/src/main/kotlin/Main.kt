public class Estruturas {
    static class NoLista {
        int valor;
        NoLista proximo;
        NoLista(int valor) { this.valor = valor; }
    }

    static class NoArvore {
        int valor;
        NoArvore esquerda, direita;
        NoArvore(int valor) { this.valor = valor; }
    }

    public static void main(String[] args) {
        NoLista no1 = new NoLista(10);
        no1.proximo = new NoLista(20);

        NoArvore raiz = new NoArvore(50);
        raiz.esquerda = new NoArvore(30);
        raiz.direita = new NoArvore(70);

        exibirPreOrder(raiz);
    }

    static void exibirPreOrder(NoArvore no) {
        if (no != null) {
            System.out.println(no.valor);
            exibirPreOrder(no.esquerda);
            exibirPreOrder(no.direita);
        }
    }
}
