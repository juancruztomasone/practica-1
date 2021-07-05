package com.company;
import java.util.Scanner;

public class EjercicioTres {
    public EjercicioTres() {
    }

    public static void main(String[] args) {
        System.out.print("Ingrese un Nº: ");
        Scanner inputN = new Scanner(System.in);
        int n = inputN.nextInt();
        if (esPrimo(n)) {
            System.out.println("El Nº " + n + " es primo!");
        } else {
            System.out.println("El Nº " + n + " no es primo :(");
        }
    }

    public static boolean esPrimo(int n) {
        for(int i=2; i*i<=n; i++){
            if( n%i==0 ){
                return false;
            }
        }
        return true;
    }
}
