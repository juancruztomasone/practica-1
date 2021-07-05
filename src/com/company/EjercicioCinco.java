package com.company;
import java.util.Scanner;

public class EjercicioCinco {
    public EjercicioCinco() {
    }

    public static void main(String[] args) {
        //cantidad de numeros a imprimir
        System.out.print("Ingrese cantidad de Nº a mostrar: ");
        Scanner inputN = new Scanner(System.in);
        int n = inputN.nextInt();

        //cantidad de digitos buscados
        System.out.print("Ingrese cantidad de digitos iguales: ");
        Scanner inputM = new Scanner(System.in);
        int m = inputM.nextInt();

        //digito buscado
        System.out.print("Ingrese digito buscado: ");
        Scanner inputD = new Scanner(System.in);
        int d = inputD.nextInt();

        int count = 0;
        int current = 0;

        while(count < n) {
            if(validateNumber(current,m,d)){
                System.out.println(current);
                count++;
            }
            current++;
        }
    }

    public static boolean validateNumber(int number, int nDigits, int digit){
        String numberString = Integer.toString(number);
        char digitString = (char)(digit + '0');

        int countRepet = 0;
        for(int i=0; i<numberString.length(); i++){
            if(numberString.charAt(i) == digitString){
                countRepet++;
            }
        }

        if(countRepet >= nDigits){
            return true;
        }

        return false;
    }



}
