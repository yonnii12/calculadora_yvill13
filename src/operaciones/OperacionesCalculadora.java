package operaciones;

public class OperacionesCalculadora {

    private double num1;
    private double num2;
    private int operacion;

    public OperacionesCalculadora(double num1, double num2, int operacion) {
        this.num1 = num1;
        this.num2 = num2;
        this.operacion = operacion;
    }

    public double sumar(double a, double b){
     return a+b;
    }
    public double restar(double a, double b){
        return a-b;
    }
    public double multiplicar(double a, double b){
        return a*b;
    }
    public double dividir(double a, double b){
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
            return Double.NaN;
        }
    }

}
