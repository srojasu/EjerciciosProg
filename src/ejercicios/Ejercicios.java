package ejercicios;
import java.util.*;


public class Ejercicios {
 
    public static void main(String[] args) {
        //Ejercicio 1
        String frase = "Hola, ya se imprimir frases"; 
        System.out.println("1. " + frase);  //Imprime el string frase
        
        //Ejercicio 2
        int x = 273; //La variable x se crea como un entero y se le asigna un valor
        System.out.println("2. " + x);  //Imprime el entero x
        
        //Ejercicio 3
        double y = 5.333;  //La variable y se crea como un double y se le asigna un valor
        System.out.println("3. " + y);  //Imprime el double y
        
        //Ejercicio 4
        int f = 1234;          //Se crean dos variables de tipo entero y se les asigna valores
        int t = 532;
        int ff = f + t;       //Se crea una variable donde su valor sera la suma de f y t
        System.out.println("4. " + ff);
        
        //Ejercicio 5
        int tt = f- t;       //Se crea una variable donde su valor sera la resta de f y t
        System.out.println("5. " + tt);
        
        //Ejercicio 6
        int nn = f * t;     //Se crea una variable donde su valor sera la multiplicacion de f y t
        System.out.println("6. " + nn);
        
        //Ejercico 7
        float w = (float) f / t;  //Se crea una variable de tipo float ya que se requiere una division
        System.out.println("7. " + w);    //de las variables f y t pero esta division da un numero decimal
        
        //Ejercicio 8
        System.out.print("8. ");
        int q = 3;
        for (int i = 1; i <= q; i++){  //Se crea un bucle for que itera desde 1 hasta q(3)
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        //Ejercicio 9
        System.out.print("9. ");
        int p = 9;
        for (int i = 1; i <= p; i++){  //Se crea un bucle for que itera desde 1 hasta p(9)
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        //Ejercicio 10
        System.out.print("10. ");
        int o = 10000;
        for (int i = 1; i <= o; i++){  //Se crea un bucle for que itera desde 1 hasta o(10000)
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        //Ejercicio 11
        System.out.print("11. ");
        int ini = 5;
        int fin = 10;
        for (int i = ini; i <= fin; i++){ //Se crea un bucle for que itera desde ini(5) hasta fin(10)
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        //Ejercicio 12
        System.out.print("12. ");
        int finn = 15;
        for (int i = ini; i <= finn; i++){  //Se crea un bucle for que itera desde ini(5) hasta finn(15)
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        //Ejercicio 13
        System.out.print("13. ");
        int finnn = 15000;
        for (int i = ini; i <= finnn; i++){  //Se crea un bucle for que itera desde ini(5) hasta finn(15000)
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        //Ejercicio 14
        System.out.print("14. ");
        String palabra = "Hola";
        int rep = 20;
        for (int i = 1; i <= rep; i++){  //Se crea un bucle for que itera desde 1 hasta rep(20), en este caso en vez de
            System.out.print(palabra + " "); //imprimir i, se imprime la palabra hola
        }
        
        System.out.println();
        
        //Ejercicio 15
        System.out.print("15. ");
        int fi= 30;
        for (int i = 1; i <= fi; i++){  //Se crea un bucle for que itera desde 1 hasta fi(30)
            int cua = i * i;            //Para sacar el cuadrado se multiplica cada i por el mismo
            System.out.print(cua + " ");
        }
        
        System.out.println();
        
        //Ejercicio 16
        System.out.print("16. ");
        int z = 20;
        long prod = 1;  //Se usa una variable long ya que el resultado de la maultiplicacion es mayor a lo que almacena un int
        for (int i = 1; i <= z; i++){ //Se crea un bucle for que itera desde 1 hasta z(20)
            prod *= i;                //Multiplica por i en cada repeticion hasta 20
        }
        System.out.print(prod);
        
        System.out.println();
        
        //Ejercicio 17
        System.out.print("17. ");
        int v = 100;
        int sum = 0;
        for (int i = 1; i <= v; i++){ //Se crea un bucle for que itera desde 1 hasta v(100)
            int c = i * i;  
            sum += c;   //Acumula la suma de los cuadrados
            
        }
        System.out.println(sum);
        
        //Ejercicio 18
        System.out.print("18. ");
        Scanner s = new Scanner(System.in);
        System.out.println("Elije un numero: ");
        int num = s.nextInt();
        int num2 = num + 100;  //El limite del bucle sera el el numero elejido +100
        int suma = 0;
        for (int i = num; i <= num2; i++){  //El bucle itera desde el numero elejido n hasta n+100
            suma += i;  //Acumula la suma de los numeros
        }
        System.out.println(suma);
        
        //Ejercicio 19
        System.out.print("19. ");
        Scanner ss = new Scanner(System.in);
        System.out.println("Elije una cantidad de Euros: ");
        double eur = ss.nextDouble();
        double dol = eur * 1.06;  //Los dolares serian la cantidad de euros multiplicado por 1.06 (1 eur = 1.06 usd)
        System.out.println(eur + " euros son " + dol +" dolares");
        
        //Ejercicio 20
        System.out.print("20. ");
        Scanner al = new Scanner(System.in);
        System.out.println("Altura del regtangulo: ");
        double alt = al.nextDouble();
        Scanner an = new Scanner(System.in);
        System.out.println("Ancho del regtangulo: ");
        double anc = an.nextDouble();
        double rec = alt * anc;  //El area del rectangulo es su altura por su ancho
        System.out.println("El area del regtangulo es " + rec);
        
        //Ejercicio 21
        System.out.print("21. ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer número: ");
        int pnum = sc.nextInt();
        System.out.println("Segundo número: ");
        int snum = sc.nextInt();
        if (pnum > snum) { //Se usa un if donde si el primer numero es mayor al segundo imprime este resultado
            System.out.println(pnum + " es el mayor y " + snum + " es el menor");
        } else if (pnum < snum) { //Si el primer numero no es el mayor, se usa un else if para comparar ahora si este es menor
            System.out.println(snum + " es el mayor y " + pnum + " es el menor");
        } else { //Y si ninguna de las dos opciones anteriores son verdaderas se concluye que son iguales ambos numeros
            System.out.println("Los números son iguales");
        }
        
        //Ejercicio 22
        System.out.print("22. ");
        Scanner m = new Scanner(System.in);
        System.out.println("Digita un numero: ");
        int l = m.nextInt();
        System.out.println("Los números impares menores que " + l + " son:");
        for (int i = 1; i < l; i += 2) { ////El bucle itera desde 1 hasta el numero elejido y incrementa de a 2 i para que sean impares
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        //Ejercicio 23
        System.out.print("23. ");
        Scanner aa = new Scanner(System.in);
        System.out.println("Primer numero: ");
        int pm = aa.nextInt();
        System.out.println("Segundo numero: ");
        int sd = aa.nextInt();
        while(true){
            if (sd == 0) {
                    System.out.println("El MCD de los números es: " + pm);
                    break;
                } else {
                    int residuo = pm % sd;
                    pm = sd;
                    sd = residuo;
                }
        }
        
        //Ejercicio 24
        Scanner scanner = new Scanner(System.in);
        System.out.println("24. Coeficiente a: ");
        double ca = scanner.nextDouble();
        System.out.println("Coeficiente b: ");
        double cb = scanner.nextDouble();
        System.out.println("Coeficiente c: ");
        double cc = scanner.nextDouble();
        double dis = cb * cb - 4 * ca * cc;  //Se usa el discriminate de la ecuacion cuadratica para saber si tiene solucion
        if (ca == 0) {         //Si el coeficiente a es 0 no es una ecuacion de segundo grado
            System.out.println("Esto no es una ecuación de segundo grado.");
        } else if (dis < 0) { //Si el discriminate es negativo la ecuacion no tiene soluciones reales
            System.out.println("La ecuación no tiene soluciones reales.");
        } else if (dis == 0) { //Si el discriminate es 0 la ecuacion solo tiene una solucion
            double xx = -cb / (2 * ca);
            System.out.println("La ecuación tiene una única solución: x = " + xx);
        } else {   //Si el discriminate es positivo la ecuacion tiene dos soluciones
            double x1 = (-cb + Math.sqrt(dis)) / (2 * ca);
            double x2 = (-cb - Math.sqrt(dis)) / (2 * ca);
            System.out.println("La ecuación tiene dos soluciones reales:");
            System.out.println("x = " + x1);
            System.out.println("x = " + x2);
        }
        
        //Ejercicio 25: Para este ejercicio cree una clase Funciones que tiene dos metodos, el que calcula el factorial y los valores de la funcion ackermann
        Scanner ee = new Scanner(System.in);
        System.out.println("25. Introduce el valor de n: ");
        int mm = ee.nextInt();
        System.out.println("Introduce el valor de x");
        int pp = ee.nextInt();
        System.out.println("Introduce el valor de y");
        int kk = ee.nextInt();
        System.out.println("Factorial de " + mm + ": " + Funciones.factorial(mm));//Se llama a la clase Funciones implementando el metodo factorial
        System.out.println("Ackermann(" + pp + "," + kk + "): " + Funciones.ackermann(pp, kk)); //Se llama a la clase Funciones implementando el metodo ackermann
        
        //Ejercicio 26
        Scanner gg = new Scanner(System.in);
        System.out.println("26. Primer numero: ");
        int n1 = gg.nextInt();
        System.out.println("Segundo numero: ");
        int n2 = gg.nextInt();
        System.out.println("Tercer numero: ");
        int n3 = scanner.nextInt();
        int mayor = Math.max(n1, Math.max(n2, n3));//Se usa el metodo max de la clase Math para encontrar el numero mayor
        int menor = Math.min(n1, Math.min(n2, n3));//Se usa el metodo min de la clase Math para encontrar el numero menor
        System.out.println("El mayor de los números es: " + mayor);
        System.out.println("El menor de los números es: " + menor);
        
        //Ejercicio 27
        Scanner uu = new Scanner(System.in);
        while (true) {
            System.out.println("27. Introduce una temperatura en Fahrenheit (o 999 para terminar): ");
            double fah = uu.nextDouble();
            if (fah == 999) {
                System.out.println("Programa terminado.");
                break;  //Si se introduce 999 como temperatura el programa finalizara
            }
            double celsius = 5.0 / 9.0 * (fah - 32);
            System.out.println("La temperatura en Celsius es: " + celsius);
        }
        
        //Ejercicio 28
        System.out.println("28. ");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración " + i + ":");
            switch (i) {
                case 1:
                    System.out.println("El número es uno.");
                    break;
                case 2:
                    System.out.println("El número es dos.");
                    break;
                case 3:
                    System.out.println("El número es tres.");
                    break;
                case 4:
                    System.out.println("El número es cuatro.");
                    break;
                case 5:
                    System.out.println("El número es cinco.");
                    break;
            }
            System.out.println();
        }
        
        //Ejercicio 30
        int lim = 30; //Hasta este numero se buscaran numeros primos
        System.out.println("30. Números primos hasta " + lim + ":");
        for (int rr = 2; rr <= lim; rr++) { //El primer bucle recorre los numeros desde 2 hasta el limite
            boolean Primo = true;  // Se asume que el número es primo
            for (int i = 2; i <= rr; i++) { //El segundo blucle verifica para cada numero si este es divisible por otro numero aparte de 1 y si mismo
                if (rr % i == 0) {             
                    Primo = false;
                    break;
                }
            }
            if (Primo) {
                System.out.println(rr);
            }
        }
        
        


    }
    
}
