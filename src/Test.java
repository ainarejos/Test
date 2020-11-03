import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        // se definen las variables y una array.
        int a, b;
        double c;
        double[] array1=new double[10];
        //se crea el prgrama scanner para pedir los valores de a y b por tecaldo.
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce el valor de a: ");
        a=teclado.nextInt();
        System.out.print("Introduce el valor de b: ");
        b=teclado.nextInt();
        System.out.print("Introduce el valor de 0 de array1: ");
        array1[0]=teclado.nextDouble();
        //se define un valor sum y se etablece la suma de a + b como su valor.
        int sum=a+b;
        //cast
        c=(double)a;
        //Se imprime por pantalla los resultados del programa.
        System.out.println("La suma de a + b es: " + sum);
        System.out.println("El primer valor de la array1 es:" + array1[0]);
        System.out.println("EL valor de c es: " + c);
    }
}
