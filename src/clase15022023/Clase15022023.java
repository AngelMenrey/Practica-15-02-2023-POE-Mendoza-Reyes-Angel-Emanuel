package clase15022023;
import java.util.Scanner;

public class Clase15022023 {

public static void main(String[] args) {
    
    int opc1;
    String nombre, apellido;
    int opc2;
    
          Scanner lector = new Scanner(System.in);
          Alumno obj1 = new Alumno();
          Alumno obj2 = new Alumno(123,80, "luis","Lopez", 19);
          
          System.out.println("1-Capturar Objeto 1");
          System.out.println("2-Mostrar Objeto 1");
          System.out.println("3-Capturar Objeto 2");
          System.out.println("4-Mostrar Objeto 2");
          System.out.println("5-Salir");
          opc1 = lector.nextInt();
          
    switch(opc1){
    case 1:
        System.out.println("ingrese el nombre");
        nombre = lector.next();
        System.out.println("Ingrese el apellido");
        apellido = lector.next();
        System.out.println("Ingrese la edad");
        opc2 = lector.nextInt();
        System.out.println(" Ingrese el promedio");
        opc2 = lector.nextInt();
        System.out.println("Ingrese el registro");
        opc2 = lector.nextInt();
    break;
    
    case 2:
        System.out.println("el nombre es: "+ obj1.getNombre());
        System.out.println("el apellido es: "+ obj1.getApellido());
        System.out.println("el edad es: "+ obj1.getEdad());
        System.out.println("el promedio es: "+ obj1.getPromedio());
        System.out.println("el registro es: "+ obj1.getRegistro());        
    break;
        
    case 3:
        System.out.println("ingrese el nombre");
        nombre = lector.next();
        System.out.println("Ingrese el apellido");
        apellido = lector.next();
        System.out.println("Ingrese la edad");
        opc2 = lector.nextInt();
        System.out.println(" Ingrese el promedio");
        opc2 = lector.nextInt();
        System.out.println("Ingrese el registro");
        opc2 = lector.nextInt();
    break;
        
    case 4:
       System.out.println("el nombre es: "+ obj2.getNombre());
        System.out.println("el apellido es: "+ obj2.getApellido());
        System.out.println("el edad es: "+ obj2.getEdad());
        System.out.println("el promedio es: "+ obj2.getPromedio());
        System.out.println("el registro es: "+ obj2.getRegistro());  
    break;
        
    default:
    break;
    
}                   
}          
}
    

