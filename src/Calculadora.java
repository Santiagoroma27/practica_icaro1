public class Calculadora {
    // Sumar
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    // Restar dos números
    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplicar dos números
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    //dividir dos números
    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: No se puede dividir por cero. Destruiría la sagrada línea del tiempo si lo intentas.");
            return Double.NaN;  // NaN (Not-a-Number) para marcar el error!!!
        }
        return num1 / num2;
    }
}
