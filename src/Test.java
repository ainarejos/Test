import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        int a, b;
        double c;
        double[] array1=new double[10];
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce el valor de a: ");
        a=teclado.nextInt();
        System.out.print("Introduce el valor de b: ");
        b=teclado.nextInt();
        System.out.print("Introduce el valor de 0 de array1: ");
        array1[0]=teclado.nextDouble();
        int sum=a+b;
        c=(double)a;
        System.out.println("La suma de a + b es: " + sum);
        System.out.println("El primer valor de la array1 es:" + array1[0]);
        System.out.println("EL valor de c es: " + c);
    }
}
