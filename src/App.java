// ANGEL GABRIEL FLORES CASTILLO, 2024-1357U
import java.util.Scanner;
public class App {

    public static int num1;
    public static int num2;
    public static int num3;
    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);

        do {

            try {
                System.out.println("Ingrese tres numeros enteros diferentes");
                num1 = leer.nextInt();
                num2 = leer.nextInt();
                num3 = leer.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ingrese valores correctos");
                leer.nextLine();
            }
        } while (num1 == num2 || num1 == num3 || num2 == num3);

        //Suma de los dos numeros mas pequenos, resta de los mayores e impresion del mayor
        if ( num1>num2 && num1>num3) {
            System.out.println("La suma de los numeros menores es: " +(num2+num3) );
            if (num1>num2 && num2>num3) {
                System.out.println("La resta de los mayores es: "+(num1-num2) );  
            }
            if (num1>num3 && num3>num2) {
                System.out.println("La resta de los mayores es: "+(num1-num3) );     
             }

            System.out.println("El mayor es " + num1);
        }
         if (num2>num3 && num2>num1) {
            System.out.println("La suma de los numeros menores es: " +(num3+num1) );
            if (num2>num1 && num1>num3) {
                System.out.println("La resta de los mayores es: "+(num2-num1) );     
            }
            if (num2>num3 && num3>num1) {
                System.out.println("La resta de los mayores es: "+(num2-num3) );   
            }
            System.out.println("El mayor es: "+num2);

        }
        if (num3>num1 && num3>num2) {
            System.out.println("La suma de los menores es: "+ (num1+num2)) ;
            if (num3>num1 && num1>num2) {
                    System.out.println("La resta de los mayores es: "+(num3-num1) ) ;
                    
             }
            if (num3>num2 && num2>num1) {
                    System.out.println("La resta de los mayores es: "+(num3-num2) );
                    
            }
            System.out.println("El mayor es: "+num3);
            }
            leer.close();
     }
} 