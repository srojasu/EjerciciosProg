
package ejercicios;
public class Funciones {
    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static long ackermann(long m, long n) {
        if (m == 0) return n + 1;
        if (m > 0 && n == 0) return ackermann(m - 1, 1);
        return ackermann(m - 1, ackermann(m, n - 1));
    }
}

