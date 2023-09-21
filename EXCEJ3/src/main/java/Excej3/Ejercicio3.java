package Excej3;

import Servicio.DivisionNumero;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        DivisionNumero dn = new DivisionNumero();
        System.out.println("Ingrese dos numeros a operarse continuacion");
        System.out.println("Primer Numero");
        String num1 = leer.next();

        System.out.println("Segundo Numero");
        String num2 = leer.next();

        try{
            System.out.println("La Division de: " + num1 + " entre " + num2 + " = " +dn.DivisionNumero(parseInt(num1), parseInt(num2)));
        } catch (ArithmeticException e) {

            System.out.println("Error: division por cero");

        }

    }

}
