class Node {
    String valor;
    Node esq, dir;

    Node(String valor) {
        this.valor = valor;
    }
}

public class ArvoreEmOrdem {
    static void emOrdem(Node no) {
        if (no == null) return;
        emOrdem(no.esq);
        System.out.print(no.valor + " ");
        emOrdem(no.dir);
    }

    public static void main(String[] args) {
        Node raiz = new Node("A");
        raiz.esq = new Node("B");
        raiz.dir = new Node("C");
        raiz.esq.esq = new Node("D");
        raiz.esq.dir = new Node("E");
        raiz.dir.dir = new Node("F");

        System.out.print("Em ordem: ");
        emOrdem(raiz);
    }
}
