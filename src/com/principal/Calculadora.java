package com.principal;
public class Calculadora {

    private double resultado;
    private char operador = ' '; 

    public Calculadora() {
        resultado = 0;
        operador = ' ';
    }

    private void calcular(double numero) {
        switch (operador) {
            case '+':
                resultado = resultado + numero;
                break;
            case '-':
                resultado = resultado - numero;
                break;
            case '*':
                resultado = resultado * numero;
                break;
            case '/':
                resultado = resultado / numero;
                break;
            default:
                return;
        }
        operador = ' ';
    }

    public void entrada(double numero) {
        if (operador != ' ') {
            calcular(numero);
        }
        else {
            resultado = numero;
        }
    }

    public void setOperador(char operacao) {
        operador = operacao;
    }

    public double getResultado() {
        return resultado;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.entrada(2);
        calc.entrada(7);
        calc.entrada(8);
        calc.setOperador('+');
        calc.entrada(3);
        System.out.println(calc.getResultado());
        calc.setOperador('*');
        calc.entrada(5);
        System.out.println(calc.getResultado());
    }
}