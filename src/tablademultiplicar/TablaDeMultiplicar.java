package tablademultiplicar;  

import java.util.Scanner;  

public class TablaDeMultiplicar {  

    public static void main(String[] args) {  
        
        Scanner teclado = new Scanner(System.in);  
        
        boolean comprobar = true;      
        int numero;  
        
        while(comprobar) {  
            System.out.println("Ingrese un valor positivo:");  
            
            // Intentar leer un número entero  
            try {  
                numero = teclado.nextInt();  
                
                if(numero > 0) {  
                    for(int i = 1; i <= 10; i++) {  
                        System.out.println(numero + " * " + i + " = " + numero * i);  
                    }  
                } else {  
                    System.out.println("Error en el valor ingresado. Inténtelo nuevamente.");  
                }  
                
            } catch (java.util.InputMismatchException e) {  
                System.out.println("Error: debe ingresar un nro entero positivo. Inténtelo nuevamente.");  
                teclado.next(); // Limpiar el buffer en caso de entrada inválida  
            }  
        }  

        teclado.close(); // No olvides cerrar el scanner  
    }  
}
