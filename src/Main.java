import operaciones.OperacionesCalculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){


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


        OperacionesCalculadora calculadora = new OperacionesCalculadora(num1, num2);
        do {
            operacion = scanner.nextInt();



            switch (operacion) {
                case 1:
                    System.out.println("El resultado de la suma es: " + calculadora.sumar());

                    break;
                case 2:
                    System.out.println("El resultado de la resta es: " + calculadora.restar());
                    break;

                case 3:
                    System.out.println("El resultado de la multiplicación es: " + calculadora.multiplicar());
                    break;
                case 4:
                    resultado = calculadora.dividir();
                    if (!Double.isNaN(resultado)) {
                        System.out.println("El resultado de la división es: " + resultado);
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