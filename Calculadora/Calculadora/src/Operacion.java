public class Operacion {

    public static int sumar(int a, int b) throws DesbordaCapacidadExcepcion {
        long resultado = (long)a + (long)b;
        if (resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE) {
            throw new DesbordaCapacidadExcepcion("El resultado desborda la capacidad de esta calculadora");
        }
        return a + b;
    }

    public static int restar(int a, int b) throws DesbordaCapacidadExcepcion {
        long resultado = (long)a - (long)b;
        if (resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE) {
            throw new DesbordaCapacidadExcepcion("El resultado desborda la capacidad de esta calculadora");
        }
        return a - b;
    }

    public static int multiplicar(int a, int b) throws DesbordaCapacidadExcepcion {
        long resultado = (long)a * (long)b;
        if (resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE) {
            throw new DesbordaCapacidadExcepcion("El resultado desborda la capacidad de esta calculadora");
        }
        return a * b;
    }

    public static int dividir(int a, int b) throws DesbordaCapacidadExcepcion {
        if (b == 0) {
            throw new DesbordaCapacidadExcepcion("No se puede dividir entre 0");
        }
        long resultado = (long)a / (long)b;
        if (resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE) {
            throw new DesbordaCapacidadExcepcion("El resultado desborda la capacidad de esta calculadora");
        }
        return a / b;
    }

    public static int modulo(int a, int b) throws DesbordaCapacidadExcepcion {
        if (b == 0) {
            throw new DesbordaCapacidadExcepcion("No se puede dividir entre 0");
        }
        long resultado = (long)a % (long)b;
        if (resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE) {
            throw new DesbordaCapacidadExcepcion("El resultado desborda la capacidad de esta calculadora");
        }
        return a % b;
    }
}
