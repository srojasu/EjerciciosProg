package ejercicios;
import java.util.*;


public class Ejercicios {
 
    public static void main(String[] args) {
        //Ejercicio 1
        String frase = "Hola, ya se imprimir frases";
        System.out.println(frase);
        
        //Ejercicio 2
        int x = 273;
        System.out.println(x);
        
        //Ejercicio 3
        double y = 5.333;
        System.out.println(y);
        
        //Ejercicio 4
        int f = 1234;
        int t = 532;
        System.out.println(f + t);
        
        //Ejercicio 5
        System.out.println(f - t);
        
        //Ejercicio 6
        System.out.println(f * t);
        
        //Ejercico 7
        float w = (float) f / t;
        System.out.println(w);
        
        //Ejercicio 8
        int q = 3;
        for (int i = 1; i <= q; i++){
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        //Ejercicio 9
        int p = 9;
        for (int i = 1; i <= p; i++){
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        //Ejercicio 10
        int o = 10000;
        for (int i = 1; i <= o; i++){
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        //Ejercicio 11
        int ini = 5;
        int fin = 10;
        for (int i = ini; i <= fin; i++){
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        //Ejercicio 12
        int finn = 15;
        for (int i = ini; i <= finn; i++){
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        //Ejercicio 13
        int finnn = 15000;
        for (int i = ini; i <= finnn; i++){
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        //Ejercicio 14
        String palabra = "Hola";
        int rep = 20;
        for (int i = 1; i <= rep; i++){
            System.out.print(palabra + " ");
        }
        
        System.out.println();
        
        //Ejercicio 15
        int fi= 30;
        for (int i = 1; i <= fi; i++){
            int cua = i * i;
            System.out.print(cua + " ");
        }
        
        System.out.println();
        
        //Ejercicio 16
        int z = 20;
        long prod = 1;
        for (int i = 1; i <= z; i++){
            prod *= i;
        }
        System.out.print(prod);
        
        System.out.println();
        
        //Ejercicio 17
        int v = 100;
        int sum = 0;
        for (int i = 1; i <= v; i++){
            int c = i * i;
            sum += c;
            
        }
        System.out.println(sum);
        
        //Ejercicio 18
        Scanner s = new Scanner(System.in);
        System.out.println("Elije un numero: ");
        int num = s.nextInt();
        int num2 = num + 100;
        int suma = 0;
        for (int i = num; i <= num2; i++){
            suma += i;
        }
        System.out.println(suma);
        
        //Ejercicio 19
        Scanner ss = new Scanner(System.in);
        System.out.println("Elije una cantidad de Euros: ");
        double eur = ss.nextDouble();
        double dol = eur * 1.06;
        System.out.println(eur + " euros son " + dol +" dolares");
        
        //Ejercicio 20
        Scanner al = new Scanner(System.in);
        System.out.println("Altura del regtangulo: ");
        double alt = al.nextDouble();
        Scanner an = new Scanner(System.in);
        System.out.println("Ancho del regtangulo: ");
        double anc = an.nextDouble();
        double rec = alt * anc;
        System.out.println("El area del regtangulo es " + rec);
        
        //Ejercicio 21
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primer número: ");
        int pnum = scanner.nextInt();
        System.out.println("Introduce el segundo número: ");
        int snum = scanner.nextInt();
        if (pnum > snum) {
            System.out.println(pnum + " es el mayor y " + snum + " es el menor");
        } else if (pnum < snum) {
            System.out.println(snum + " es el mayor y " + pnum + " es el menor");
        } else {
            System.out.println("Los números son iguales");
        }
        
        //Ejercicio 22
        
         
    }
    
}
