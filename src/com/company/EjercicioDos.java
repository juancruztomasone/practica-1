package com.company;
import java.util.Scanner;

public class EjercicioDos {
    public EjercicioDos() {
    }

    public static void main(String[] args) {
        System.out.print("Ingrese cantidad de multiplos a mostrar: ");
        Scanner inputN = new Scanner(System.in);
        int n = inputN.nextInt();
        System.out.print("Ingrese Nº: ");
        Scanner inputM = new Scanner(System.in);
        int m = inputM.nextInt();

        for(int i = 1; i <= n; ++i) {
            if (m % i == 0) {
                System.out.println(i);
            }
        }

    }
}