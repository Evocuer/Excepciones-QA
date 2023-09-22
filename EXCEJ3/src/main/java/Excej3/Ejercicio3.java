package Excej3;

import Servicio.DivisionNumero;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        DivisionNumero dn = new DivisionNumero();
        int num1 = 0;
        int num2 = 0;

        System.out.println("Ingrese dos numeros a operarse continuacion");
        System.out.println("Primer Numero");
        String n1 = leer.next();

        System.out.println("Segundo Numero");
        String n2 = leer.next();
        try {
            num1 = parseInt(n1);
            num2 = parseInt(n2);
        }  catch (NumberFormatException e) {
            System.out.println("Error: ingreso invalido");
        }

        try{
            System.out.println("La Division de: " + num1 + " entre " + num2 + " = " +dn.DivisionNumero(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Error: division por cero");
        }

    }

}
