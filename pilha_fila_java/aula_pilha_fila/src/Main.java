public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(5);

        //Testando Fila
        System.out.println("Adicionando: " + fila.adicionar("Abelha"));
        System.out.println("Adicionando: " + fila.adicionar("Bernardo"));
        System.out.println("Adicionando: " + fila.adicionar("Casa"));
        System.out.println("Adicionando: " + fila.adicionar("Dragrão"));
        System.out.println("Adicionando: " + fila.adicionar("Enzo"));

        System.out.println("A fila está vazia? " + fila.estaVazia());

        System.out.println("Primeiro elemento da fila: " + fila.primeiro());
        System.out.println("Tamanho da fila: " + fila.tamanho());

        while (!fila.estaVazia()) {
            System.out.println("Removendo da fila: " + fila.remover());
        }

        System.out.println("A fila está vazia? " + fila.estaVazia());

        //Testando Pilha
        Pilha pilha = new Pilha(5);

        System.out.println();
        System.out.println("Adicionando: " + pilha.empilhar("Fábio"));
        System.out.println("Adicionando: " + pilha.empilhar("Geraldo"));
        System.out.println("Adicionando: " + pilha.empilhar("Helicopitêro"));
        System.out.println("Adicionando: " + pilha.empilhar("I-Pajé"));

        System.out.println("A pilha está vazia?" + pilha.estaVazia());

        System.out.println("Topo: " + pilha.topo());
        System.out.println("Tamanho da pilha: " + pilha.tamanho());

        while (!pilha.estaVazia()) {
            System.out.println("Removendo da pilha: " + pilha.desempilhar());
        }

        System.out.println("A pilha está vazia?" + pilha.estaVazia());

        System.out.println("Ja era!");
    }
}