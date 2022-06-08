import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.spi.CalendarNameProvider;

public class Main {


    public static void main (String []args) {
    	
    	Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
         
        while(!salir){
             
            System.out.println("1 -- Iniciar Ticket");
            System.out.println("2 -- Cerrar Sesion");
            System.out.println("3 -- Crear Coche");
            System.out.println("4 -- Salir");
            System.out.println("5 -- Crear Tarjeta");
            System.out.println("5 -- Registrarse");
            System.out.println("6 -- Iniciar Sesion");
             
            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
             
            switch(opcion){
                case 1:
                    System.out.println("Has seleccionado la opcion 1");
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    break;
                 case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    break;
                 case 4:
                    salir=true;
                    break;
                 case 5:
                     System.out.println("Has seleccionado la opcion 5");
                     break;
                 case 6:
                     System.out.println("Has seleccionado la opcion 6");
                     break;
                 default:
                    System.out.println("Solo números entre 1 y 6");
            }
             
        }
         
     }
}
