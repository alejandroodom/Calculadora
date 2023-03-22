import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, resultado;
        String operador;

        while (true) {
            System.out.println("Introducir un número entero:");
            try {
                num1 = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Valor introducido incorrecto. Inténtelo de nuevo...");
                scanner.nextLine();
                continue;
            }
            System.out.println(num1);

            System.out.println("¿operador? (+ - * / % o s para salir)");
            operador = scanner.next();
            if (operador.equals("s")) {
                break;
            }

            try {
                System.out.println("Introducir un número entero:");
                num2 = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Valor introducido incorrecto. Inténtelo de nuevo...");
                scanner.nextLine();
                continue;
            }
            System.out.println(num2);

            try {
                switch (operador) {
                    case "+":
                        resultado = Operacion.sumar(num1, num2);
                        break;
                    case "-":
                        resultado = Operacion.restar(num1, num2);
                        break;
                    case "*":
                        resultado = Operacion.multiplicar(num1, num2);
                        break;
                    case "/":
                        resultado = Operacion.dividir(num1, num2);
                        break;
                    case "%":
                        resultado = Operacion.modulo(num1, num2);
                        break;
                    default:
                        System.out.println("Operador incorrecto. Inténtelo de nuevo...");
                        continue;
                }
                System.out.println("Resultado: " + resultado);
            } catch (DesbordaCapacidadExcepcion e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}