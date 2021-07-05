package com.company;
import java.util.Scanner;

public class EjercicioCuatro {
    public EjercicioCuatro() {
    }

    public static void main(String[] args) {
        System.out.print("Ingrese un Nº: ");
        Scanner inputN = new Scanner(System.in);
        int n = inputN.nextInt();
        int count = 1;

        for(int i=1; count <= n; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
                count++;
            }
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
