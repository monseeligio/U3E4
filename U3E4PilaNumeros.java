package u3e4pilanumeros;

import java.util.Scanner;

public class U3E4PilaNumeros {

    public static void main(String[] args) {
     PilaA pilaA =new PilaA();
     int elemento;
     int opc2=0;
     int opc;
     Scanner LECTOR = new Scanner(System.in);
       do{ 
        System.out.println("\n-------Menu------");
        System.out.println("1. Insertar dato");
        System.out.println("2. eliminar");
        System.out.println("3. Mostrar");
        System.out.println("4. Salir del programa");
        System.out.println("¿Que desea realizar?");
        opc=LECTOR.nextInt();
        switch(opc){
            
            case 1:  
            Scanner Lector2 = new Scanner(System.in);
            int cont=10;
            while (cont>0){     
            System.out.println("inserte un elemento ");
            elemento=Lector2.nextInt();            
            if(elemento>0 && elemento<11){  
            pilaA.empuja(elemento); 
            cont--;
            }       
           else{
            System.out.println("El numero no esta en el rango permitido");          
           }
            }
            break;
            case 2:
            pilaA.Sacarpila();
            break;
            case 3:
            pilaA.mostrarPila();
            pilaA.mostrarPila2();
            break;
            case 4: System.exit(0);break;
            default:System.out.println("No existe esa opcion, por favor intente de nuevo");
        }
        
          System.out.println("\n¿Desea realizar otro proceso? presione 2=NO");
       opc2=LECTOR.nextInt();
       }while(opc2!=4);

    }
}
    
