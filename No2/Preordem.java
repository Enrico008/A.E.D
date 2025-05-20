class Node {
    String valor;
    Node esq, dir;

    Node(String valor) {
        this.valor = valor;
    }
}

public class ArvorePreOrdem {
    static void preOrdem(Node no) {
        if (no == null) return;
        System.out.print(no.valor + " ");
        preOrdem(no.esq);
        preOrdem(no.dir);
    }

    public static void main(String[] args) {
        Node raiz = new Node("A");
        raiz.esq = new Node("B");
        raiz.dir = new Node("C");
        raiz.esq.esq = new Node("D");
        raiz.esq.dir = new Node("E");
        raiz.dir.dir = new Node("F");

        System.out.print("Pré-ordem: ");
        preOrdem(raiz);
    }
}
