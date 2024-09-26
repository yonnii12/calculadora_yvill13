import operaciones.OperacionesCalculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        OperacionesCalculadora calculadora = new OperacionesCalculadora();
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        int operacion;
        double resultado;

        System.out.println("  *****************************************************");
        System.out.println("  *                    CALCULADORA                    *");
        System.out.println("  *****************************************************");

        System.out.print("\nIngrese el primer numero para realizar la operacion deseada: \n");
        num1 = scanner.nextDouble();
        System.out.print("\nIngrese el segundo numero para realizar la operacion deseada: \n");
        num2= scanner.nextDouble();

        System.out.println("\n");
        System.out.println("  *****************************************************");
        System.out.println("  *    PARA CONTINUAR ESCRIBA EN PANTALLA EL NUMERO   *");
        System.out.println("  *       DE LA OPERACION QUE QUIERE REALIZAR         *");
        System.out.println("  *****************************************************");
        System.out.println("  *       1.  Realizar Suma.                          *");
        System.out.println("  *       2.  Realizar Resta.                         *");
        System.out.println("  *       3.  Realizar Multiplicacion.                *");
        System.out.println("  *       4.  Realizar Division                       *");
        System.out.println("  *****************************************************");
        System.out.print("\nSeleccione la operacion deseada: \n");
        do {
            operacion = scanner.nextInt();

            switch (operacion) {
                case 1:
                    resultado = calculadora.sumar(num1, num2);
                    System.out.println("El resultado de la suma es: " + resultado);

                    break;
                case 2:
                    resultado = calculadora.restar(num1, num2);
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;

                case 3:
                    resultado = calculadora.multiplicar(num1, num2);
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = calculadora.dividir(num1, num2);
                        System.out.println("El resultado de la división es: " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
                default:
                    System.out.println("Operación no válida");
                    break;
            }
        }while (operacion != 0);

        scanner.close();




    }
}