package controller;

public class Somatorio {

    // Construtor da classe
    public Somatorio() {
        // Construtor utilizado para instanciar o objeto
    }

    // Metodo recursivo que calcula o somatório dos N primeiros números naturais
    public int calcularSomatorio(int n) {

        /*
         * CONDIÇÃO DE PARADA:
         * Se o valor de n for menor ou igual a zero,
         * a função retorna 0, encerrando a recursão.
         */
        if (n <= 0) {
            return 0;
        }

        /*
         * RELAÇÃO DE CHAMADA RECURSIVA:
         * O somatório é definido como:
         * n + calcularSomatorio(n - 1)
         * A cada chamada, o valor de n é decrementado em 1,
         */
        return n + calcularSomatorio(n - 1);
    }
}
