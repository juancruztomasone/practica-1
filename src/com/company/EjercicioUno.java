
package com.company;

import java.util.Scanner;

public class EjercicioUno {
    public EjercicioUno() {
    }

    public static void main(String[] args) {
        System.out.print("Ingrese un Nº: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i = 1; i <= n; ++i) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
