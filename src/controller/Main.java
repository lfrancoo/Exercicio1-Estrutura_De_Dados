package controller;


import view.Somatorio;

public class Main {

    public static void main(String[] args) {

        int n = 5;

        // Instanciando o objeto da classe Somatorio (package view)
        Somatorio somatorio = new Somatorio();

        // Chamando o metodo recursivo
        int resultado = somatorio.calcularSomatorio(n);

        System.out.println("Somatório dos " + n + " primeiros números naturais: " + resultado);
    }
}
