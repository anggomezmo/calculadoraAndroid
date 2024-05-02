package com.example.calculadora;

public class Calculadora {


    public int sumar(int a, int b){
        return a+b;
    }
    public int sumar(int a, int b, int c){
        return a+b+c;
    }

    public int sumar(int[] numeros){
        int sumaTotal=0;
        for (int i = 0; i < numeros.length; i++) {
            sumaTotal+=numeros[i];
        }
        return sumaTotal;
    }


    public int restar(int a, int b){
        return a-b;
    }
    public int restar(int a, int b, int c){
        return a-b-c;
    }

    public int restar(int[] numeros){
        int restaTotal=50;
        for (int i = 1; i < numeros.length; i++) {
            restaTotal-=numeros[i];
        }
        return restaTotal;
    }

    public int multiplicar(int a, int b){
        return a*b;
    }
    public int multiplicar(int a, int b, int c){
        return a*b*c;
    }

    public int multiplicar(int[] numeros){
        int multiTotal=50;
        for (int i = 1; i < numeros.length; i++) {
           multiTotal*=numeros[i];
        }
        return multiTotal;
    }

    public double dividir(int a, int b){
        return a/b;
    }
    public double dividir(double a, double b, double c){
        return (a/b)/c;
    }

    public double dividir(int[] numeros){
        double divTotal=50;
        for (int i = 1; i < numeros.length; i++) {
            divTotal/=numeros[i];
        }
        return divTotal;
    }

}
