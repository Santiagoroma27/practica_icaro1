2import java.util.Scanner;

public class CalculadoraPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Calculadora Sencilla");
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Seleccione una operación:"); //Por las dudas consultar si podemos armarla con un botón de reset
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        int opcion = scanner.nextInt();

        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = calculadora.sumar(num1, num2);
                break;
            case 2:
                resultado = calculadora.restar(num1, num2);
                break;
            case 3:
                resultado = calculadora.multiplicar(num1, num2);
                break;
            case 4:
                resultado = calculadora.dividir(num1, num2);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }
}
