package operaciones;

public class OperacionesCalculadora {

    private double num1;
    private double num2;

    public OperacionesCalculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sumar(){
     return num1+num2;
    }
    public double restar(){
        return num1-num2;
    }
    public double multiplicar(){
        return num1*num2;
    }
    public double dividir(){
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
            return Double.NaN;
        }
    }

}
